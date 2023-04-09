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
    }


}