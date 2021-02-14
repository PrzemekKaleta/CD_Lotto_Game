package chemicalboy.base;

public class Main {

    public static void main(String[] args) {

        Play play = new Play();

        int numberOfGames = 0;

        while(!play.play().isWin()){
            numberOfGames++;
        }

        System.out.println(numberOfGames);
        System.out.println(String.format("Wydałeś %s, a wygrałeś %s PLN", numberOfGames*3, "xyz"));

    }
}
