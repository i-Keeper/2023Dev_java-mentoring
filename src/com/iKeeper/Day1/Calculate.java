package com.iKeeper.Day1;
import java.util.*;
import java.io.*;
public class Calculate {
    private int n;
    private int m;
    Calculate(int n,int m){
        this.n=n;
        this.m=m;
    }
    public int Add(){
        return n+m;
    }
    public int Sub() {
        return n-m;
    }
    public int Mul(){
        return n*m;
    }
    public int Div(){
        return n/m;
    }
}