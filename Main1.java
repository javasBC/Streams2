import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees= asList(
                new Employee(5,"grey",2,7200),
                new Employee(4,"shai",2,14200),
                new Employee(1,"liad",1,60500),
                new Employee(2,"assaf",14,11800),
                new Employee(3,"oz",2,6100)
        );

        //var counter =employees.stream()
        //        .filter(emp->emp.getFloor()==2)
        //        .count();
//
        //System.out.println(counter);
//
        //var result = employees.stream()
        //        .max(Comparator.comparing(Employee::getId));
        //System.out.println(result.orElse(new Employee()));
//
        //Optional<Integer> hodi= Optional.ofNullable(Integer.valueOf(22));
        //System.out.println(hodi.orElse(3));
//
//
//
        //var min1 = employees.stream()
        //        .min(Comparator.comparing(Employee::getName));
        //System.out.println(min1.get());
//
        //var res = employees.stream()
        //                .noneMatch(emp->emp.getFloor()>200);
//
        //System.out.println(res);


        var emlist= employees.stream()
                .map(emp->emp.getName())
                .collect(Collectors.toMap(t->t,t->t.length()))
                ;


        System.out.println(emlist);
        var emlist2= employees.stream()
                .collect(Collectors.groupingBy(emp->emp.getName().length()))
                ;
        System.out.println(emlist2);


        var emlist3= employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(" -> "))
                ;
        System.out.println(emlist3);


    }
}
