package final_exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest = new File("copied/wave_slow.jpg");

        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
