import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int base, target, amtToEarn;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Base Salary: ");
        base = input.nextInt();
        System.out.println("Enter Target Salary: ");
        target = input.nextInt();
        amtToEarn = target-base;
        System.out.println("Amount to Earn = " + amtToEarn);

    }
}
