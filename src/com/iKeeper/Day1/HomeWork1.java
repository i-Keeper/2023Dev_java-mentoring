package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class HomeWork1 {
    int count=2;
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int restart;
        do{
            new Startgame();
            restart = Integer.parseInt(input.readLine());
            if(restart==2){
                break;
            }
        }while(restart==1);






    }
}
