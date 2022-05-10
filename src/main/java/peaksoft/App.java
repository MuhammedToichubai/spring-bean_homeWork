package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat one = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println("One - Cat\n[");
        System.out.println("Name:" + one.getName());
        System.out.println("Age: " + one.getAge());
        System.out.println("Breed: "  +one.getBreed());
        System.out.println("Color: " + one.getColor()+"\n]");

        Cat two = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println("Two - Cat\n[");
        System.out.println("Name:" + two.getName());
        System.out.println("Age: " + two.getAge());
        System.out.println("Breed: " + two.getBreed());
        System.out.println("Color: " + two.getColor()+"\n]");

        Boolean comparison = one.equals(two);
        System.out.println("comparison = " + comparison);
        System.out.println(one);
        System.out.println(two);


    }
}
