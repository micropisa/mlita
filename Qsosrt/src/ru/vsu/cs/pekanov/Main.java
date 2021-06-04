package ru.vsu.cs.pekanov;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	int [] arr1 = {8,-3,12,78,-22,0,1,-6,58,88,2,7};
	int left = 0;
	int right = arr1.length-1;

        System.out.println("Было");
        System.out.println(Arrays.toString(arr1));

        Qsort1(arr1,left,right);

        System.out.println("Было");
        System.out.println(Arrays.toString(arr1));



    }

    public static void Qsort1( int arr[], int left, int right){


        if(arr.length == 0){
            return;
        }

        if (left>=right){
            return;
        }

        int count = 1;

        int middle = left + (right - left) / 2;
        int pivot = arr[middle];
        int l =left;
        int r = right;

        while (l<=r){

            while (arr[l] < pivot){
                l++;
            }

            while (arr[r] > pivot){
                r--;
            }

            if(l<=r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

        }

        System.out.println("["+count+"] - " +Arrays.toString(arr) );

        count ++;


        if (left < r)
            Qsort1(arr, left, r);

        if (right > l)
            Qsort1(arr, l, right);
    }


    }



