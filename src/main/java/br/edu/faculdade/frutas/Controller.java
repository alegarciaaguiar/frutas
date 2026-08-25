package br.edu.faculdade.frutas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Controller {
    Fruta fruta1= new Fruta("Laranja","laranja", "verao");
    Fruta fruta2= new Fruta("Melancia","verde", "verao");
    Fruta fruta3= new Fruta("Uva","roxa", "verao");

    @GetMapping ("/boas-vindas")
    public String boasvindas (){
        return "Seja bem vindo!";
    }

    @GetMapping ("/destaque")
    public Fruta destaque (){
        return fruta2;
    }

    @GetMapping ("/frutas")
    }


}
