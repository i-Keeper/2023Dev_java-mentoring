package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class Problem1 {
    public static void main(String []args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        String[] tokens = str.split("[+\\-*/]");

        int n = Integer.parseInt(tokens[0]);
        char c = str.replaceAll("[^+\\-*/]", "").charAt(0);
        int m = Integer.parseInt(tokens[1]);
        int result =0;


        Calculate myCalculate = new Calculate();
                switch(c){
                    case'+':
                        result =Calculate.Add(n,m);
                        break;
                    case'-':
                        result = Calculate.Sub(n,m);
                        break;
                    case'*':
                        result = Calculate.Mul(n,m);
                        break;
                    case'/':
                        if(m==0){
                            System.out.println("0으로 나눌 수 없습니다.");
                        }
                        else{
                        result = Calculate.Div(n,m);
                        break;}
                    default:
                        System.out.println("올바른 연산이 아닙니다.");
            }
        System.out.println(result);
    }
}
