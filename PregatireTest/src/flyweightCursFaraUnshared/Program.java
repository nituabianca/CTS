package flyweightCursFaraUnshared;

public class Program {
    public static void main(String[] args) {
        CameraFlyweightFactory fabrica=new CameraFlyweightFactory();
        Camera camera=(Camera) fabrica.getCamera("PREMIUM");
        camera.setNrCamera(32);
        camera.setNrCearsafuri(2);
        camera.setNrPerne(2);
        camera.setNrProsoape(2);
        camera.setNrUmerase(2);
        camera.setNumeClient("Razvan");
        camera.cazare("Razvan");
    }
}
