package com.iKeeper.Day1;

public class Calculate {
    private int n;
    private int m;
    static int result=0;

    Calculate(){
        this.n=n;
        this.m=m;
        this.result=result;
    }
    public static int Add(int n, int m){
        return result+n+m;
    }
    public static int Sub(int n, int m) {
        return result-n-m;
    }
    public static int Mul(int n, int m){
        return result*n*m;
    }
    public static int Div(int n, int m) {return result/n/m; }
}