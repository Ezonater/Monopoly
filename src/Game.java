import java.util.ArrayList;

public class Game {
    private boolean freeParkingPot;
    private boolean doubleGoMoney;
    private ArrayList<BonusCard> bonusCards;
    private ArrayList<Space> spaces;

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
}
