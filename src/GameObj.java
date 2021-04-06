import java.util.ArrayList;
import java.util.Scanner;

public class GameObj{
    protected String nama;
    protected String deskripsi;
    protected GameInfo objGameInfo;
    protected Scanner sc = new Scanner(System.in);
    protected Ruangan ruanganAktif;
    protected ArrayList<Item> arrItem = new ArrayList<>();
    protected ArrayList<String> arrAksi = new ArrayList<>();

    //setter
    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void setRuanganAktif(Ruangan ruanganAktif) {
        this.ruanganAktif = ruanganAktif;
    }
    //getter
    public String getNama() {
        return nama;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    //polimorph
    public ArrayList<String> getAksi() {
        return arrAksi;
    }
    public void prosesAksi(int subPil) {
    }
}
