package alejandro.lajusticia.core.config;

import alejandro.lajusticia.core.bean.SomeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeBeanDeclaration {

    public SomeBeanDeclaration() {
        System.out.println("[CORE] - Creation of SomeBeanDeclaration");
    }

    @Bean
    public SomeBean buildSomeBean() {
        System.out.println("[CORE] - Creating instance of SomeBean");
        return new SomeBean();
    }

}