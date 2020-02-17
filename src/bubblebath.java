import java.util.Arrays;
import java.util.Scanner;

public class bubblebath {
    public static void main(String[] args) {
        int[] num = new int[0];
        int input;
        System.out.println("Bitte gib die zu sortierenden Zahlen ein:");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("q") && !scanner.hasNext("Q")){

            input = scanner.nextInt();
            int[] temp = new int[num.length + 1];
            for (int i = 0; i < num.length; i++) {
                temp[i] = num[i];
            }
            temp[num.length] = input;
            num = temp;
        }
        System.out.println("Deine Zahlen sind:     " + Arrays.toString(num));

        for(int i=1; i<num.length; i++) {
            for (int n = 0; n < (num.length - i); n++){
                if(num[n+1]<num[n]){
                    int temp = num[n];
                    num[n] = num[n+1];
                    num[n+1] = temp;
                }
            }

        }
        System.out.println("Die sortierten Zahlen: " + Arrays.toString(num));
    }
}
