public class Player {
    private int position;
    private int money;
    private String name;

    public Player(){
        this.position = 0;
        this.money = 0;
        this.name = null;
    }

    public Player(int position, int money, String name){
        this.position = position;
        this.money = money;
        this.name = name;
    }

    public Player(String name){
        this.name = name;
    }

    public void modifyMoney(int amount){
        this.money += amount;
    }

    public void updatePosition(int amount){
        this.position = (position + amount)%40;
    }

    public void rollDice(){
        updatePosition((int)Math.random() * 6);
    }

    public void drawCard(){
        //Game.getBonusCards()[((int)Math.random())];
    }
}
