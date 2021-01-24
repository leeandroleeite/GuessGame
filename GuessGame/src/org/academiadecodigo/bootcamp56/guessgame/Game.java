package org.academiadecodigo.bootcamp56.guessgame;

public class Game {

    int max = 10;
    int Num1;
    int Num2;

    public void start () {

        Player Player1 = new Player();
        Player1.name = "Ying";

        Player Player2 = new Player();
        Player2.name = "Yang";

        int luckyNum = Random.getRandom(max);

        while (luckyNum != Num1 && luckyNum != Num2 ) {

            Num1 = Player1.guessNumber(max);
            if (luckyNum == Num1) {
                System.out.println(Player1.name + " wins! " + "LuckyNum: " + luckyNum + " Num: " + Num1);
                return;
            } else {
                Num2 = Player2.guessNumber(max);
                if (luckyNum == Num2){
                    System.out.println(Player2.name + " wins! " + "LuckyNum: " + luckyNum + " Num: " + Num2);
                    return;
                }
            }
        }
    }
}
