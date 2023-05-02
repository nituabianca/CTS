package chainOfResponsibilityCarte;

public abstract class AHandler {
    private AHandler nextHandler;

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract public void trateazaAlerta(Alerta alerta);
}
