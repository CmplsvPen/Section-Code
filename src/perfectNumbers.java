import java.util.Scanner;

public class perfectNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Max value : ");
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++) {
            if (helperMethod(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean helperMethod(int max) {
        int num = 0;
        int sum = 0;
        for (num = 1; num < max; num++) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
        }
        if (sum == num) {
            return true;
        } else System.out.print("bruh");
        return false;
    }
}
