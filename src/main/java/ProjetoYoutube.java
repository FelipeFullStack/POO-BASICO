public class ProjetoYoutube {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("De volta para o futuro");
        v[1] = new Video("Matrix");
        v[2] = new Video("Iluminado");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Fabio", 22, "M", "binho");
        g[1] = new Gafanhoto("Rosa", 5, "F", "flor");

        Visualizacao vis[]= new Visualizacao[5];
        vis[0]= new Visualizacao(g[0],v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1]= new Visualizacao(g[0],v[1]);
        vis[0].avaliar(91.f);
        System.out.println(vis[0].toString());
//
//        System.out.println("--------" +"gafanhoto" + " --------------------\n");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());
//        System.out.println("--------" +"video" + " --------------------");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
    }
}
