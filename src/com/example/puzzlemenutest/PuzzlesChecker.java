package com.example.puzzlemenutest;

import android.graphics.Bitmap;

import com.example.puzzlemenutest.util.Matrix;

public class PuzzlesChecker {
	private Matrix<Bitmap> startPuzzles;

	public PuzzlesChecker(Matrix<Bitmap> puzzles) {
		startPuzzles = new Matrix<Bitmap>(puzzles);
	}

	public boolean puzzleAssembled(Matrix<Bitmap> puzzles) {
		for (int row = 0; row < puzzles.rows; ++row) {
			for (int column = 0; column < puzzles.columns; ++column) {
				if (startPuzzles.get(row, column) != puzzles.get(row, column)) {
					return false;
				}
			}
		}
		return true;
	}
}
