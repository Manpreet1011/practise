import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Abs","nas","cse","bsd");
//        Comparator<String> comparator=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
        names.sort(String::compareTo);
        System.out.println(names);
    }
}
