package com.iKeeper.Day3;
import java.util.*;
import java.io.*;
public class lotto {
    public static void main(String []args){

    }

}
class Input_money{
    private int insert_money;
    public void Input_money() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        insert_money = Integer.parseInt(br.readLine());
        System.out.println(insert_money+"원이 입력 되었습니다.");
    }
    public void Exchange_lotto(){
        int exchange_lotto = insert_money/1000;
        System.out.println(exchange_lotto+"장의 로또를 구매합니다.");
    }
}
