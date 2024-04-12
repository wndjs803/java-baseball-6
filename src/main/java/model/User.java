package model;

import view.Input;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Integer> inputNumbers = new ArrayList<>();
    private final Input input;

    public User(){
        this.input = new Input();
    }

    public void setInputNumbers(){
        inputNumbers = input.enterNumbers();
    }

    public List<Integer> getInputNumbers(){
        return this.inputNumbers;
    }
}
