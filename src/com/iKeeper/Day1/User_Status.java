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

    public User_Status() {}


}
