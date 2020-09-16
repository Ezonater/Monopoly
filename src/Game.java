public class Game {
    private boolean freeParkingPot;
    private boolean doubleGoMoney;
    private static int[] bonusCards;
    private static int[] spaces;

    public boolean isFreeParkingPot() {
        return freeParkingPot;
    }

    public boolean isDoubleLandGo() {
        return doubleGoMoney;
    }

    public static int[] getBonusCards() {
        return bonusCards;
    }

    public static int[] getSpaces() {
        return spaces;
    }
}
