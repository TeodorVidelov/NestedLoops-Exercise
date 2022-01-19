import java.util.Scanner;
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int n1 = 1; n1 <= 9; n1++) {
            for (int n2 = 1; n2 <= 9; n2++) {
                for (int n3 = 1; n3 <= 9; n3++) {
                    for (int n4 = 1; n4 <= 9; n4++) {

                        if (number % n1 == 0 && number % n2 == 0 && number % n3 == 0 && number % n4 == 0){
                            System.out.printf("%d%d%d%d ",n1,n2,n3,n4);
                        }
                    }
                }
            }
        }
    }
}