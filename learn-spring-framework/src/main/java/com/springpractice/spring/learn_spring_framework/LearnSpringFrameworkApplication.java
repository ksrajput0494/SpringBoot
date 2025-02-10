package com.springpractice.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springpractice.spring.learn_spring_framework.game.GamingConsole;
import com.springpractice.spring.learn_spring_framework.enterprise.example.web.MyWebController;
import com.springpractice.spring.learn_spring_framework.game.GameRunner;
import com.springpractice.spring.learn_spring_framework.game.MarioGame;
import com.springpractice.spring.learn_spring_framework.game.PackmanGame;
import com.springpractice.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
//@ComponentScan("com.springpractice.spring.learn_spring_framework")
//@ComponentScan({"com.springpractice.spring.learn_spring_framework", "com.springpractice.spring.learn_spring_framework.game"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//GamingConsole game = new MarioGame();
		//GamingConsole game = new SuperContraGame();
		//GamingConsole game = new PackmanGame();
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
