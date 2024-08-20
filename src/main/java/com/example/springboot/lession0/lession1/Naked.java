package com.example.springboot.lession0.lession1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/*
Nếu thêm @Component vào class này mà không có annotation @primary
***************************
 APPLICATION FAILED TO START
 ***************************

 Description:

 Field outfit in com.example.springboot.lession1.Girl required a single bean, but 2 were found:
 - bikini: defined in file [C:\Working_Bin\SpringBoot\Projects\Course_Learn\springboot\target\classes\com\example\springboot\lession1\Bikini.class]
 - naked: defined in file [C:\Working_Bin\SpringBoot\Projects\Course_Learn\springboot\target\classes\com\example\springboot\lession1\Naked.class]

 This may be due to missing parameter name information

* */
@Component
@Primary
public class Naked implements OutFit{
    @Override
    public void wear() {
        System.out.println("Hello Chung May");
    }
}
