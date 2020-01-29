/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        String rev = "";
        if(s != null && !s.isEmpty()){
            char ch[] = s.toCharArray();

            for (int i = ch.length - 1; i >= 0; i--) {
                rev += ch[i];
            }
        }
        else {
            rev = null;       } //  handle String if NULL
        return rev;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        int decimal = 0;
        try {
            decimal = Integer.parseInt(s, 2);
        } catch (Exception e) {
            decimal = -1;
        }
        return decimal;

    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) {
        if (originalString != null && findString != null && newString != null && !originalString.isEmpty() && !findString.isEmpty() && !newString.isEmpty()) {
            originalString = originalString.toLowerCase();
            findString = findString.toLowerCase();
            newString = newString.toLowerCase();
            if (originalString.contains(findString)) {
                originalString = originalString.replace(findString, newString);
            } else {
                originalString = "String doesn't contain matched pattern";
            }
        }
        return  originalString;
    }
}
