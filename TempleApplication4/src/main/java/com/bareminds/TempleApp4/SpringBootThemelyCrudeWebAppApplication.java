package com.bareminds.TempleApp4;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication is a combination of all these annotations.
//@Configuration-->we use this to make java class has spring configuration class and we define all beqan related configurations
//or spring related config
//@EnableAutoConfiguration internally annotated with @autoConfiguration and enables autoconfigurastion for aspplicartion
//@ComponentScan to mark the packages under which all classes should be scaned during component scan.
@SpringBootApplication
public class SpringBootThemelyCrudeWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThemelyCrudeWebAppApplication.class, args);
	}

}
