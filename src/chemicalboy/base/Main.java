package chemicalboy.base;

public class Main {

    public static void main(String[] args) {

        Play play = new Play();

        int numberOfGames = 0;
        int looseMoney = 0;
        int winMoney = 0;

        boolean getSix = false;

        while (!getSix){

            numberOfGames++;
            looseMoney = looseMoney + 3;
            WinDto winDto = play.play();
            winMoney = winMoney + winDto.getReward();
            if(winDto.getHit() > 5){
                getSix = true;
            }

        }

        int total = winMoney - looseMoney;

        String totalStr;

        if(total > 0){
            totalStr = "zyskano";
        }else{
            totalStr = "stracono";
        }

        System.out.println(String.format("Ilość gier %,d, wydano: %,d, wygrano %,d. W sumie %s %,d PLN", numberOfGames, looseMoney, winMoney, totalStr, total));


    }
}
