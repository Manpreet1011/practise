import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Dish> dish = Arrays.asList(
                Dish.builder().name("Samosa")
                        .dishType(DishType.VEG)
                        .cost(12.99)
                        .ingredients(Arrays.asList("Potato", "Onion", "Spices"))
                        .build(),
                Dish.builder().name("Butter Chicken")
                        .dishType(DishType.NON_VEG)
                        .cost(14.99)
                        .ingredients(Arrays.asList("Chicken", "Spices", "Butter"))
                        .build(),
                Dish.builder().name("Pizza")
                        .dishType(DishType.VEG)
                        .cost(12.99)
                        .ingredients(Arrays.asList("Butter", "Tomato", "Spices"))
                        .build()
                );
        List<String> names=dish.stream().map(d->d.getName()).collect(Collectors.toList());
        System.out.println(names);
        List<Dish> veg=dish.stream().filter(c->c.getDishType()==DishType.VEG).collect(Collectors.toList());
        System.out.println(veg);
        List<Dish> costinc=dish.stream().filter(c->c.getDishType()==DishType.NON_VEG).map(d->{d.setCost(d.getCost()+2);return d;}).collect(Collectors.toList());
        //List<String> price=dish.stream().map(c->{c.setCost(c.getCost()+2);return c;}).collect(Collectors.toList());
        System.out.println(costinc);
       // System.out.println(dish);
        Optional<Double> max=dish.stream().map(d->d.getCost()).max(Comparator.naturalOrder());
       // System.out.println(max);
        max.ifPresent(System.out::println);
        Map<DishType,List<Dish>> map=dish.stream().collect(Collectors.groupingBy(Dish::getDishType));
        System.out.println(map);
        List<String> ingred=dish.stream().flatMap(dish1 -> dish1.getIngredients().stream()).distinct().collect(Collectors.toList());
        System.out.println(ingred);

    }
}
