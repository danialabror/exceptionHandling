
import java.io.*;

//public class latihan1 {
//    public static void main(String[] args)  {
//        int n = 0;
//        n = System.in.read();
//        System.out.println((char) n);
//    }
//}

public class latihan1 {
    public static void main(String[] args)  {
        int n = 0;
        try {
            n = System.in.read();
            System.out.println("Hasil:" + (char) n);
        }catch (IOException e){
            System.err.print("INI ERROR");
        }
    }
}


