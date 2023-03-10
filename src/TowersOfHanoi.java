
public class TowersOfHanoi {
    public static int counter = 0;
    public static void TvH(int n, char von, char bis, char über) {
        counter++;
        if (n == 1) {
            System.out.println("Setze Scheibe 1 von Turm " + von + " nach Turm " + bis);
            return;
        }
        TvH(n - 1, von, über, bis);
        System.out.println("Setze Scheibe " + n + " von Turm " + von + " bis Turm " + bis);
        TvH(n - 1, über, bis, von);

    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        TvH(n, 'A', 'C', 'B'); // A, B and C
        System.out.println("Züge " + counter);
    }
}