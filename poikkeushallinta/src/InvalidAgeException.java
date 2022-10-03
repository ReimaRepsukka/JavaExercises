public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(){
        super("Age was not valid");
    }
}
