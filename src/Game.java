import java.util.ArrayList;

public class Game {
    private boolean freeParkingPot;
    private boolean doubleGoMoney;
    private ArrayList<BonusCard> bonusCards;
    private ArrayList<Space> spaces;
    private ArrayList<Player> players;
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

    public Game(ArrayList bonusCards,ArrayList spaces, ArrayList<Player> players, boolean freeParkingPot, boolean doubleGoMoney){
        this.bonusCards = bonusCards;
        this.spaces = spaces;
        this.players = players;
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
