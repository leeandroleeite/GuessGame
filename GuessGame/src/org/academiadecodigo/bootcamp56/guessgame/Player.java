package org.academiadecodigo.bootcamp56.guessgame;

public class Player {

    public String name;

    public int guessNumber (int max) {

        return Random.getRandom(max);

    }

}
