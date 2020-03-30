package StreamsLambda;

import Main.Main;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main_Sort {

    public static void main(String[] args) {

        Main_Sort main = new Main_Sort();
        main.run();
    }

    /*    Comparator<String> c = Comparator.comparingInt(String::length);
        names.sort(c);

        names.sort((o1, o2) -> {
            System.out.println(o1);
            return Integer.compare(o1.length(),o2.length());
        });

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        System.out.println(names);
    } */

    private void modifyAndDisplay(List<String> names, Modifier modifier){
        List<String> modifiedNames = new ArrayList<>();

        for (String name : names){
            String modifiedName = modify(name,modifier);
            modifiedNames.add(modifiedName);
        }
    }

    private void run(){
        List<String> names = new ArrayList<>();
        names.add("Genofewa");
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jaroslaw");

        names = filter(names, new Filter() {
            @Override
            public boolean filter(String input) {
                return input.endsWith("a");
            }
        });
        modifyAndDisplay(names,n -> n + "!");
    }

    private List<String> filter(List<String> input,Filter filter){
        List<String> result = new ArrayList<>();
        for (String name : input){
            if(filter.filter(name)){
                result.add(name);
            }
        }
        return result;
    };

    private String modify(String string, Modifier modifier){
        return modifier.modify(string);
        }


}
