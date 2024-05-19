/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maxnum;

/**
 *
 * @author HP
 */
public class MaxNum {

    public int fiMaxNum(int A[]){
        int max = A[0];
        for(int i =0;i<A.length;i++){
            if(A[i]>max) max = A[i];
        }
        return max;
    }
}
