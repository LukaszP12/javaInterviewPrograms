//Program który pobierze od użytkownika cztery łańcuchy znaków, które umieścisz w liście.
//Następnie posortuj tę listę używając metody sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 4 łańcuchy znaków oddielając je znakiem nowej linii: ");
        List<String> strings = new ArrayList<>();

        for (int i=0; i<4; i++){
            strings.add(scanner.nextLine());
        }

        System.out.println(strings);
        strings.sort((a,b) -> b.length() - a.length());
        System.out.println(strings);

    }

}
