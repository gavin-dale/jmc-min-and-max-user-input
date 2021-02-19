import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        boolean hasNextInt = scanner.hasNextInt();
        int num = scanner.nextInt();
        int minNum = num;
        int maxNum = num;

        while(hasNextInt){
            System.out.println("Enter number:");
            num = scanner.nextInt();
            hasNextInt = scanner.hasNextInt();
            if(num > maxNum){
                maxNum = num;
            } else if(num < minNum) {
                minNum = num;
            }
        }
        System.out.println("Max number is: " + maxNum + " and min number is: " + minNum);
        scanner.close();
    }
}
