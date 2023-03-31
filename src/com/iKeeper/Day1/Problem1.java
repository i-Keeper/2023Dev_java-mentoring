package com.iKeeper.Day1;
import java.util.*;
import java.io.*;

public class Problem1 {
        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String expression = br.readLine().replaceAll(" ", "");
            int result = Calculator.calculate(expression);
            System.out.println(result);
        }
    }
