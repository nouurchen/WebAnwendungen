package edu.fra.uas.service;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import java.time.LocalDateTime;

@Component
public class MessageService {
    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
    private String message;
    private int counter=0;

    public int increment() {
        return counter++;
    }

    public String getMessage() {
        log.debug("Getting message: ", message);
        return message;
    }
    public void setMessage(String message) {
        log.debug("Setting message: ", message);
        this.message = message;
    }
}
