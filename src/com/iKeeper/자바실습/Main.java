package com.iKeeper.자바실습;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StackApp.run();
    }
}
interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 저장된 실수 리턴
    boolean push(String val); // 스택의 톱(top)에 실수 저장
}
class StringStack implements Stack {
    private String[] data; // 스택에 저장할 배열
    private int top; // 스택의 톱(top) 위치

    public StringStack(int capacity) {
        data = new String[capacity];
        top = -1;
    }

    public int length() {
        return top + 1;
    }

    public int capacity() {
        return data.length;
    }

    public String pop() {
        if (top < 0) { // 스택이 비어있는 경우
            return null;
        }
        String val = data[top];
        data[top--] = null;
        return val;
    }

    public boolean push(String val) {
        if (top + 1 == data.length) { // 스택이 가득 찬 경우
            return false;
        }
        data[++top] = val;
        return true;
    }
}
class StackApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        StringStack stack = new StringStack(capacity);

        while (true) {
            String val = scanner.next();
            if (val.equals("그만")) { // "그만"을 입력한 경우
                break;
            }
            if (!stack.push(val)) { // 스택이 가득 찬 경우
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while (true) {
            String val = stack.pop();
            if (val == null) { // 스택이 비어있는 경우
                break;
            }
            System.out.print(val + " ");
        }
        scanner.close();
    }
}
