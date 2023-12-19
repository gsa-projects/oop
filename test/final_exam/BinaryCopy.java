package final_exam;

import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("images/wave.jpg");
        File dest = new File("copied/wave.jpg");

        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);

            long start = System.currentTimeMillis();
            while ((c = fi.read()) != -1) {     // fi.read() 함수는 int 타입을 반환
                fo.write((byte) c);     // fo.write() 함수는 int 타입을 받음. 이거 byte 형변환 안해도 됨
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
