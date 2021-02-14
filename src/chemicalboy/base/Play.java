package chemicalboy.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Play {

    public WinDto play(){

        WinDto winDto = new WinDto();
        winDto.setWin(false);
        winDto.setReward(0);

        ArrayList<Integer> playerChoose = getRandom(6, 49);
        ArrayList<Integer> draw = getRandom(6,49);

        int hit = 0;

        for(int i = 0; i < 6 ; i++){

            if(draw.contains(playerChoose.get(i))){
                hit++;
            }
        }

        switch(hit){
            case 3:
                System.out.print(draw.toString() + " | " + playerChoose.toString());
                System.out.println("| Trójka: Wygraleś 24 PLN");
                winDto.setReward(24);
                winDto.setWin(true);
                break;
            case 4:
                System.out.print(draw.toString() + " | " + playerChoose.toString());
                System.out.println("| Czwórka: Wygrałeś 205 PLN");
                winDto.setReward(205);
                winDto.setWin(true);
                break;
            case 5:
                System.out.print(draw.toString() + " | " + playerChoose.toString());
                System.out.println("| piątka: Wygrałeś 6.000 PLN");
                winDto.setReward(6000);
                winDto.setWin(true);
                break;
            case 6:
                System.out.print(draw.toString() + " | " + playerChoose.toString());
                System.out.println("| SZÓSTKA: Wygrałeś 1.000.000 PLN !!!");
                winDto.setReward(5000000);
                winDto.setWin(true);
                break;
        }

        winDto.setHit(hit);

        return winDto;

    }

    private ArrayList<Integer> getRandom(int choices, int scoope){

        ArrayList<Integer> scoopeArr = new ArrayList<>();
        ArrayList<Integer> choiceArr = new ArrayList<>();

        for(int i = 1; i < 50 ; i++){
            scoopeArr.add(i);
        }

        Random random = new Random();

        for(int i = 0; i < choices; i++) {

            int a = random.nextInt(scoope - i);

            int b = scoopeArr.get(a);
            scoopeArr.remove(a);
            choiceArr.add(b);

        }
        Collections.sort(choiceArr);

        return choiceArr;

    }


}
