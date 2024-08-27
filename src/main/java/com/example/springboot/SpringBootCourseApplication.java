package com.example.springboot;

//import com.example.springboot.lession1.*;
//import com.example.springboot.lession2.*;

import com.example.springboot.lession3mvc.entity.GirlMvc;
import com.example.springboot.lession3mvc.service.GirlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCourseApplication {

	public static void main(String[] args) {
		/*
		// Lession 1
//		SpringApplication.run(SpringBootCourseApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);

		OutFit outFit = context.getBean(OutFit.class);

		Bikini bikini = context.getBean(Bikini.class);

		System.out.println("there is bean: " + outFit);
		System.out.println("there is bean: " + bikini);

		outFit.wear();
		bikini.hello();

		Honda civic = context.getBean(Honda.class);
		civic.setName("Civic");
		civic.setAge(10);
		civic.hello();

		Car car = context.getBean(Car.class);
		car.hello();
		Girl girl = context.getBean(Girl.class);

		System.out.println("Girl Instance: " + girl);

		System.out.println("Girl Outfit: " + girl.getOutfit());

		girl.getOutfit().wear();
        */


		// Lession 2
		// ApplicationContext chính là container, chứa toàn bộ các Bean
//		System.out.println("> Trước khi IoC Container được khởi tạo");
//		ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);
//		System.out.println("> Sau khi IoC Container được khởi tạo");
//
//		// Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
//		// dấu @Component.
//
//		GirlLessonTwo girl = context.getBean(GirlLessonTwo.class);
//
//		System.out.println("> Trước khi IoC Container destroy Girl");
//		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
//		System.out.println("> Sau khi IoC Container destroy Girl");


		// Lession 3: Mô hình MVC
		ApplicationContext context = SpringApplication.run(SpringBootCourseApplication.class, args);

		// Lấy ra bean GirlService
		GirlService girlService = context.getBean(GirlService.class);
		// Lấu ra random một cô gái từ tầng service
		GirlMvc girlMvc = girlService.getRandomGirl();
		// In ra màn hình
		System.out.println(girlMvc);

	}

}
