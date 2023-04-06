package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class WEEK3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        int a= sc.nextInt();
        char c= sc.next().charAt(0);
        int b= sc.nextInt();
        if(c=='/') {
            int result = div(a, b);
        }
            System.out.println("정상입니다.");
    }
        catch(ArithmeticException e){
            System.out.println("0이 입력되었습니다"+e.getMessage());

        }
        catch( InputMismatchException er){
            System.out.println("NULL이 입력되었습니다."+er.getMessage());
        }


    }
    public static int div(int a,int b)throws ArithmeticException{
        if(b==2){
        throw new ArithmeticException("Cannot divide by zero");
    }
        return a/b;
    }
}
