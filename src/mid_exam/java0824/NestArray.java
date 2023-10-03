package mid_exam.java0824;

public class NestArray {
    public static void main(String[] args) {
        double scores[][] = {
            {3.3, 3.4},
            {3.5, 3.6},
            {3.7, 4.0},
            {4.1, 4.2}
        };

        double sum = 0;
        double count = scores.length * scores[0].length;

        for (double[] year : scores) {
            for (double score : year) {
                sum += score;
            }
        }
//        for (int i = 0; i < scores.length; i++) {
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//            }
//        }

        System.out.println("4년 전체 평점 평균은 " + sum / count);
    }
}
