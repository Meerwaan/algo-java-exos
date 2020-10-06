package com.company;

public class Main {
    /**
     * affiche tous les scores du tableau
     * @param scores int qui est la totaliter des scores du tableau
     */
    static void afficherscore(int scores[]){
        for (int i=0;i< scores.length;i++){
            System.out.println(scores[i]);
        }
    }

    /**
     * cherche le plus gros score du tableau
     * @param scores int qui est les differents  scores
     * @return highS qui est le scores le plus haut
     */
    static int plusgrosscore(int scores[]){
        int highS = 0;
        for (int i = 0; i< scores.length; i++){
            if (scores[i]>highS){
                highS=scores[i];

            }
        }
        return highS;
    }

    /**
     * Permet de savoir si il y a ou non une valeur inferieur a 10
     * @param scores int les different scores du tableau
     * @return supp10 boolean qu confirme si il y a une valeur inf a 10
     */
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
        int scores[]= {40,32,42,52,692,72,82,};
        int moyenne = 0;
        int total= scores.length;
        for (int i = 0; i< scores.length; i++){
            moyenne= moyenne + scores[i];

        }
//        System.out.println(moyenne/total);
//        afficherscore(scores);
//        supp10(scores);
//        System.out.println(plusgrosscore(scores));



    }

}
