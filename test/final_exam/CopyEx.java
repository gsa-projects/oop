package final_exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest1 = new File("copied/wave.jpg");
        File dest2 = new File("copied/wave_fast.jpg");

        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest1);

            int c;
            long start = System.currentTimeMillis();
            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }
            long end = System.currentTimeMillis();
            System.out.println("Copy: " + (end - start) + "ms");

            fi = new FileInputStream(src);
            fo = new FileOutputStream(dest2);

            byte[] buf = new byte[10*1024];
            start = System.currentTimeMillis();
            while (true) {
                int n = fi.read(buf);
                fo.write(buf, 0, n);
                if (n < buf.length)
                    break;
            }
            end = System.currentTimeMillis();
            System.out.println("Fast Copy: " + (end - start) + "ms");

            fi.close();
            fo.close();
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
