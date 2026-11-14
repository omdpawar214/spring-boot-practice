package in.practice.s_b_practical.ExceptionHandler;

import in.practice.s_b_practical.DTO.ExceptionResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionResponseDto> resourceNotFOundExceptionHandler(ResourceNotFoundException ex, HttpServletRequest request){

        ExceptionResponseDto responseDto = new ExceptionResponseDto(
                ex.getMessage(),
                request.getRequestURI()

        );
        return new ResponseEntity<>(responseDto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponseDto> MethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){

        ExceptionResponseDto responseDto = new ExceptionResponseDto(
                ex.getMessage(),
                request.getRequestURI()

        );
        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
    }
}

