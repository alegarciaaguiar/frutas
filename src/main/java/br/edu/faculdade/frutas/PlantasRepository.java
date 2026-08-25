package br.edu.faculdade.frutas;

import org.springframework.stereotype.Repository;

import java.util.List;

public class PlantasRepository {
    List<Fruta> todas(){
        return  List.of(
                new Fruta("Laranja","laranja", "verao"),
                new Fruta("Melancia","verde", "verao"),
                new Fruta("Uva","roxa ", "verao"),
                new Fruta("Manga","rosa ", "verao"),
                new Fruta("Tangerina","laranja", "verao"),
                new Fruta("Morango","vermelho", "inverno"),
                new Fruta("Melão","amarelo ", "inverno"),
                new Fruta("Pera","verde ", "inverno")
        );

    }

}
