import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameStarter {
    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        File gameConfig = new File("C:\\Users\\1600139\\IdeaProjects\\Monopoly\\src\\GameConfig.txt");
        Scanner sc = new Scanner(gameConfig);
        System.out.println("Welcome to Bram Johnson's text-based Monopoly game, coded in Java.");
        System.out.println("Reading from file...");
        ArrayList<Player> players = new ArrayList<>();
        while(sc.hasNextLine()){
            if(sc.nextLine().contains("//Players")){
                String currentLine = sc.next();
                String[] inputPlayers = currentLine.split(",");
                for(String next : inputPlayers){
                    players.add(new Player(next,game));
                }
                break;
            }
        }
        System.out.println("Players:");
        System.out.println(players);
    }
}
