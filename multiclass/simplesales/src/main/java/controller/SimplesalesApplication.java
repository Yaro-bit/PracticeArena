package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimplesalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplesalesApplication.class, args);
	}

}
//@RestController
//@RequestMapping("/")
//class HelloController {
//
//    @GetMapping
//    public String softwareLaufen() {
//        return "Software läuft!";
//    }
//}