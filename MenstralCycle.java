

import java.time.LocalDate;
import java.util.Scanner;

public class MenstralCycle {

    public static String getUsername() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return input.nextLine();
    }

    public static LocalDate lastMenstralCycle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your last menstral cycle (yyyy-mm-dd): ");
        String lastDateString = input.nextLine();
        return LocalDate.parse(lastDateString);
    }

    public static LocalDate nextMenstralCycle(LocalDate lastCycle, int dateInterval) {
        return lastCycle.plusDays(dateInterval);
    }

    public static LocalDate lengthOfCycle(LocalDate lastCycle, int lengthInterval) {
        return lastCycle.minusDays(lengthInterval);
    }

    public static void main(String[] args) {
        String userName = getUsername();
        LocalDate userLastMenstralCycle = lastMenstralCycle();

        int dateInterval = 28;
        int lengthInterval = 14;

        LocalDate userNextMenstralCycle = nextMenstralCycle(userLastMenstralCycle, dateInterval);
        LocalDate userLengthOfCycle = lengthOfCycle(userLastMenstralCycle, lengthInterval);

        System.out.println("\nHello, " + userName + "!");
        System.out.println("Your last menstrual cycle was on: " + userLastMenstralCycle);
        System.out.println("Your next menstrual cycle is expected on: " + userNextMenstralCycle);
        System.out.println("Your  cycle length calculation: " + userLengthOfCycle);
    }
}




















