package utill;

import java.util.ArrayList;
import java.util.List;

public class Compare {
    private int strike;
    private int ball;

    public Compare(){
        strike = 0;
        ball = 0;
    }

    public void computeStrike(List<Integer> computer, List<Integer> numbers){
        strike = 0;
        for (int i=0; i<3; i++){
            if(computer.get(i).equals(numbers.get(i))){
                strike++;
            }
        }
//        return strike;
    }

    public void computeBall(List<Integer> computer, List<Integer> numbers) {
        ball = 0;
        for (Integer integer : numbers) {
            if (computer.contains(integer)){
                ball++;
            }
        }

        ball = ball - strike;
    }

    public int getStrike(){
        return strike;
    }

    public int getBall(){
        return ball;
    }
}
