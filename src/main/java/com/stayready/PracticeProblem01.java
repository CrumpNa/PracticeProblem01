package com.stayready;

public class PracticeProblem01 {

    public boolean isPalindrome(String input){
        boolean isPalindrome=false; //bool to tell if palindrome or not
        char[] arr=input.toCharArray(); //change string input to a char array
       // now looks like this (a,b,a)
        int lastElem=arr.length-1; //gets last elem of char array
        for (int i=0;i<(arr.length)/2;i++){ //only goes to half of the word/array bc the middle elem doesnt have a matching pair if it is a palindrome
            if(arr[i]==arr[lastElem]){//runs thru array comparing 1st and last elem
                //if first elem equals last elem then
                isPalindrome=true; //marks bool as true
                lastElem--; //"last elem" moves inward , decreases in index
            }
        }

        return isPalindrome;
    }

    public String getSubPalindrome(String input){
        //The idea is to go through every substring starting from first character,
        // check if it is palindrome. If yes, then add the substring to solution and
        // recur for remaining part.
        //use split?
        char [] arr =input.toCharArray()Array(); //change string to array in order to draw out sub palindromes
        char [] arrSubs; //array that houses the subs
        int i=0;
        while(arr[i]>arr.length){
            //check if is a palindrome
            if(isPalindrome(arr[i].)==true){



            }
        }
        return "";
    }
}
