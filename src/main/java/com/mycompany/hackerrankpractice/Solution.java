package com.mycompany.hackerrankpractice;
import java.util.*;

public class Solution {
    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int result = 0;
    int maximum;
    int comparator = 0;
    
    for(int i = 0; i < candles.size(); i++){
        //3 1 2
        if(comparator<candles.get(i)) {
            comparator = candles.get(i);
        }
    }
    
    for(int i = 0; i < candles.size(); i++){
        //3 1 2 3 3 4 4 0
        if(comparator==candles.get(i)) {
            result++;
        }
    }
    
    
    return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Delia{}
    
    
}
