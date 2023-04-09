package com.iKeeper.Day3;
import java.io.*;

public class lotto {
    public static void main(String []args) throws IOException {
        new Lottogame();

    }


}
class Lottogame {
    int insert_money;
    int exchange_lotto;
    private BufferedReader br;


    public Lottogame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int insert_money = Integer.parseInt(br.readLine());
        System.out.println(insert_money + "원이 입력 되었습니다.");
        exchange_lotto=insert_money/1000;
        System.out.println(exchange_lotto + "장의 로또를 구매합니다.");
        Selectlottonumber(exchange_lotto);
    }
    public void Selectlottonumber(int exchange_lotto) throws IOException {
        this.exchange_lotto=exchange_lotto;
        int[] user_lotto = new int[6];
        while(exchange_lotto!=0) {
            for (int i = 0; i < 6; i++) {
                int num = (int) (Math.random() * 45) + 1;    // 1~46까지의 임의의 수를 받는다.
                user_lotto[i] = num;
                for (int j = 0; j < i; j++) {    // 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
                    if (user_lotto[i] == user_lotto[j]) {
                        i--;
                        break;
                    }

                }
                System.out.print(user_lotto[i] + " ");    // 로또번호를 출력한다.

            }
            System.out.println();
            exchange_lotto--;
        }
    }

}