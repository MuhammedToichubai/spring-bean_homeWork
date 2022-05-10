package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat("Tom", 7, "Persian", "Navy blue");
        return cat;
    }

//    Cat getCat(){
//        Cat cat = new Cat();
//        cat.setName("Tom");
//        cat.setAge(7);
//        cat.setBreed("Persian");
//        cat.setColor("Navy blue");
//        return cat;
    }

