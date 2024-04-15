package strategypattern;

import bean.Trader;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex07ConstructorReferenceInUse {
    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("trader.txt");
        Function<String, Trader> f = new Function<String, Trader>() {
            @Override
            public Trader apply(String s) {
                Trader trader = null;
                String[] tokens = s.split("-");
                if (tokens.length == 2) {
                    trader = new Trader(tokens[0], tokens[1]);
                }
                return trader;
            }
        };

        List<Trader> traderList1 = convert(lines, line -> new Trader());
        List<Trader> traderList2 = convert(lines, Trader::new);
        List<Trader> traderList3 = convert(lines, s -> Trader.transfer(s));

        traderList2.forEach(System.out::println);


    }

    public static <T> List<T> convert(List<String> lines, Function<String, T> function) {
        List<T> traders = new ArrayList<>();
        for (String line : lines) {
            //
            T t = function.apply(line);
            if(t!=null){
                traders.add(t);
            }
        }
        return traders;
    }
}
