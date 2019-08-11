import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class FuncInter {

    public static void main(String[] args) {

        BiConsumer<Double,Double> biConsumer = (x,y) -> {
            System.out.println("Dodawanie: " + (x + y));
        };
       // biConsumer.accept(1.0, 2.0);

        //Metoda andThen służy do wykonania operacji na kilku obiektach typu BiConsumer
        BiConsumer<Double,Double> biConsumer1 = (x,y) -> {
            System.out.println("Mnożenie: " + (x*y));
        };

        BiConsumer<Double,Double> biConsumer2 = (x,y) -> {
            System.out.println("Dzielenie " + (x/y));
        };

        biConsumer.andThen(biConsumer1).andThen(biConsumer2).accept(3.0,2.0);

        BiFunction<Double,Double,Double> biFunction = (x,y) -> {
            return x + y;
        };
        System.out.println(biFunction.apply(1.0,1.0));

        //BinaryOperator rozszerza interfejs BiFunction
        //BinaryOperator dziąła tylko na jednym i takim samym typie
        //BinaryOperator posiada dwie metody default minBy oraz maxBy
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
        System.out.println(binaryOperator.apply(4,5));

        //Jeżeli chcemy użyć metody minBy musimy zdefiniować Comparator
        BinaryOperator<Integer> biByMin = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(biByMin.apply(5,7));

        BinaryOperator<Integer> biByMax = BinaryOperator.maxBy(Integer::compareTo);
        System.out.println(biByMax.apply(123123, 897797789));
    }

}
