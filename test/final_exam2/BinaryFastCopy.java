package final_exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFastCopy {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest = new File("copied/wave_fast.jpg");

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            byte[] buf = new byte[10*1024];

            while (true) {
                int n = fi.read(buf);
                System.out.println(n);
                fo.write(buf, 0, n);
                if (n < buf.length)
                    break;
            }

        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
