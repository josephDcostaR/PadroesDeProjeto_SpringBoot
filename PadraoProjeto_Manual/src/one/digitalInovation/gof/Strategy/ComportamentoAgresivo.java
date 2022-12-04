package one.digitalInovation.gof.Strategy;

public class ComportamentoAgresivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Se move de forma agressiva...");
    }
}
