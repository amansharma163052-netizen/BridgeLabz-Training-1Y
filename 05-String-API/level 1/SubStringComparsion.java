package com.gla.Strings.level1;
import java.util.Scanner;

public class SubStringComparsion{

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result ="";
        for(int i=start; i<end; i++){
            result= result+text.charAt(i);
        }
        return result;
    }

    public static boolean compareSubstringUsingCharAt(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text");
        String text= sc.next();
        System.out.println("enter the start index");
        int start= sc.nextInt();
        System.out.print("Enter end index ");
        int end = sc.nextInt();

        String manualSubstring = createSubstringUsingCharAt(text, start, end);

        String builtInSubstring = text.substring(start, end);

        boolean isSame = compareSubstringUsingCharAt(manualSubstring, builtInSubstring);

        System.out.println("Substring using charAt() " + manualSubstring);
        System.out.println("Substring using substring() " + builtInSubstring);
        System.out.println("Are both substrings equal " + isSame);
    }
}
