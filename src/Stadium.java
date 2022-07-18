import java.util.Random;
import java.util.Scanner;

public class Stadium {
    public static void main(String[] args){
        Stadium sd = new Stadium();
        sd.playBall();
    }
    // 사용자와의 인터렉션 코드 작성
    public void playBall(){
        // 4자리 숫자 생성 -중복 숫자가 있으면 안된다.
        Random r = new Random();
        int number [] = new int[4];
        System.out.println("중복을 허용하지 않고 4개의 랜덤 숫자를 출력합니다.");
        for(int i = 0; i < 4;i++){
            if(i==0){
                number[i] = r.nextInt(9)+1;
            }
            else {
                number[i] = r.nextInt(9);
                for(int j = 0; j < i; j++){
                    if(number[i] == number[j]){
                        i--;
                        break;
                    }
                }
            }
        }

        int strike = 0;
        Umpire umpire = new Umpire(number);
        Scanner sc = new Scanner(System.in);

        while(true) {
            // 사용자로 부터 4자리 숫자 입력
            System.out.print("4자리 숫자 입력 : ");
            int tryNumber = sc.nextInt();
            // 입력 숫자 판정 요청하고 결과 수령
            int[] result = umpire.judgeNumber(tryNumber);
            // 결과에 따라 반복 여부 결정
            strike = result[0];
            if(strike == 4) {
                System.out.println("다 맞췄습니다.");
                break;
            }
            System.out.println();
            System.out.println(result[0]+"strike(s), "+result[1]+"ball(s)");
            System.out.print("계속 진행 하겠습니까? [Yes:1,No:0] : ");
            int cmd = sc.nextInt();
            if(cmd == 0){
                System.out.println("감사합니다. \n 게임을 종료합니다.");
                break;
            } else{
                System.out.println("다시 입력해주세요 ");
            }
        }
        sc.close();
    }
}
