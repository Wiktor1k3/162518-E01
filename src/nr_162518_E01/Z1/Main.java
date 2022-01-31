package nr_162518_E01.Z1;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

        Integer[] a = new Integer[3];
        a[0]=2;
        a[1]=3;
        a[2]=2;

        System.out.println(ArrayUtil.jestPalindromem(a));

        LocalTime[] b = new LocalTime[3];
        b[0] = LocalTime.parse("12:12");
        b[1] = LocalTime.parse("10:12");
        b[2] = LocalTime.parse("11:12");

        System.out.println(ArrayUtil.jestPalindromem(b));


    }
}
