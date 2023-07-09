package Aula_10;

public class Faculdade {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();

        p1.setNome("Jessica");
        p1.setCurso("Sistemas de Informação");
        p2.setNome("Rafael Alexandre");
        p3.setNome("João");
        
        System.out.println(p1.toString());
    }
}
