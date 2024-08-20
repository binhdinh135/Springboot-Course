package com.example.springboot.lession0.lession1;

import com.example.springboot.SpringBootCourseApplication;
import com.example.springboot.lession0.lession1.other.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan("com.example.springboot.lession1.other")
@SpringBootApplication(
        scanBasePackages = "com.example.springboot.lession0.lession1.other"
)
public class LessonOneApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if (otherGirl != null) {
                System.out.println("Bean: " + otherGirl.toString());
            }
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

    }
}
