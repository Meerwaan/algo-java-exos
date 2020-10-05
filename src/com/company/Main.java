package com.company;

public class Main {

//    static void afficherscore(int scores[]){
//        for (int i=0;i< scores.length;i++){
//            System.out.println(scores[i]);
//        }
//    }
//
//    static int plusgrosscore(int scores[]){
//        int highS = 0;
//        for (int i = 0; i< scores.length; i++){
//            if (scores[i]>highS){
//                highS=scores[i];
//
//            }
//        }
//        return highS;
//    }

    static boolean supp10(int scores[]){
        int a=10;
        boolean supp10 = false;
        for (int i=0; i<scores.length; i++){
            if (scores[i]>=a){
                supp10= true;
                System.out.println(scores[i] + " est supp   a 10");
            }
        }
        return supp10;
    }

    public static void main(String[] args) {
	// write your code here
        int scores[]= {4,32,42,52,692,72,82,};
        int moyenne = 0;
        int total= scores.length;
        for (int i = 0; i< scores.length; i++){
            moyenne= moyenne + scores[i];

        }
//        System.out.println(moyenne/total);
//        afficherscore(scores);
        supp10(scores);
        //System.out.println(plusgrosscore(scores));



    }

}
