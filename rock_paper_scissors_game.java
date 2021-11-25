package com.java;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock,1 for paper and 2 for scissor");
        int user_inp = sc.nextInt();
        Random random = new Random();
        int com_inp = random.nextInt(3);
        if(user_inp==com_inp){
            System.out.println("draw");
        }
        else if(user_inp==0 && com_inp==2 || user_inp==1 && com_inp==0){
            System.out.println("you win");
        }
        else {
            System.out.println("computer win");
        }
        if (com_inp==0){
            System.out.println("computer choice: rock");
        }
        else if (com_inp==1){
            System.out.println("computer choice: paper");
        }
        else if (com_inp==2){
            System.out.println("computer choice: scissor");
        }

    }
}