/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.*/
 
public class CheckE{
    public static void main(String[] args) {
    int c=0;
    String s = "Umbrella";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)== 'e'){
            c=1;
        }
    }
    if(c<=1){
        System.out.println(" the letter e exists");
    }
    else{
        System.out.println(" the letter does not exist");
    }
}}