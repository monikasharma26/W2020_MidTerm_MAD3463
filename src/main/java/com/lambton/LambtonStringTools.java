/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import com.sun.tools.javac.util.Convert;

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
            String[] temp = s.split("\\s+");
            for (int i = 0; i < temp.length; i++) {
                if (i == temp.length - 1)
                    rev = temp[i] + rev;
                else
                    rev = " " + temp[i] + rev;
            }
        }
        else {
            rev = null;
        } //  handle String if NULL
        return rev;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s)
    {
        String cap = "";
        if(!s.isEmpty() && s!=null) {
            String[] words = s.split("\\s+"); // SPace
            int i = 0;
            if (words.length == 3) {
                cap = words[0].substring(0, 1).toUpperCase() + ". "
                        + words[1].substring(0, 1).toUpperCase() + ". "
                        + words[2].substring(0, 1).toUpperCase() + words[2].substring(1).toLowerCase();
            } else {
                cap = null;
            }
        }
        else
        {
            cap=null;
        }
        return cap;

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s)
    {
        String mostFrequentResult="";
        if(s!=null && !s.isEmpty()) {
            int charactercount = 256;
            int[] count = new int[charactercount];
            int i;
            for (i = 0; i < s.length(); i++)
                (count[s.charAt(i)])++;
            int mostFrequent = 0;
            for (i = 0; i < charactercount; i++) {
                if (count[i] > count[mostFrequent]) {
                    mostFrequent = i;
                } else if (count[i] == count[mostFrequent]) {
                    mostFrequent = i;
                }
            }
            mostFrequentResult = Character.toString(((char) mostFrequent)); // Convert char to string
        }
        else
        {
            mostFrequentResult=null;
        }
        return mostFrequentResult ;
    }

    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
        int decimal = 0;
        if(s!=null) {
            try {
                decimal = Integer.parseInt(s, 2);
            } catch (Exception e) {
                decimal = -1;
            }
        }
        else
        {
            decimal=0;
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
