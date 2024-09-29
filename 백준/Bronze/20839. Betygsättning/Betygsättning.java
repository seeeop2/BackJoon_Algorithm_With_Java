import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputScores = br.readLine().split(" ");
        int maxScoreA = Integer.parseInt(inputScores[0]);
        int maxScoreB = Integer.parseInt(inputScores[1]);
        int maxScoreC = Integer.parseInt(inputScores[2]);

        String[] studentScores = br.readLine().split(" ");
        int studentScoreA = Integer.parseInt(studentScores[0]);
        int studentScoreB = Integer.parseInt(studentScores[1]);
        int studentScoreC = Integer.parseInt(studentScores[2]);

        String grade = "E";

        if (studentScoreB >= (maxScoreB + 1) / 2) {
            grade = "D";
            if (studentScoreB == maxScoreB) {
                grade = "C";
                if (studentScoreA >= (maxScoreA + 1) / 2) {
                    grade = "B";
                    if (studentScoreA == maxScoreA) {
                        grade = "A";
                    }
                }
            }
        }

        bw.write(grade);
        bw.flush();
        br.close();
        bw.close();
    }
}
