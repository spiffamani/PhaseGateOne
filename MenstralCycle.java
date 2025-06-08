

import java.time.LocalDate;
import java.util.Scanner;

public class MenstralCycle {

    public static String getUsername() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return input.nextLine();
    }

    public static LocalDate lastMenstrualCycle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your last menstrual cycle (yyyy-mm-dd): ");
        String lastDateString = input.nextLine();
        return LocalDate.parse(lastDateString);
    }

    public static LocalDate nextMenstrualCycle(LocalDate lastCycle, int dateInterval) {
        return lastCycle.plusDays(dateInterval);
    }

    public static LocalDate lengthOfCycle(LocalDate lastCycle, int lengthInterval) {
        return lastCycle.minusDays(lengthInterval);
    }

    public static void main(String[] args) {
        String userName = getUsername();
        LocalDate userLastMenstrualCycle = lastMenstrualCycle();

        int dateInterval = 28;
        int lengthInterval = 14;

        LocalDate userNextMenstrualCycle = nextMenstrualCycle(userLastMenstrualCycle, dateInterval);
        LocalDate userLengthOfCycle = lengthOfCycle(userLastMenstrualCycle, lengthInterval);

        System.out.println("\nHello, " + userName + "!");
        System.out.println("Your last menstrual cycle was on: " + userLastMenstrualCycle);
        System.out.println("Your next menstrual cycle is expected on: " + userNextMenstrualCycle);
        System.out.println("Your  cycle length calculation: " + userLengthOfCycle);
    }
}




















