package br.com.raijheckinny;

public class ExemploArrayList {
    public static void main(String args[]){
        List<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Pedro");
        lista.add("Maria");

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

    }
}
