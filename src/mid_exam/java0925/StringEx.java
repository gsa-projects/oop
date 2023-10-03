package mid_exam.java0925;

public class StringEx {
    public static void main(String[] args) {
        String a = new String(" C#");
        String b = new String(",C++ ");

        System.out.println(a + "의 길이는 " + a.length());
        System.out.println(a.contains("#"));

        a = a.concat(b);
        System.out.println('"' + a + '"');

        a = a.trim();
        System.out.println('"' + a + '"');

        a = a.replace("C#", "Java");
        System.out.println('"' + a + '"');

        String splited[] = a.split(",");
        for (int i = 0; i < splited.length; i++) {
            System.out.printf("분리된 문자열[%d]: \"%s\"\n", i + 1, splited[i]);
        }

        a = a.substring(5);
        System.out.println(a);

        char c = a.charAt(2);
        System.out.println(c);
    }
}
