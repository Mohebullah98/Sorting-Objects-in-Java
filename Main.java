import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player a = new Player("Messi", 8, 10);
        Player b = new Player("Mbappe", 6, 2);
        Player c = new Player("Ronaldo", 10, 8);
        Player d = new Player("Neymar", 6, 4);
        Player e = new Player("Modric", 2, 7);
        Player[] players = { a, b, c, d, e };

        // Arrays.sort(players);

        // Sorting with Comparator
        // Comparator<Player> playerComparator = new Comparator<>(){
        // public int compare(Player p1,Player p2){
        // int result = p2.getGoals()-p1.getGoals();
        // return result == 0 ? p2.getAssists()-p1.getAssists() : result;
        // }
        // };

        // Using lambda expression for comparator
        Comparator<Player> playerComparator = (p1, p2) -> {
            int result = p2.getGoals() - p1.getGoals();
            return result == 0 ? p2.getAssists() - p1.getAssists() : result;
        };
        Arrays.sort(players, playerComparator);

        // Print Array
        for (Player p : players) {
            System.out.println(p.getName() + "\t-->  Goals:" + p.getGoals() + " Assists:" + p.getAssists());
        }
    }
}
