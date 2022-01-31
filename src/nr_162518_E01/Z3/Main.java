package nr_162518_E01.Z3;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        File[] a = new File[3];
        a[0] = new File("D:\\Games");
        a[1] = new File("D:\\coś");
        a[2] = new File("D:\\PULPIT\\se.txt");

        sortuj(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+",");
        }


    }

    static void sortuj(File[] files){
        Arrays.sort(files, (o1, o2) -> {
            if(!o1.isDirectory() && o2.isDirectory()){
                return -1;
            }
            else if(o1.isDirectory() && !o2.isDirectory()){
                return 1;
            }
            else return o1.compareTo(o2);
        });
    }
}
