package chainOfResponsibilityCarte;

public class Alerta {
    private String numeAlerta;
    private int grad;

    public Alerta(String numeAlerta, int grad) {
        this.numeAlerta = numeAlerta;
        this.grad = grad;
    }

    public String getNumeAlerta() {
        return numeAlerta;
    }

    public int getGrad() {
        return grad;
    }
}
