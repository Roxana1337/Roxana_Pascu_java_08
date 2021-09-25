package ro.sci.String_Array;

import java.util.Arrays;

public class String_Array {

    public static void main(String[] args){

        String [] stringArray = new String[] {"My", "name", "is", "Roxana", "Pascu"};
        String spaceBetweenWords = " ";
        System.out.println("My wanted proposition is: " + String.join(spaceBetweenWords, stringArray));
        }
    }
