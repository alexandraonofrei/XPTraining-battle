package be.cegeka.battle;

import java.util.Random;

public class Headquarters implements  IHeadquarters{

    @Override
    public int reportEnlistment(String soldierName) {
//        Random random = new Random(10);
//        return random.nextInt(100);
        return 100;
    }

    @Override
    public void reportCasualty(int soldierId) {

    }

    @Override
    public void reportVictory(int remainingNumberOfSoldiers) {

    }

}
