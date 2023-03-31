package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class Startgame {
    int attack;
    int Damage(int attack){
        return attack+=(int)((Math.random()*91)+10);
    }
    public Startgame(int attack){
        this.attack = attack;

    }

}
