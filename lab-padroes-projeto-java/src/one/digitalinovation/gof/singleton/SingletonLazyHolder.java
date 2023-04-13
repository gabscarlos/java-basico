package one.digitalinovation.gof.singleton;

public class SingletonLazyHolder {
    private static class IndtanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return IndtanceHolder.instancia;
    }
}
