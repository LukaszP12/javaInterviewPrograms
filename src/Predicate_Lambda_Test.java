import java.util.function.Predicate;

public class Predicate_Lambda_Test {

    public static void main(String[] args) {
        Book book = new Book(39.99, "twarda");
        Predicate<Book> checkPrice = book1 -> book1.getPrice() > 29.99;

        if (checkPrice.test(book)){
            System.out.println("Drogo!");
        }

        Predicate<Book> checkCover = book2 -> book2.getCover().equals("twarda");

        if (checkCover.and(checkPrice).test(book)){
            System.out.println("Tanio!");
        }

        //Metoda or działa podobnie jak end ale na wyrażeniu OR
        if(checkCover.or(checkPrice).test(book)){
            System.out.println("Tanio lub drogo!");
        }

    }


}
