package final_exam;

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
            byte[] buf = new byte[1024*10];     // 10KB

            long start = System.currentTimeMillis();
            while (true) {
                int n = fi.read(buf);   // n은 실제 읽은 바이트
                fo.write(buf, 0, n);    // fo.write(buf[0:n]) 했다는 뜻
                if (n < buf.length)     // 10KB보다 작게 읽었다 == 마지막 배치였다
                    break;
            }
            long end = System.currentTimeMillis();

            fi.close();
            fo.close();
            System.out.println("copied: \"" + src.getPath() + "\" -> \"" + dest.getPath() + "\" (" + (end - start) + "ms)");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
