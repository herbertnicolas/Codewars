import java.util.Scanner;

public class TortoiseRace {
    public static int[] race(int v1, int v2, int g) {
        if(v1 >= v2) return null;
            int s = g * 3600 / (v2 - v1);
            System.out.println(s/3600 +", " + s%3600/60 + ", " + s%60);
            return new int[]{s/3600, s%3600/60, s%60};
    }
    public static void main(String[] args) {
        TortoiseRace tr = new TortoiseRace();
        Scanner in = new Scanner(System.in);
        
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int g = in.nextInt();
        tr.race(v1, v2, g);
    }
}
