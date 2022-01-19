import java.util.Scanner;
public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!"stop".equals(input)) {
            int numbers = Integer.parseInt(input);

            if (numbers < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean isPrime = true;

            for (int i = 2; i < numbers - 1; i++) {
                if (numbers % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeSum += numbers;
            } else {
                nonPrimeSum += numbers;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}