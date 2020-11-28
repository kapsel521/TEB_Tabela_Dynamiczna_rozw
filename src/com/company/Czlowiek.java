package com.company;

 class Czlowiek {
    String imie;
    String nazwisko;

    Czlowiek(){
        System.out.println("to jest człowkiek bez parametrów");
    }

    Czlowiek(String imie){
        this.imie = imie;
        System.out.println("to jest człowkiek z imieniem");
    }

    Czlowiek(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        System.out.println("to jest człowkiek z imieniem i nazwiskiem");
    }
}
