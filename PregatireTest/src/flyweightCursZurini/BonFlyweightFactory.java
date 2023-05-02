//package flyweightCursZurini;
//
//import java.util.HashMap;
//
//public class BonFlyweightFactory {
//    public HashMap<EMesaj, IBon>listaMesaje;
//    private int nrMesaje;
//
//    public BonFlyweightFactory() {
//        this.listaMesaje = new HashMap<EMesaj, IBon>();
//    }
//
//    public int getNrMesaje() {
//        return listaMesaje.size();
//    }
//
//     public IBon getBon(EMesaj mesaj){
//         Mesaje bon= (Mesaje) listaMesaje.get(mesaj);
//        if(bon==null){
//            bon=new Mesaje(mesaj);
//            listaMesaje.put(mesaj, bon);
//        }
//        return bon;
//     }
//}
