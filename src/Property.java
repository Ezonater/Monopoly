public class Property extends Space {
    private int[] rent;
    private int cost;
    private int mortgage;

    public Property(String name, int position, int[] rent, int cost){
        super(name, position);
        this.rent = rent;
        this.cost = cost;
        this.mortgage = cost/2;
    }

    public Property(){
        super("Nil",0);

    }
}
