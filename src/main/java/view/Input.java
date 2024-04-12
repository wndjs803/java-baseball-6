package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {

    public List<Integer> enterNumbers(){
        System.out.print("숫자를 입력해 주세요 : ");

        String s = Console.readLine();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<3; i++){
            int num = Character.getNumericValue(s.charAt(i));

            if (num < 1 || num > 9) {
                throw new IllegalArgumentException();
            }
            numbers.add(num);
        }

        return numbers;
    }

    public String enterString(){
        return Console.readLine();
    }
}
