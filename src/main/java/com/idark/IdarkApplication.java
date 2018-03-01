package com.idark;

import javafx.scene.Parent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class IdarkApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder()
				.sources(Parent.class)
				.child(IdarkApplication.class)
				.run(args);
	}

}
