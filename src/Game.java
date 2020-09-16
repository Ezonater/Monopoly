import java.util.ArrayList;

public class Game {
    private boolean freeParkingPot;
    private boolean doubleGoMoney;
    private ArrayList<BonusCard> bonusCards;
    private ArrayList<Space> spaces;
    private Player activePlayer;

    public boolean isFreeParkingPot() {
        return freeParkingPot;
    }

    public boolean isDoubleLandGo() {
        return doubleGoMoney;
    }

    public ArrayList getBonusCards() {
        return bonusCards;
    }

    public ArrayList getSpaces() {
        return spaces;
    }

    public Game() {
        freeParkingPot = false;
        doubleGoMoney = false;
    }

    public Game(ArrayList bonusCards,ArrayList spaces){
        this.bonusCards = bonusCards;
        this.spaces = spaces;
        this.freeParkingPot = false;
        this.doubleGoMoney = false;
    }

    public Game(ArrayList bonusCards,ArrayList spaces, boolean freeParkingPot, boolean doubleGoMoney){
        this.bonusCards = bonusCards;
        this.spaces = spaces;
        this.freeParkingPot = freeParkingPot;
        this.doubleGoMoney = doubleGoMoney;
    }

    public void moveUpdate(){
        if(isPlayerOnGo()){
            activePlayer.modifyMoney(200);
            //checks every time to player moves
        }
    }

    public void stopUpdate(){
        if(isPlayerOnGo()){
            activePlayer.modifyMoney(400);
            //only checks after the player has stopped
        }
    }

    public boolean isPlayerOnGo(){
        if(activePlayer.getPosition()==0){
            return true;
        }
        return false;
    }
}
