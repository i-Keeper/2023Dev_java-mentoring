package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class HomeWork1 {
    public static void main(String args[]) throws IOException {
        int turn =1;
        User_Status Newgame = new User_Status();
        Startgame Cg = new Startgame();
        System.out.println("게임을 시작합니다");
        Startgame.Cg(); //시작전 본인이름, 상대이름 설정 및 랜덤 체력 공격력 설정 후 출력
        Playing playing = new Playing();
        playing.Attack_turn(turn);



    }
}
