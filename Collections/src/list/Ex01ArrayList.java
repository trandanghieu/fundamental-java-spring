package list;

import java.util.*;
import java.util.function.Predicate;
/*
    Interface List<E>
    + boolean add(int index, E)
    + boolean addAll(int index, Collection<E>
    + void clear()
    + boolean contains(Object o)
    + boolean containsAll(Collection c)
    + E get(int index)
    + indexOf(Object)
    + lastIndexOf(Object)
    + E remove(int index)
    + E set(int index, E)
    + Iterator<E> iterator()
    + ListIterator<E> listIterator()
    + List<E> subList(int fromIndex, int toIndex)
    + int size()
    + boolean isEmpty()
 */

public class Ex01ArrayList {
    public static void main(String[] args) {
        List<String> sequences = new ArrayList<>();
        sequences.add("Gate");
        sequences.add("Beckham");
        sequences.add("Ronaldo");
        sequences.add("Messi");
        sequences.add("Folden");
        sequences.add("Casilas");
        sequences.add("Marcelo");
        sequences.add("Cavajal");

        System.out.println(sequences.get(2));

        //sequences.clear();
        //System.out.println(sequences);


        sequences.removeIf(s -> {
            if(s.startsWith("C")){
                return  true;
            }
            return false;
        });

        iterate(sequences);

        List<String> sequencesa = Arrays.asList("a","b","c");
        sequences.contains(new String("a"));
        System.out.println(sequences.size());


    }

    public static void iterate(List<String> sequences){
        Iterator<String> each = sequences.iterator();
        while (each.hasNext()){
            String element = each.next();
            System.out.print(element + ",");
        }
    }
}
