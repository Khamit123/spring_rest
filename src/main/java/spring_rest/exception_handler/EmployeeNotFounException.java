package spring_rest.exception_handler;

public class EmployeeNotFounException extends RuntimeException {
    public EmployeeNotFounException(String message) {
        super(message);
    }
}
