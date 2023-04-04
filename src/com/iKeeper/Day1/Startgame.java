package com.iKeeper.Day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

class Startgame {
    public Startgame() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); // 버퍼드리더 선언
        System.out.println("1P의 이름을 입력해주세요 : ");
        String User_name = input.readLine();
        System.out.println("2P의 이름을 입력해주세요 : ");
        String Enemy_name = input.readLine();
        User_Status myCharacter = new User_Status(User_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
        User_Status enemyCharacter = new User_Status(Enemy_name, (int) (Math.random() * 201) + 100, (int) (Math.random() * 91) + 10);
        System.out.println("==시작 전 설정된 Status==\n");
        System.out.println(myCharacter.name + " " + myCharacter.health + " " + myCharacter.attack);
        System.out.println(enemyCharacter.name + " " + enemyCharacter.health + " " + enemyCharacter.attack);


        int turn = 1;
        User_Status Newgame = new User_Status();
        //Startgame Cg = new Startgame();
        Playing playing = new Playing(myCharacter, enemyCharacter);
        System.out.println("게임을 시작합니다");
        playing.Attack_turn(1); //시작전 본인이름, 상대이름 설정 및 랜덤 체력 공격력 설정 후 출력
        System.out.println(myCharacter.health);

        System.out.println("다시 게임을 시작 하시겠습니까?(1 : 재시작, 2 : 종료)");


        if (myCharacter.health >= 0) {
            System.out.println(enemyCharacter.name + "의 승리!");
        } else if (enemyCharacter.health >= 0) {
            System.out.println(myCharacter + "의 승리!");
        }
    }

}




