package com.iKeeper.Day1;

public class Playing {
    private static int turn;
    private User_Status myCharacter;
    private User_Status enemyCharacter;

    public Playing(User_Status myCharacter, User_Status enemyCharacter) {
        this.myCharacter=myCharacter;
        this.enemyCharacter=enemyCharacter;
    }

    public int Add_Damage(){
        return (int) (Math.random() * 91) + 10;
    }
     void Attack_turn(int turn) {
         while (myCharacter.health >= 0 && enemyCharacter.health >= 0) {
             if (turn == 1) {
                 System.out.println(myCharacter.name + "의 공격으로 시작하겠습니다.");
                 int add_damage = Add_Damage();
                 System.out.println(myCharacter.name + "의 공격 " + myCharacter.attack + " + " + add_damage);

                 enemyCharacter.health = enemyCharacter.health - (myCharacter.attack + add_damage);
                 System.out.println(enemyCharacter.name + "의 남은 체력 " + enemyCharacter.health);
                 turn = 2;

             } else if (turn == 2) {
                 int add_damage = Add_Damage();
                 System.out.println(enemyCharacter.name + "의 공격 " + enemyCharacter.attack + " + " + add_damage);

                 myCharacter.health = myCharacter.health - (enemyCharacter.attack + add_damage);
                 System.out.println(myCharacter.name + "의 남은 체력 " + myCharacter.health);
                 turn = 1;
             }
         }
         }
     }

