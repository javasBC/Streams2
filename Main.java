import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        var employees= asList(
                new Employee(5,"grey",3,7200),
                new Employee(4,"shai",2,14200),
                new Employee(1,"liad",1,60500),
                new Employee(2,"assaf",14,11800),
                new Employee(3,"oz",2,6100)
        );
        System.out.println("////////////////////////////////1/////////////////////////////////");
        employees.stream().forEach(System.out::println);
        System.out.println("////////////////////////////////2/////////////////////////////////");
        employees.stream()
                .filter(n -> n.getSalary()>10_000)
                .forEach(System.out::println);
        System.out.println("////////////////////////////////3//////////////////////////////////");
        employees.stream()
                .sorted(Comparator.comparing(emp -> emp.getId()))
                .forEach(System.out::println);
        System.out.println("////////////////////////////////4//////////////////////////////////");
        employees.stream()
                .map(emp -> emp.getName())
                .forEach(System.out::println);
        System.out.println("////////////////////////////////5//////////////////////////////////");
        var listoflistofemp= List.of(
                asList(new Employee(5,"grey",3,7200),
                        new Employee(4,"shai",2,14200),
                        new Employee(1,"liad",1,60500)),
                asList(new Employee(5,"grey",3,7200),
                        new Employee(4,"shai",2,14200),
                        new Employee(1,"liad",1,60500)),
                asList(new Employee(5,"grey",3,7200),
                        new Employee(4,"shai",2,14200),
                        new Employee(1,"liad",1,60500))
        );
        listoflistofemp.stream()
                .flatMap(loe->loe.stream())
                .forEach(System.out::println);
        ;
        System.out.println("////////////////////////////////6//////////////////////////////////");
        employees.stream()
                .filter(emp -> emp.getSalary()>10_000)
                .peek(emp-> System.out.println("filter:: "+emp))
                .map(emp-> emp.getName())
                .peek(emp-> System.out.println("map to String:: "+emp))
                .map(str->str.length())
                .forEach(i-> System.out.println("INT :: "+i));

        ;
        System.out.println("////////////////////////////////8//////////////////////////////////");
        Stream.iterate(1,n->n+2)
                .limit((int)(30/2))
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        Stream.iterate(1,n->n+2)
                .takeWhile(n->n<30)
                .forEach(System.out::println);

    }
}
