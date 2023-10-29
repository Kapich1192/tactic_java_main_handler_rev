package com.tactic.tactic_main_handler;

import com.tactic.tactic_main_handler.models.dto.elements.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.tactic.tactic_main_handler.config.Singleton.thisElement;

@SpringBootApplication
public class TacticMainHandlerApplication {

	public static void main(String[] args) {
		thisElement = new Element();
		thisElement.initialize();
		String[] settings = new String[1];
		settings[0] = "--server.port=" + thisElement.getSettings().getOrDefault("port","8081");

		SpringApplication.run(TacticMainHandlerApplication.class, settings);
	}

}
