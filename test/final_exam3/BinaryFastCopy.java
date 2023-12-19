package final_exam3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFastCopy {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest = new File("copied/wave3.jpg");

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            byte[] buf = new byte[10*1024];
            while (true) {
                int n = fi.read(buf);
                fo.write(buf, 0, n);
                if (n < buf.length) {
                    break;
                }
            }

            fi.close();
            fo.close();
            System.out.println("copy complete");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
