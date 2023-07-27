public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[1];
        v[0] = new Video("Aula de POO");
        Gafanhoto g[] = new Gafanhoto[1];
        g[0] = new Gafanhoto("Jessica");

        Visualizacao visu = new Visualizacao(g[0], v[0]);

        System.out.println(visu.toString());
    }
}
