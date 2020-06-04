import java.io.IOException;

public class latihan2 {
    public static void main (String [] args){
        byte[] b =  new byte[5];
        try {
            System.in.read(b);
            System.out.println("hasil = " + (char)b[0] + (char)b[1] + (char)b[2] );
        }catch (IOException e) {
            System.err.println("Error");
        }
    }
}
