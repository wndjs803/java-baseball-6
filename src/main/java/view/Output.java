package view;

public class Output {
    public void printGameStart(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void enterNumbers(){
        System.out.print("숫자를 입력해 주세요 : ");
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

    public void printEndGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
