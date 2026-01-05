import taks_5.OnlineCourse;
import task_1.Circle;
import task_1.Rectangle;
import task_2.MyCustomException;
import task_3.Person;
import task_4.WashingMachine;

import java.time.Duration;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Main {

    public static void main(String[] args) {
        // task 1
//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        circle.area();
//        rectangle.area();

        // task 2
//        try {
//            divide(1, 0);
//        } catch (MyCustomException e) {
//            System.out.println(e.getMessage());
//        }

        // task 3
//        Person person1 = new Person("name1", 10);
//        Person person2 = new Person("name2", 20);
//        System.out.println("perons1's details. name: " + person1.name + " age: " + person1.age);
//        System.out.println("perons2's details. name: " + person2.name + " age: " + person2.age);

        // task 4
//        WashingMachine washingMachine = new WashingMachine(1, "Washing machine", 300.0, 1);
//        washingMachine.calculateFinalPrice(100);
//        washingMachine.extendsWarranty(1);


        // task 5
//        OnlineCourse onlineCourse = new OnlineCourse("Java", "instructor A", 20, "udemy", 100);
//        onlineCourse.displayCourseDetails();
//        System.out.println("is eligible for a certificate: " + onlineCourse.isEligibleCertificate(101));

    }


    // method of task 2
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new MyCustomException("the number cannot be divide 0. Error");
        }
        double result = a / b;
        System.out.println(result);
    }
}
