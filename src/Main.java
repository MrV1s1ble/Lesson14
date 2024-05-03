import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        int sumOfPieces = 0;

        String numInString = String.valueOf(num);
        char[] charArray = numInString.toCharArray();

        for (int i = 0; i < numInString.length(); i++) {
            sumOfPieces += Character.getNumericValue(charArray[i]);
        }
        System.out.println(sumOfPieces);

        return sumOfPieces * 1.0 / numInString.length() * 1.0;
    }
}
