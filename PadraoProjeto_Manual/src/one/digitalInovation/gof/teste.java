package one.digitalInovation.gof;

import one.digitalInovation.gof.Facade.Facade;
import one.digitalInovation.gof.Singleton.SingletonEager;
import one.digitalInovation.gof.Singleton.SingletonLazy;
import one.digitalInovation.gof.Singleton.SingletonLazyHolder;
import one.digitalInovation.gof.Strategy.*;

public class teste {

    public static void main(String[] args) {
        //Singleton Testes
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        System.out.println("-------------------------");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println("-------------------------");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println("-------------------------");
        //Strategy Testes
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo= new ComportamentoAgresivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("-------------------------");
        //Facade Testes
        Facade facade = new Facade();
        facade.migrarCliente("Veronica","0000000");
    }
}
