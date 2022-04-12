import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(101,"manpreet",Arrays.asList("123","234")),
                (new Employee(102,"Abhay",Arrays.asList("456","789"))),
                new Employee(103,"param",Arrays.asList("432","890")));
        List<String> names=emp.stream().map(c->c.getName()).collect(Collectors.toList());
        System.out.println(names);
        List<List<String>> phone=emp.stream().map(c->c.getPhoneNo()).collect(Collectors.toList());
        System.out.println(phone);
        List<String> phones=emp.stream().flatMap(c->c.getPhoneNo().stream()).collect(Collectors.toList());
        System.out.println(phones);

    }
}
