package com.stackroute.pe3;

//Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console

import java.util.ArrayList;
import java.util.List;

public class VowelRemoval {
    public List<String> removeVowel(String[] countries)  //method to remove vowel from the input
    {
        List<String> country = new ArrayList<>();
        for (int i=0;i<countries.length;i++) {
            String name="";
            for(char c:countries[i].toCharArray()) {
                if(Character.isLetter(c)) { //condition to check for vowel
                    if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) {
                        name = name+c;
                    }
                }
                else {
                    name = name +c;
                }
            }
            country.add(name);
        }
        return country;
    }
}