package flyweightCursFaraUnshared;

import java.util.HashMap;

public class CameraFlyweightFactory {
    private HashMap<String, ICamera> listaCamere;
    private int nrCamere;

    public CameraFlyweightFactory() {
        this.listaCamere = new HashMap<String, ICamera>();
    }

    public int getNrCamere() {
        return listaCamere.size();
    }

    public ICamera getCamera(String tipCamera){
        ICamera camera= listaCamere.get(tipCamera);
        if(camera==null){
            camera=new Camera("SINGLE",2,2,2,2,32,"Razvan");
            listaCamere.put(tipCamera,camera);
        }
        return camera;
    }
}
