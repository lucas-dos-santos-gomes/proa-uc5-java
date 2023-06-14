package br.com.testers.SpringTest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
  @GetMapping("/helloworld")
  String index() {
    return (
      "<h1>Hello World!</h1> <img src='https://pixabay.com/photos/welding-fire-construction-work-5231789/' alt='Foto aleatória' />"
    );
  }

  @GetMapping("/students")
  List<String> students() {
    return List.of("Lucas", "Maciel");
  }
}
