package main;

public class Hajo {
    private int[] pozicio = new int[3];
    
    public String talalat(int poz) {
        String sz = "";
        for(int i = 0; i < 3; i++) {
            if(poz == pozicio[i]) sz = "Talált";
            else sz = "Nem talált";
        }
        return sz;
    }
    
    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
}
