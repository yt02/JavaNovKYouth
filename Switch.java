import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dayOfWeek = 3;

        String dayName ;

        System.out.print("Enter day number: ");
        dayOfWeek = scan.nextInt();
        
        switch (dayOfWeek){

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
                
            case 3:
                dayName = "Wednesday";
                break;

            case 4:
                dayName = "Thursday";
                break;

            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;

            default:
                dayName = "Sunday";
        }
        System.out.println(dayName);

    }
}
