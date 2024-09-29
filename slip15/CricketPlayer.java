import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int totalruns) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
        this.bat_avg = 0.0;
    }

    public static void avg(CricketPlayer player) {
        if (player.no_of_innings > player.no_of_times_notout) {
            player.bat_avg = (double) player.totalruns / (player.no_of_innings - player.no_of_times_notout);
        } else {
            player.bat_avg = 0.0;
        }
    }

    public static void sort(CricketPlayer[] players) {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.bat_avg, p1.bat_avg));
    }

    public void display() {
        System.out.println("Name: " + name + ", Innings: " + no_of_innings + ", Not Out: " + no_of_times_notout
                + ", Total Runs: " + totalruns + ", Batting Average: " + bat_avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of players: ");
        int n = sc.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Number of innings: ");
            int innings = sc.nextInt();
            System.out.print("Number of times not out: ");
            int notout = sc.nextInt();
            System.out.print("Total runs: ");
            int runs = sc.nextInt();

            players[i] = new CricketPlayer(name, innings, notout, runs);
            CricketPlayer.avg(players[i]); // Calculate batting average for each player
        }

        CricketPlayer.sort(players);

        System.out.println("Player details in sorted order based on batting average:");
        for (CricketPlayer player : players) {
            player.display();
        }

        sc.close();
    }
}
