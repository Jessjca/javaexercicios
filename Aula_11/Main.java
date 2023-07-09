package Aula_11;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setCorPelo("Caramelo");
        m.setIdade(4);
        m.emitirAcao();

        p.setCorEscama("Azul");
        p.emitirAcao();

        a.alimentar();
        a.emitirAcao();
        a.fazerNinho();

        r.setPeso(2);
        r.alimentar();
    }
}
