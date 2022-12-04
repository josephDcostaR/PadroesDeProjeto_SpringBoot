package one.digitalInovation.gof.Strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Se move de forma defensiva...");
    }
}
