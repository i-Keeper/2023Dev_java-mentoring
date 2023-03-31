package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class Problem1 {
    public static void main(String []args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(bf.readLine());
        int c = (char)bf.read();
        int m =Integer.parseInt(bf.readLine());
        int temp=0;
        Calculate myCalculate = new Calculate();

        switch(c){
            case'+':
                temp= Calculate.Add(n,m);
                break;
            case'-':
                temp= Calculate.Sub(n,m);
                break;
            case'*':
                temp
        }
    }
}
