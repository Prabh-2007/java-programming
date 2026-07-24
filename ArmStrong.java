import java.util.Scanner;

public class Main {

    void ArmstrongNumber(int n) {

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Main obj = new Main();
        obj.ArmstrongNumber(n);
    }
}