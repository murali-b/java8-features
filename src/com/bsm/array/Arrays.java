package com.bsm.array;

import javax.xml.transform.Source;

public class Arrays {
    public static void main(String args[]){
        double[] sda = {10,20,90,30,5,40,50,80,60,70};
        //find the maximum value of the array
        double max = sda[0];
        for (double v : sda) {
            if (v > max)
                max = v;
        }
        System.out.println("max value :: "+(int)max);
        //find the minimum value of the array
        double min = sda[0];
        for (double v : sda) {
            if (v < min)
                min = v;
        }
        System.out.println("max value :: "+(int)min);
        //compute average of the array values
        int n = sda.length;
        double sum = 0.0;
        for(var v : sda)
            sum += v;
        System.out.println("Average of the array :: "+sum/n);
        //copy to another array
        int[] copySDA = new int[sda.length];
       // System.arraycopy(sda, 0, copySDA, 0, sda.length);
        for(int i = 0; i < sda.length ; i++){
            copySDA[i] = (int)sda[i];
        }
        for (var v: copySDA)
            System.out.println(v);

        //Binary Search
        int search=50;
        int lo = 0;
        int hi = copySDA.length-1;
        int midVal=0;
        //sort
        for (int i=0;i<copySDA.length;i++){
            for (int j= i+1; j < copySDA.length; j++) {
                if (copySDA[j] < copySDA[i]) {
                    int val = copySDA[i];
                    copySDA[i] = copySDA[j];
                    copySDA[j] = val;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(copySDA));
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            System.out.println("mid :: "+mid);
            if(copySDA[mid] > search)
                hi = mid-1;
            else if(copySDA[mid]<search)
                lo = mid+1;
            else{
                midVal=mid;
                break;
            }

        }
        System.out.println("MidValue :: "+copySDA[midVal]+"key ::"+(midVal+1));
    }
}
