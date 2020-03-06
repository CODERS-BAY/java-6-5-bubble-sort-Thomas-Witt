import java.util.Arrays;
import java.util.Scanner;

public class bubblebath {
    public static void main(String[] args) {
        int[] num = new int[0];
        Scanner scanner = new Scanner(System.in);
        num = giveMeAllTheNumbers(num, scanner);
        System.out.println("Deine Zahlen sind:     " + Arrays.toString(num));
        bubbelySortyThingy(num);
        System.out.println("Die sortierten Zahlen: " + Arrays.toString(num));
    }

    private static void bubbelySortyThingy(int[] num) {
        for(int i=1; i<num.length; i++) {
            for (int n = 0; n < (num.length - i); n++){
                if(num[n+1]<num[n]){
                    int temp = num[n];
                    num[n] = num[n+1];
                    num[n+1] = temp;
                }
            }
        }
    }

    private static int[] giveMeAllTheNumbers(int[] num, Scanner scanner) {
        System.out.println("Bitte gib die zu sortierenden Zahlen ein:");
        int input;
        while (!scanner.hasNext("q") && !scanner.hasNext("Q")){
            input = scanner.nextInt();
            int[] temp = new int[num.length + 1];
            for (int i = 0; i < num.length; i++) {
                temp[i] = num[i];
            }
            temp[num.length] = input;
            num = temp;
        }
        return num;
    }
}
