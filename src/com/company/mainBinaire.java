package com.company;

public class mainBinaire {
    /**
     * fonction de recherche binaire
     * @param sortedArray   tableau de int triee
     * @param seacrh ellement recherché
     * @return
     */
    public static int tunBinarySeacrh(int sortedArray[],int seacrh){
        int index = -1;
        int low = 0;
        int max = sortedArray.length-1;
        while (low<=max){
            int mid = (low+max)/2;
            if (sortedArray[mid]<seacrh){
                low= mid+1;
            }else if (sortedArray[mid]>seacrh){
                max= mid-1;
            }else if (sortedArray[mid]==seacrh){
                index= mid;
                break;
            }
        }return index;
    }





    public static void main(String[] args) {
        int scores[]= {1,2,3,4,5,6,7,8,9};
        System.out.println(tunBinarySeacrh(scores, -10));








    }
}
