public class Bonus extends Space {
    public Bonus(String name, int position){
        super(name, position);
    }

    public void randomCard(){

    }

    @Override
    public void justLanded(Game game, Player player) {
        randomCard();
    }
}
