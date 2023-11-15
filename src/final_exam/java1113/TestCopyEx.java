package final_exam.java1113;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyEx {
    public static void main(String[] args) {
        File src = new File("data/char.txt");
        File dest = new File("data/char2.txt");
        int c;

        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);

            while ((c = fr.read()) != -1) {
                fw.write((char) c);
            }

            fr.close();
            fw.close();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
