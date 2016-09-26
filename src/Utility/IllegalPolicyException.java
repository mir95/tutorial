package Utility;

/**
 * Created by 777 on 15.06.2016.
 */
public class IllegalPolicyException extends Exception{
    public IllegalPolicyException(String message){
        super(message);
    }

    IllegalPolicyException() {
        throw new UnsupportedOperationException("Пока не поддерживается.");
    }
}
