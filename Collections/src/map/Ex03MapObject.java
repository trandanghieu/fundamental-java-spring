package map;

import bean.Employee;

import java.util.*;

public class Ex03MapObject {
    public static void main(String[] args) {
        List<Employee> teamA = Arrays.asList(new Employee(11,"Terry", 7d, 1),
                                             new Employee(12,"Rashfore", 6d, 1));

        List<Employee> teamB = Arrays.asList(new Employee(21,"Greenwood", 9d, 2),
                                             new Employee(22,"Terry", 5d, 2));
        List<Employee> teamC = Arrays.asList(new Employee(31,"Greenwood", 9d, 3),
                                             new Employee(32,"Terry", 5d, 3));

        //put ->> exits ? hashcode, equals KEY
        //hashcode: default = address
        //          overide = caculate value from input ( normalis object's attribute)
        // equals: default: compare address
        //         overide: return true/false
        // equal id -> true => trùng id, >>> hashcode = nhau
        // equal theo thuộc tính gì thì nên hash theo thuộc tính đó
        // Map - Set :: HashTable -> must overide hashCode

        Map<Employee, List<Employee>> teams = new HashMap<>();
        teams.put(new Employee(1,"John", 10d,null),teamA);
        teams.put(new Employee(2,"Linda", 11d,null),teamB);
        teams.put(new Employee(3,"TenHag", 11d,null),teamC);
        teams.put(new Employee(3,"TenHag", 11d,null),teamC);


        System.out.println("Size: " + teams.size());



    }
}
