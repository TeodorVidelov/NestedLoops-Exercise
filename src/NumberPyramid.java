import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int count = 1;
        boolean isFound = false;

        for (int rows = 1; rows <= number; rows++) {
            for (int cols = 1; cols <= rows; cols++) {

                System.out.printf("%d ",count);

                if (count == number){
                    isFound = true;
                    break;
                }
                count++;
            }
            if (isFound){
                break;
            }
            System.out.println();
        }
    }
}