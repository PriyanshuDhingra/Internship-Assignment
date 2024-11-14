public class MoreThanOneDigitException extends Exception {
    public MoreThanOneDigitException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int number = 15; 
            checkSingleDigit(number);
        } catch (MoreThanOneDigitException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void checkSingleDigit(int number) throws MoreThanOneDigitException {
        if (number >= 10 || number <= -10) {
            throw new MoreThanOneDigitException("The number has more than one digit.");
        } else {
            System.out.println("The number is a single digit.");
        }
    }
}

