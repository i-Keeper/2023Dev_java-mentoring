package com.iKeeper.Day1;

public class Playing extends Startgame {
    private static int turn;



     static void Attack_turn(int turn) {
        if (Playing.turn == 1) {
            System.out.println(myCharacter.name + "의 공격으로 시작하겠습니다.");
            System.out.println(myCharacter.name + "의 공격 " + myCharacter.attack + " + " + Add_Damage);
            myCharacter.attack += Add_Damage;
            EnemyCharacter.health = EnemyCharacter.health - myCharacter.attack;
            System.out.println(EnemyCharacter.name + "의 남은 체력 " + EnemyCharacter.health);
            Playing.turn =2;

        } else if (Playing.turn == 2) {
            System.out.println(EnemyCharacter.name + "의 공격 " + EnemyCharacter.attack + " + " + Add_Damage);
            EnemyCharacter.attack = EnemyCharacter.attack + Add_Damage;
            myCharacter.health = myCharacter.health - EnemyCharacter.attack;
            System.out.println(myCharacter.name + "의 남은 체력 " + myCharacter.health);
            Playing.turn =1;
        }
    }
}
