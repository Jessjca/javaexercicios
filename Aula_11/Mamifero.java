package Aula_11;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Métodos abstratos
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirAcao() {
        System.out.println("OUF OUF! OUF OUF OUF!");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo com suas patinhas!");
    }
}
