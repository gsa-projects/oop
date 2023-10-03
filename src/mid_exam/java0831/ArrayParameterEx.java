package mid_exam.java0831;

public class ArrayParameterEx {
    static void replaceSpace(char a[], char to) {
//        for (char c : a) {
//            if (c == ' ')
//                c = to;
//        }

//        char c;
//        for (int i = 0; i < a.length; i++) {
//            c = a[i];
//            if (c == ' ')
//                c = to;
//        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ')
                a[i] = to;
        }
    }

    static void printCharArray(char a[]) {
        for (char c : a) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
//        char c2[] = "This is a pencil.";    // 안되네

        printCharArray(c);
        replaceSpace(c, '|');
        printCharArray(c);
    }
}
