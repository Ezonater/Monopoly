public class Go extends Space{
    public Go(){
        super("Go",0);
    }

    @Override
    public void justLanded(Game game, Player player) {
        if(game.isDoubleLandGo()){
            player.modifyMoney(400);
        }
        else{
            player.modifyMoney(200);
        }
    }


}
