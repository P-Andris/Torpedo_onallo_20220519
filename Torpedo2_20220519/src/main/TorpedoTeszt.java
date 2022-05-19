package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        Hajo hajo = new Hajo([2, 3, 4]);
        String t = hajo.talalat(4);
        assert t.equals(hajo) : "Nem jó a találat ellenőrzése";
    }
    
    public String tesztLoves(int poz) {
        return "";
    }
}
