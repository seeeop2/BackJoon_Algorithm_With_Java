import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n % 8 == 1) {
            System.out.println("1");
        } else if(n % 8 == 2 || n % 8 == 0) {
            System.out.println("2");
        } else if(n % 8 == 3 || n % 8 == 7) {
            System.out.println("3");
        } else if(n % 8 == 4 || n % 8 == 6) {
            System.out.println("4");
        } else {
            System.out.println("5");
        }
    }
}