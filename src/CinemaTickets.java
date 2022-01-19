import java.util.Scanner;
public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidTickets = 0;

        while (!"Finish".equals(input)){
            String movieName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int countSoldTickets = 0;

            for (int i = 0; i < freeSeats; i++) {
                String typeTicket = scanner.nextLine();

                if ("student".equals(typeTicket)){
                    countStudentTickets++;
                }
                else if ("standard".equals(typeTicket)){
                    countStandardTickets++;

                }
                else if ("kid".equals(typeTicket)){
                    countKidTickets++;
                }
                else if("End".equals(typeTicket)){
                    break;
                }
                countSoldTickets++;
            }
            System.out.printf("%s - %.2f%% full.\n",movieName,(countSoldTickets * 1.0 / freeSeats) * 100);
            input = scanner.nextLine();
        }
            int totalTickets = countKidTickets + countStandardTickets + countStudentTickets;
            System.out.printf("Total tickets: %d\n", totalTickets);
            System.out.printf("%.2f%% student tickets.\n", (countStudentTickets * 1.0 / totalTickets) * 100);
            System.out.printf("%.2f%% standard tickets.\n", (countStandardTickets * 1.0 / totalTickets) * 100);
            System.out.printf("%.2f%% kids tickets.", (countKidTickets * 1.0 / totalTickets) * 100);
    }
}