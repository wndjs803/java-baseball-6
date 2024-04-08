package model;


import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Integer> randomNumbers = new ArrayList<>();

    public void setRandomNumbers(){
        while (randomNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
            System.out.println(randomNumber);
        }
    }

    public List<Integer> getRandomNumbers(){
        return this.randomNumbers;
    }

}
