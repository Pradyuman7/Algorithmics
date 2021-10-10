package com.pd.algorithms;

public class Mat_Mul_2D {
	public int[][] MatrixMult2D(int[][] Mat1, int[][] Mat2) {
		if(Mat1[0].length == Mat2.length) {
			int[][] Mat = new int[Mat1.length][Mat2[0].length];
			for(int i = 0; i<Mat1.length; i++) {
				for(int j = 0; j<Mat2[0].length; j++) {
					Mat[i][j] = 0;
					for(int k = 0; k<Mat2.length; k++) {
						Mat[i][j] += Mat1[i][k]*Mat2[k][j];
					}
				}
			}
			return Mat;
		}else {
			System.out.println("Matrix cannot be multiplicated due to their uncompatible orders");
			return null;
		}
	}
	
	public void ShowMat(int[][] Mat) {
		if(Mat == null) {
			System.out.println("Matrix is None");
		}else {
			for(int[] ele:Mat) {
				for(int i = 0; i<Mat[0].length; i++) {
					System.out.print(ele[i]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public boolean EqualMat(int[][] Mat1, int[][] Mat2) {
		if(Mat1 == null || Mat2 == null) {
			if(Mat1 != null || Mat2 != null) {
				return false;				
			}
		}
		if(Mat1[0].length == Mat2[0].length && Mat1.length == Mat2.length) {
			for(int i = 0; i<Mat1.length; i++) {
				for(int j = 0; j<Mat1[0].length; j++) {
					if(Mat1[i][j] != Mat2[i][j]) {
						return false;
					}
				}
			}
			return true;
		}else {
			return false;
		}
	}
}