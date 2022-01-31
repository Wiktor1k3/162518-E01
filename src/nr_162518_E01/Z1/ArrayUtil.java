package nr_162518_E01.Z1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtil {
    static <T extends Comparable<?>> boolean jestPalindromem(T[] obiekty){
        var a = new ArrayList<>(Arrays.asList(obiekty));
        var b = new ArrayList<>(a);
        Collections.reverse(a);
        return a.equals(b);
    }
}
