package com.iKeeper.Day1;
import java.util.*;
import java.io.*;
public class HomeWork1 {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드리더 선언
        String s = input.readLine(); //한줄 입력
        StringTokenizer st = new StringTokenizer(s);
        String User_name = st.nextToken(); //첫번째(본인) 이름 설정
        String Enemy_name = st.nextToken(); //두번째(상대) 이름 설정

        User_Status myCharacter = new User_Status(User_name,(int)(Math.random()*201)+100,(int)(Math.random()*91)+10); // 사용자 status 생성
        User_Status EnemyCharacter =new User_Status(Enemy_name,(int)(Math.random()*201)+100,(int)(Math.random()*91)+10); // 상대 status 생성

    }
}
