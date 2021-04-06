//variabel2 global
public class GameInfo extends Game {
    private Boolean isGameOver = false;

    //getter
    public Ruangan getObjRuangan() {
        return objRuangan;
    }
    public Player getObjPlayer() {
        return objPlayer;
    }
    public Boolean getGameOver() {
        return isGameOver;
    }

    //setter
    public void setObjRuangan(Ruangan objRuangan) {
        this.objRuangan = objRuangan;
    }
    public void setObjPlayer(Player objPlayer) {
        this.objPlayer = objPlayer;
    }
    public void setGameOver(Boolean gameOver) {
        isGameOver = gameOver;
    }
}
