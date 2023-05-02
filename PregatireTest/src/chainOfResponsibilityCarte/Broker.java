package chainOfResponsibilityCarte;

public class Broker extends AHandler{
    @Override
    public void trateazaAlerta(Alerta alerta) {
        if(alerta.getGrad()<5){
            System.out.println("Brokerul a preluat alerta "+alerta.getNumeAlerta());
        }
        else {
            System.out.println("Brokerul nu poate prelua alerta");
            if(this.getNextHandler()!=null){
                this.getNextHandler().trateazaAlerta(alerta);
            }
        }
    }
}
