package Aula_11;

public abstract class Animal { //Não pode virar objeto pq é abstrato
    private float peso;
    private int idade;

    //Métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirAcao();
    public float getPeso() {
        return peso;
    }

    //Métodos especiais
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
