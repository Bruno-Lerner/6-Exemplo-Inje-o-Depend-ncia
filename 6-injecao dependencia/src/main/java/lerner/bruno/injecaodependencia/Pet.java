package lerner.bruno.injecaodependencia;

import lerner.bruno.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:10
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

    public void execute() {
        iAnimal.comunicar();

    }
}
