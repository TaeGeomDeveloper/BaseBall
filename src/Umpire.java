public class Umpire {
    private int hiddenNumber [] = new int[4];
    public Umpire(int hn[]){
        this.hiddenNumber = hn;
    }
    public int[] judgeNumber(int tryNumber){
        int [] result = new int[2];
        // 처리결과는 어떤식으로 리턴 되는가?
        // 실제 생성된 숫자는 어떻게 확보 할수 있는가?
        String strNum = ""+tryNumber;
        int tryNum[] = new int[4];
        System.out.print("정답 : ");
        for(int i = 0; i < 4;i++) {
            System.out.print(hiddenNumber[i]+ " ");
        }
        System.out.println();
        for(int i=0; i < 4; i++){
            tryNum[(3-i)] = tryNumber%10;
            tryNumber /= 10;
            //System.out.print(tryNum[3-i]+ " " +(3-i)+"\n");
        }

        for(int i = 0; i < 4;i++) {
            for(int j = 0;j < 4; j++){
                if(hiddenNumber[i] == tryNum[j]){
                    if(i == j){
                        result[0]++;
                    }
                    else{
                        result[1]++;
                    }
                }
            }
        }

        // 요청숫자와 생성숫자를 비교하여 결과를 리턴해야 하는데
        // 종료조건이 4Strike가 종료조건이서 4Strike 정보 전달
        // 그리고 ball 정보도 리턴해서 사용자가 사용할 수 있도록 해아한다.

        return result;
    }
}
