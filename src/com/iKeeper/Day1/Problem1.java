package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class Problem1 {
    public static void main(String []args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        int c = (char)bf.read();
        int m =Integer.parseInt(bf.readLine());
        Calculate myCalculate = new Calculate();

        switch(c){
            case'+':
                Calculate.Add(n,m);
                break;
            case'-':
                Calculate.Sub(n,m);
                break;
            case'*':
                Calculate.Mul(n,m);
                break;
            case'/':
                Calculate.Div(n,m);
                break;
            default:
                System.out.println("올바른 연산이 아닙니다.");
        }
    }
}
