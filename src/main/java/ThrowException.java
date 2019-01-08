import java.io.FileNotFoundException;

public class ThrowException {
    ThrowException(String objectMsg) {
        System.out.println(objectMsg);
    }

    public static void main(String[] args) throws Exception {
        try {
            ThrowException exceptn = new ThrowException("Hello");
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("Index Out of bound");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Reached Finally block");
        }

    }
}