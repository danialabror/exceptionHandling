import java.io.IOException;

public class latihan3 {
    public static void main (String [] args ) throws IOException {
        byte[] b =  new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try {
            System.in.read(b);
        }catch (java.io.IOException);
        int N = Integer.valueOf(b).intValue();
        System.out.println("Hasil : " + (N+2));
    }
}
