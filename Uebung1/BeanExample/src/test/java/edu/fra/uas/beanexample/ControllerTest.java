package edu.fra.uas.beanexample;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest 
public class ControllerTest {

    @Autowired
    private BeanController beanController;

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo("Das ist ein Test");
    }

    @Autowired
    private MessageService messageService;

    @Test
    void testIncrement() {
        assertThat(messageService.increment()).isEqualTo(0);
        assertThat(messageService.increment()).isEqualTo(1);
        assertThat(messageService.increment()).isEqualTo(2);
    }

}
