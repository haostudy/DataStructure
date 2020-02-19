package chapter12;

public class MmyException extends Exception{
    String message;
    public MmyException(String ErrorMessage){
        message=ErrorMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
