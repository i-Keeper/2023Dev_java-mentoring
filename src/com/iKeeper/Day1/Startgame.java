package com.iKeeper.Day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Startgame {
    int attack;
    static User_Status myCharacter;
    static User_Status EnemyCharacter;

    static int Add_Damage = (int) (Math.random() * 91) + 10;

    public Startgame() {
    }

    static void Cg() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드리더 선언
        System.out.println("1P의 이름을 입력해주세요 : ");
        String s = input.readLine();
        StringTokenizer st = new StringTokenizer(s);

        String User_name = st.nextToken();
        try {
            String Enemy_name = st.nextToken();
            User_Status myCharacter = new User_Status(User_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
            User_Status EnemyCharacter = new User_Status(Enemy_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
            System.out.println("==시작 전 설정된 Status==\n");
            System.out.println(myCharacter.name + " " + myCharacter.health + " " + myCharacter.attack);
            System.out.println(EnemyCharacter.name + " " + EnemyCharacter.health + " " + EnemyCharacter.attack);
        } catch (NoSuchElementException e) {
            System.out.println("2P의 이름을 입력해주세요 : ");
            String Enemy_name = input.readLine();
            User_Status myCharacter = new User_Status(User_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
            User_Status EnemyCharacter = new User_Status(Enemy_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
            System.out.println("==시작 전 설정된 Status==\n");
            System.out.println(myCharacter.name + " " + myCharacter.health + " " + myCharacter.attack);
            System.out.println(EnemyCharacter.name + " " + EnemyCharacter.health + " " + EnemyCharacter.attack);

        }
    }
}




