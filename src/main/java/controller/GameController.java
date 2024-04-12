package controller;

import model.Computer;
import model.User;
import utill.Compare;
import view.Input;
import view.Output;

public class GameController {

    private Computer computer;
    private final Output output;
    private final Input input;
    private final User user;

    public GameController(){
        output = new Output();
        input =  new Input();
        user = new User();
    }

    public void run(){
        generateGame();
        startGame();
        computeScore();
        endGame();
    }

    public void generateGame(){
        System.out.println("generateGame");
        computer = new Computer();
        output.printGameStart();
    }

    public void startGame(){
        System.out.println("startGame");
        user.setInputNumbers();
    }

    public void computeScore(){
        Compare compare = new Compare();
        compare.computeStrike(computer.getRandomNumbers(), user.getInputNumbers());
        compare.computeBall(computer.getRandomNumbers(), user.getInputNumbers());

        output.printResult(compare.getStrike(), compare.getBall());

        if(compare.getStrike() != 3){
            startGame();
        }
        output.printThreeStrike();
    }

    public void endGame(){
        System.out.println("endGmae");
        output.printEndGame();
        String endString = input.enterString();

        if (endString.equals("1")){
            run();
        }

    }
}
