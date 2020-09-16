public class FreeParking extends Space{
    public int potMoney;

    public FreeParking(){
        super("Free Parking", 20);
    }

    @Override public void justLanded(Game game, Player player){
        if(game.isFreeParkingPot() && potMoney > 0){
            player.modifyMoney(potMoney);
            potMoney = 0;
        }
    }
}
