package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Mat_Mul_2D_Test {
	@Test
	@DisplayName("If it A*I = A")
	void MatMulTest() {
		Mat_Mul_2D Obj = new Mat_Mul_2D();
		int[][] Mat1 = {{1, 2}, 
						{3, 4},
						{5, 6}};
		int[][] Mat2 = {{1, 0}, 
						{0, 1}};
		int[][] Mat3 = Obj.MatrixMult2D(Mat1, Mat2);
		assertTrue(Obj.EqualMat(Mat3, Mat1));
	}
	@Test
	@DisplayName("If I*I = I")
	void MatMulTest2() {
		Mat_Mul_2D Obj = new Mat_Mul_2D();
		int[][] Mat1 = {{1, 0}, 
						{0, 1}};
		int[][] Mat3 = Obj.MatrixMult2D(Mat1, Mat1);
		assertTrue(Obj.EqualMat(Mat3, Mat1));
	}
	
	@Test
	@DisplayName("If it I*A = A")
	void MatMulTest3() {
		Mat_Mul_2D Obj = new Mat_Mul_2D();
		int[][] Mat1 = {{1, 2}, 
						{3, 4}};
		int[][] Mat2 = {{1, 0}, 
						{0, 1}};
		int[][] Mat3 = Obj.MatrixMult2D(Mat2, Mat1);
		assertTrue(Obj.EqualMat(Mat3, Mat1));
	}
	@Test
	@DisplayName("If it A*B = C")
	void MatMulTest4() {
		Mat_Mul_2D Obj = new Mat_Mul_2D();
		int[][] Mat1 = {{1, 2}, 
						{3, 4},
						{5, 6}};
		int[][] Mat2 = {{1, 2, 3},
						{4, 5, 6}};
		int[][] Mat3 = Obj.MatrixMult2D(Mat2, Mat1);
		int[][] Mat4 = {{22, 28},
						{49, 64}};
		assertTrue(Obj.EqualMat(Mat3, Mat4));
	}
	@Test
	@DisplayName("If it B*A = D")
	void MatMulTest5() {
		Mat_Mul_2D Obj = new Mat_Mul_2D();
		int[][] Mat1 = {{1, 2}, 
						{3, 4},
						{5, 6}};
		int[][] Mat2 = {{1, 2, 3},
						{4, 5, 6}};
		int[][] Mat3 = Obj.MatrixMult2D(Mat1, Mat2);
		int[][] Mat4 = {{9, 12, 15},
						{19, 26, 33},
						{29, 40, 51}};
		assertTrue(Obj.EqualMat(Mat3, Mat4));
	}
}