package chainOfResponsibilityCarte;

public class ConducereSuperioara extends AHandler{
    @Override
    public void trateazaAlerta(Alerta alerta) {
        if(alerta.getGrad()>=5){
            System.out.println("Alerta "+alerta.getNumeAlerta()+" este preluata de conducerea superioara");
        }
    }
}
