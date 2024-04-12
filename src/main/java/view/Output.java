package view;

public class Output {
    public void printGameStart(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void enterNumbers(){

    }

    public void printResult(int strike, int ball){
        if(strike == 0 && ball == 0){
            System.out.println("낫싱");
            return;
        }
        if(strike != 0 && ball == 0){
            System.out.println(strike + "스트라이크");
            return;
        }

        if(strike == 0 && ball != 0){
            System.out.println(ball + "볼");
            return;
        }

        System.out.println(ball + "볼" + strike + "스트라이");
    }

    public void printThreeStrike(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printEndGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
