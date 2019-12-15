package com.yildizozan;

public class Matrix {
	private int row;
	private int col;
	private int[][] data;

	public Matrix(int row, int col) {
		this.data = new int[row][col];
	}

	public Matrix(int size) {
		this.setRow(size);
		this.setCol(size);

		this.data = new int[size][size];

		final int N = size / 2;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				// Part A
				if (row < N && col < N) {
					this.data[row][col] = 1;
				}

				// Part B
				if (row < N && N <= col && col < 2 * N) {
					this.data[row][col] = 2;
				}

				// Part C
				if (N <= row && row < 2 * N && col < N) {
					this.data[row][col] = 3;
				}

				// Part D
				if (N <= row && row < 2 * N && N <= col && col < 2 * N) {
					this.data[row][col] = 4;
				}
			}
		}
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		for (int row = 0; row < this.row; row++) {
			for (int col = 0; col < this.col; col++) {
				String str = String.valueOf(this.data[row][col]);
				builder.append(str);
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
