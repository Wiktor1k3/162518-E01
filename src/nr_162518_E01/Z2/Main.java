package nr_162518_E01.Z2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<String> b = new ArrayList<>();
        b.add("Ala");
        b.add("Janek");
        b.add("Zosia");
        b.add("Maja");
        printMarginal(b);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);
        c.add(5);
        c.add(1);
        c.add(7);
        printMarginal(c);

        ArrayList<Character> d = new ArrayList<>();
        d.add('a');
        d.add('b');
        d.add('m');
        printMarginal(d);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate ld1 = LocalDate.parse("2013 12 10", formatter);
        LocalDate ld2 = LocalDate.parse("2011 09 23", formatter);
        LocalDate ld3 = LocalDate.parse("2023 10 01", formatter);

        ArrayList<LocalDate> e = new ArrayList<>();
        e.add(ld1);
        e.add(ld2);
        e.add(ld3);
        printMarginal(e);

    }


    static <T extends Iterable<?>> void printMarginal(T obiekt){
        var a = obiekt.iterator();
        int l=0;
        while (a.hasNext()){
            if(l==0){
                System.out.println(a.next());
                l++;
            }
            var g = a.next();
            if(!a.hasNext()){
                System.out.println(g);
            }
        }
    }
}
