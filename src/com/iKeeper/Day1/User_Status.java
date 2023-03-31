package com.iKeeper.Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class User_Status {

    String name;
    int attack;
    int health;

    public User_Status(String name, int health, int attack)
    {
        this.name=name;
        this.health=health;
        this.attack=attack;
    }

    public User_Status() {

    }

    void CreatGame() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드리더 선언
        String s = input.readLine(); //한줄 입력
        StringTokenizer st = new StringTokenizer(s);
        String User_name = st.nextToken(); //첫번째(본인) 이름 설정
        String Enemy_name = st.nextToken(); //두번째(상대) 이름 설정

        User_Status myCharacter = new User_Status(User_name,(int)(Math.random()*201)+100,(int)(Math.random()*91)+10);
        User_Status EnemyCharacter =new User_Status(Enemy_name,(int)(Math.random()*201)+100,(int)(Math.random()*91)+10);

        System.out.println(myCharacter.name+" "+myCharacter.health+" "+myCharacter.attack);
        System.out.println(EnemyCharacter.name+" "+EnemyCharacter.health+" "+EnemyCharacter.attack);
    }
}
