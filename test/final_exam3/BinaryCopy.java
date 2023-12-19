package final_exam3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest = new File("copied/wave2.jpg");

        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }

            fi.close();
            fo.close();
            System.out.println("copy complete");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
