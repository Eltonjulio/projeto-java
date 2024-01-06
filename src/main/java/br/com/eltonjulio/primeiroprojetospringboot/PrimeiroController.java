package br.com.eltonjulio.primeiroprojetospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

  @GetMapping("/primeiroMetodo")
  public String primeiroMetodo() {
      return "Parabéns! Voçê criou sua primeira rota";
  }
  
  
}
