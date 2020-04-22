package lerner.bruno.injecaodependencia.model;

import lerner.bruno.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 16/04/2020 09:10
 */
@Component
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        System.out.println("Au auuu");
    }
}
