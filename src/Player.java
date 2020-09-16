public class Player{
    private int position;
    private int money;
    private String name;
    private Game game;

    public Player(){
        this.position = 0;
        this.money = 0;
        this.name = null;
    }

    public Player(int position, int money, String name, Game game){
        this.position = position;
        this.money = money;
        this.name = name;
        this.game = game;
    }

    public Player(String name){
        this.name = name;
    }

    public void modifyMoney(int amount){
        this.money += amount;
    }

    public void updatePosition(int amount){
        int i = amount;
        while (i > 0) {
            this.position = (position + amount)%game.getSpaces().size();
            i--;
            game.moveUpdate();
        }
        game.stopUpdate();
        //this.position = (position + amount)%40;
    }

    public void rollDice(){
        updatePosition((int)Math.random() * 6);
    }

    public void drawCard(){
        //Game.getBonusCards()[((int)Math.random())];
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
