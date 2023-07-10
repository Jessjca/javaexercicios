package Aula_11;

public class Cachorro extends Mamifero{
    public void enterrarOsso() {
        System.out.println("Cachorro está enterrando osso!");
    }

    public void cavarBuraco() {
        System.out.println("Cachorro está cavando buraco");
    }

    public void reagir(String frase) {
        if(frase == "Toma petisco" || frase == "Olá") {
            System.out.println("Abanar o rabo e sorrir!");
        }else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12 && hora > 8) {
            System.out.println("Abanar o rabo");
        }else if(hora <= 18 && hora >= 12){
            System.out.println("Ignorar");
        }else {
            System.out.println("Latir");
        }
    }

    public void reagir(boolean dono) {
        if(dono == true) {
            System.out.println("Abanar o rabo");
        }else {
            System.out.println("Latir!");
        }
    }

}
