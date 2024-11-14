public class ArrayOutOfBoundException extends Exception {
    public ArrayOutOfBoundException() {
        super("Array index is out of bounds.");
    }

    public ArrayOutOfBoundException(String message) {
        super(message);
    }
}
