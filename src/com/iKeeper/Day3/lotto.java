package com.iKeeper.Day3;
import java.io.*;
import java.util.*;

public class lotto {
    public static void main(String []args) throws IOException {
        new Lottogame();

    }


}
class Lottogame {
    int insert_money;
    int exchange_lotto;
    private BufferedReader br;
    private StringTokenizer st;

    public Lottogame() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int insert_money = Integer.parseInt(br.readLine());
        System.out.println(insert_money + "원이 입력 되었습니다.");
        exchange_lotto=insert_money/1000;
        System.out.println(exchange_lotto + "장의 로또를 구매합니다.");
        Selectlottonumber(exchange_lotto);
    }

    protected void Selectlottonumber(int exchange_lotto) throws IOException {
        this.exchange_lotto = exchange_lotto;
        int[][] user_lotto = new int[exchange_lotto][6];
        st = new StringTokenizer(br.readLine());

            for (int i = 0; i < exchange_lotto; i++) {
                for (int j = 0; j < 6; j++) {
                    int inputnumber = Integer.parseInt(st.nextToken());
                    boolean isDuplicate = false;

                    for (int k = 0; k < j; k++) {
                        if (inputnumber == user_lotto[i][k]) {
                            System.out.println("중복된 번호입니다. 다시 입력해주세요.");
                            j--;
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (!isDuplicate) {
                        user_lotto[i][j] = inputnumber;
                    }
                }

                System.out.print(Arrays.toString(user_lotto[i]) + " ");    // 로또번호를 출력한다.
                System.out.println();
            }

            Control();
        }

    public void Control(){

    }

}