package torpedoegyszem;

public class TorpedoTeszt {

    public static void main(String[] args) {
        int[] tomb = {2,3,4};
        Hajo hajo = new Hajo(tomb);
        String t = hajo.talalat(4);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
    }
    public static String tesztLoves(int poz){
        return "";
    }
}