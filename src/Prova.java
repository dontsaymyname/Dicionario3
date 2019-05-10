import java.util.Set;

public class Prova {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void somaTotal (Set<Integer> conjuntoDeInteiros){
        for (Integer soma: conjuntoDeInteiros){
            total = total + soma;
        }
    }
}
