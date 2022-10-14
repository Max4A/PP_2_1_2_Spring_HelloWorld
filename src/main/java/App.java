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

        System.out.println("Bean равен Bean2? " + (bean == bean2));

        Cat cat1 = applicationContext.getBean("getCat", Cat.class);
        Cat cat2 = applicationContext.getBean("getCat", Cat.class);

        System.out.println("Cat1 равен Cat2? " + (cat1 == cat2));
    }
}