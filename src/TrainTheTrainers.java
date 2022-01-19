import java.util.Scanner;
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeopleInJury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSumGrades = 0;
        int countGrades = 0;

        while (!"Finish".equals(input)){
            double sumGrades = 0;
             for (int i = 0; i < countPeopleInJury; i++) {
                 double grades = Double.parseDouble(scanner.nextLine());
                 sumGrades += grades;
                 totalSumGrades += grades;
                 countGrades++;
             }
            System.out.printf("%s - %.2f.\n",input, sumGrades / countPeopleInJury);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalSumGrades / countGrades);
    }
}