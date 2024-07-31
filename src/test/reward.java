import java.util.*;

public class reward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Reward Value Converter!");
        System.out.println("what do you want to convert cash to miles or miles to cash?");
        System.out.println("Enter 'cash' for cash to miles or 'miles' for miles to cash:");

        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("cash")) {
            System.out.print("Enter the cash value: ");
            double cashValue = scanner.nextDouble();
            RewardValue rewardValue = new RewardValue(cashValue);
            System.out.println("Cash Value: $" + rewardValue.getCashValue());
            System.out.println("Equivalent Miles: " + rewardValue.getMilesValue());
        } else if (choice.equals("miles")) {
            System.out.print("Enter the miles value: ");
            double milesValue = scanner.nextDouble();
            RewardValue rewardValue = new RewardValue(milesValue, true);
            System.out.println("Miles Value: " + rewardValue.getMilesValue());
            System.out.println("Equivalent Cash: $" + rewardValue.getCashValue());
        } else {
            System.out.println("Invalid choice. Please enter 'cash' or 'miles'.");
        }

        scanner.close();
    }
}

class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
