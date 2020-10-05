package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int scores[]= {24,32,42,52,62,72,82};
        int moyenne = 0;
        int total= scores.length;
        for (int i= 0; i<scores.length; i++){
            int s = scores[i];
            System.out.println(scores[i]);

        }

        for (int i = 0; i< scores.length; i++){
            moyenne= moyenne + scores[i];

        }
        System.out.println(moyenne/total);



    }
}
