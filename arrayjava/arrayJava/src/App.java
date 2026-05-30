import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elementos a lista add  ()
        nomes.add ("aluna");
        nomes.add ("Vivi");
        nomes.add ("Ana");
        System.out.println(nomes);

        //Acessar um elemento get (indice)
        System.out.println(nomes.get(2));

        //Alterar um item 
        nomes.set (0,"Pincesa");
        System.out.println(nomes);

        //Remover um item da lista
        //System.out.println("remover este");
        //nomes.add (3);
        //System.out.println("remover este");

        //6 - apagar a lista
        //nome.clear ();
        //System.out.println(nomes);

        //7 - verifica se existe
        System.out.println(nomes.contains("Ana"));  



    }
}
