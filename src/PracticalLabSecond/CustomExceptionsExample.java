package PracticalLabSecond;

public class CustomExceptionsExample {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println(result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divideNumbers(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Cannot divide by zero.");
        }
        return a / b;
    }

}

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

}

