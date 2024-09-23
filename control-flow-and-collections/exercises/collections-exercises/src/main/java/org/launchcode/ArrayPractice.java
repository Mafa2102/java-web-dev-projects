package org.launchcode;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] arg) {

        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.ArrayResult();
        arrayPractice.splitString();
    }
    public ArrayPractice(){

    }
        public void ArrayResult() {
            int[] integerArray = {1, 1, 2, 3, 5, 8};
//            for (int j: integerArray){
//                if(j % 2 != 0) {
//                    System.out.println(integerArray[j]);
//                }
            for(int i = 0; i < integerArray.length; i++){
                if(integerArray[i] % 2 != 0) {
                    System.out.println(integerArray[i]);
                }
            }
        }

    public void splitString(){
        String phrase = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        String[] strSentenceArray = phrase.split("\\.");
        System.out.println(Arrays.toString(strSentenceArray));
    }
    }
