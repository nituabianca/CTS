package flyweightCursFaraUnshared;

public class Camera implements ICamera{
    private String tipCamera;
    private int nrProsoape;
    private int nrCearsafuri;
    private int nrPerne;
    private int nrUmerase;
    private int nrCamera;
    private String numeClient;

    public Camera(String tipCamera, int nrProsoape, int nrCearsafuri, int nrPerne, int nrUmerase, int nrCamera, String numeClient) {
        super();
        this.tipCamera=tipCamera;
        this.nrProsoape = nrProsoape;
        this.nrCearsafuri = nrCearsafuri;
        this.nrPerne = nrPerne;
        this.nrUmerase = nrUmerase;
        this.nrCamera = nrCamera;
        this.numeClient = numeClient;
    }

    public String getTipCamera() {
        return tipCamera;
    }

    public void setTipCamera(String tipCamera) {
        this.tipCamera = tipCamera;
    }

    public int getNrProsoape() {
        return nrProsoape;
    }

    public void setNrProsoape(int nrProsoape) {
        this.nrProsoape = nrProsoape;
    }

    public int getNrCearsafuri() {
        return nrCearsafuri;
    }

    public void setNrCearsafuri(int nrCearsafuri) {
        this.nrCearsafuri = nrCearsafuri;
    }

    public int getNrPerne() {
        return nrPerne;
    }

    public void setNrPerne(int nrPerne) {
        this.nrPerne = nrPerne;
    }

    public int getNrUmerase() {
        return nrUmerase;
    }

    public void setNrUmerase(int nrUmerase) {
        this.nrUmerase = nrUmerase;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "nrProsoape=" + nrProsoape +
                ", nrCearsafuri=" + nrCearsafuri +
                ", nrPerne=" + nrPerne +
                ", nrUmerase=" + nrUmerase +
                ", nrCamera=" + nrCamera +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }

    @Override
    public void cazare(String numeClient) {
        System.out.println("Clientul "+numeClient+" este cazat in camera "+nrCamera);
    }
}
