package in.practice.s_b_practical.ExceptionHandler;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String messege){
        super(messege);
    }
}
