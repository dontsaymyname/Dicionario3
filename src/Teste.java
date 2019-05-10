import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teste {
    public static void main(String[] args) {

        Prova prova = new Prova();

        List<Integer> listaNumero = new ArrayList<>();
        listaNumero.add(1);
        listaNumero.add(5);
        listaNumero.add(5);
        listaNumero.add(6);
        listaNumero.add(7);
        listaNumero.add(8);
        listaNumero.add(8);
        listaNumero.add(8);


        Set<Integer> conjuntoNumero = new HashSet<>();
        conjuntoNumero.add(1);
        conjuntoNumero.add(5);
        conjuntoNumero.add(5);
        conjuntoNumero.add(6);
        conjuntoNumero.add(7);
        conjuntoNumero.add(8);
        conjuntoNumero.add(8);
        conjuntoNumero.add(8);

        System.out.println("Sizes:");
        System.out.println(listaNumero.size());
        System.out.println(conjuntoNumero.size());
        System.out.println("*****************");
        System.out.println("Números da lista:");

        for (Integer numeros: listaNumero){
            System.out.println(numeros);
        }

        System.out.println("Números do conjunto:");

        for (Integer numeros2: conjuntoNumero){
            System.out.println(numeros2);
        }

        prova.somaTotal(conjuntoNumero);
        System.out.println(prova.getTotal());





    }
}
