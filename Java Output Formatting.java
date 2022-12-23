import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String[] inputValuesArray = sc.nextLine().split(" ");
            String firstColumn = inputValuesArray[0] + " ".repeat(15 - inputValuesArray[0].length());
            String secondColumn = (inputValuesArray[1]);
            secondColumn = "0".repeat(3 - secondColumn.length());
            secondColumn = secondColumn + inputValuesArray[1];
            System.out.println(firstColumn + secondColumn);
        }
        System.out.println("================================");

    }
}