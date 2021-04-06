import java.util.Scanner;

public class GameEngine extends Game {
    // user interface game
    protected GameInfo objGameInfo = new GameInfo();

    //inputan player
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GameEngine objGameEngine;
        objGameEngine = new GameEngine();
        objGameEngine.mulai();
    }

    //constructor
    public GameEngine() {
        //init ruangannya
        objRuangan.setObjGameInfo(objGameInfo);
        objRuangan.setDeskripsi("Ruangan kecil, dengan satu pintu dan jendela");
        objPlayer.setRuanganAktif(objRuangan);  //set ruangan aktif player
        objPlayer.setObjGameInfo(objGameInfo);

        objGameInfo.setObjPlayer(objPlayer);
        objGameInfo.setObjRuangan(objRuangan);
    }


    private void aksi() {
        System.out.println();
        System.out.println("==============================================");
        System.out.println("1. Aksi yang dapat dilakukan di ruangan");
        System.out.println("2. Aksi terhadap player");
        System.out.println("3. Keluar");
        System.out.println("==============================================");
        System.out.print("Pilihan anda?");
        int pil = sc.nextInt();
        System.out.println("--");
        switch (pil){
            case 1:
                objRuangan.pilihanAksi();
                break;
            case 2:
                objPlayer.pilihanAksi();
                break;
            case 3:
                objGameInfo.setGameOver(true); //keluar
                break;
            default:
                System.out.println("input tidak dikenal");
        }
    }

    /*method untuk memulai permainan, dimana selama getGameover bernilai
    * false, maka permainan akan terus berlanjut*/
    public void mulai() {
        while (!objGameInfo.getGameOver()) {
            aksi();
        }
    }
}
