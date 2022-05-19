package main;

import java.util.Scanner;

public class TorpedoTeszt {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int talalt = 0;
        int sorszam = (int)(Math.random() * 5);
        Hajo hajo = new Hajo([sorszam, sorszam + 1, sorszam + 2]);
        do {
            System.out.print("Adj meg egy számot: ");
            int szam = sc.nextInt();
            String t = hajo.talalat(szam);
            assert t.equals(hajo) : "Nem jó a találat ellenőrzése";
        }
        while(!(talalt == 3));
    }
    
    public String tesztLoves(int poz) {
        return "";
    }
}
