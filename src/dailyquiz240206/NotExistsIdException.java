package dailyquiz240206;

public class NotExistsIdException extends Exception{
    public NotExistsIdException(){

    }
    public NotExistsIdException(String message){
        super(message);
    }
}
