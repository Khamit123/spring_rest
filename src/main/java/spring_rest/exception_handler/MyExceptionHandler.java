package spring_rest.exception_handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionInfo> employeeExpHandler(EmployeeNotFounException exception)
    {
        ExceptionInfo info = new ExceptionInfo();
        info.setMessage(exception.getMessage());
        return new ResponseEntity<>(info, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<ExceptionInfo> AllexpHandler(Exception exception)
    {
        ExceptionInfo info = new ExceptionInfo();
        info.setMessage(exception.getMessage());
        return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
    }
}
