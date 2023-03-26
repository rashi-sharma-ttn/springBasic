package com.springbasiic.springbasic.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

interface myInterface1{
    void showMarks();
}
@Component
class Student1 implements myInterface1{

    @Override
    public void showMarks() {
        System.out.println("Student1 passed");
    }
}

class Student2 implements myInterface1{
    @Override
    public void showMarks() {
        System.out.println("Student2 Failed");
    }
}

@Component
class Result{
    private myInterface1 obj;
    @Autowired
    public Result(myInterface1 obj) {
        this.obj = obj;
    }

    public void display(){
        obj.showMarks();
    }
}
@SpringBootApplication
public class Q3 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Q3.class);
        Result res = context.getBean(Result.class);
        res.display();
        System.out.println(res);
    }

}


/*@Component annotation is added on the top of each Java class to configure it as a java bean
to be wired with another class in a Spring project. Doing so, will make Spring Framework treat
this class as a java bean. In the absence of @Component annotation, Spring Framework would take
the class as just a regular java class, without configuring it as a java bean. */


/*@Autowired annotation is added on the top of an instance variable/property in a class which is
    injected into the bean i.e. dependency injection, after the bean is constructed.

    This property to be injected could be a primitive value, an instance of another class.

    The @Autowired annotation could even be used on the top of a method or a constructor, which
    is used to inject a value.

    The @Autowired annotation has a required attribute which can be set to false, to disable the
    injection of this bean.
*/