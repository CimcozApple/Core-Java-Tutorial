package com.javaCodeChallenge.arrays;

/**
 * Unique Paths II
 * 
 * https://leetcode.com/problems/unique-paths-ii/
 * 
 * @author siddharth
 * @Created Oct 22, 2020
 *
 */
public class UniquePathsIIMatrix {

	public static void main(String[] args) {		
//		int[][] matrix = {
//				{0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,0,0,1,0,0,0},
//				{0,0,0,1,1,1,1,0,0,1,1,0,0,1,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0},
//				{0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1},
//				{0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//				{1,1,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,1},
//				{0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,0,0,1,0,0,0,1,0},
//				{1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0},
//				{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0},
//				{1,1,1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//				{0,1,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0},
//				{0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0},
//				{0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,1},
//				{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0},
//				{1,0,0,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0},
//				{0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,0},
//				{0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,1,1,1,1,0,0},
//				{1,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//				{0,1,0,1,0,0,0,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0},
//				{1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,0,1},
//				{0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,0},
//				{0,0,0,1,0,0,0,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
//				{0,1,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0},
//				{0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0},
//				{0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,0,0,1,0,0},
//				{0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,1,0,0,1,1,0,1,0,1,1,0,0,0,0,0},
//				{0,0,0,0,0,0,1,0,1,0,0,1,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,0,0,1,1},
//				{1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
//				{0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0},
//				{0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,1,0,0},
//				{0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,0,1,1,0,1,0,0},
//				{0,1,1,1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
//				{1,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,0}};
		int[][] matrix = {{0,0,0},{0,1,0},{0,0,0}};
		
		//int[][] matrix = {{1,0}};
		//int[][] matrix = {{0,0},{1,1},{0,0}};
		//System.out.println(uniquePaths(matrix, 0, 0));
		
		System.out.println(bestSolution(matrix));
	}
    
    private static int bestSolution(int[][] matrix) {
    	
    	for(int i=0; i< matrix.length; i++) {
    		for(int j=0; j< matrix[i].length; j++) {
    			if(matrix[i][j] == 1) {
    				matrix[i][j] = -1;
    			}
    		}
    	}
    	
    	int rw = matrix.length;
        int clm = matrix[0].length;
    	if(matrix[0][0] == 2  || matrix[rw-1][clm -1] ==2) {
    		return 0;
    	}
    	for(int i=0; i< rw; i++) {
    		
    		if(matrix[i][0] == 0) {	
    			matrix[i][0] = 1;
    		} else {
    			break;
    		}
    	}
    	
    	for(int j=0; j<clm; j++) {
    		if(matrix[0][j] == 0 || matrix[0][j] == 1) {
    			matrix[0][j] = 1;
    		} else {
    			break;
    		}
    		
    	}
    	
    	for(int i=1; i< matrix.length; i++) {
    		for(int j=1; j< matrix[i].length; j++) {
    			
    			if(matrix[i][j] != -1) {
    				int a = 0;
        			if(matrix[i-1][j]  != -1) {
        				a = matrix[i-1][j];
        			}
        			int b = 0;
        			if(matrix[i][j-1] != -1) {
        				b = matrix[i][j-1];
        			}
    				matrix[i][j] = a + b;
    			}
    			
    		}
    	}
    	
    	return matrix[rw-1][clm-1];
    }

}
