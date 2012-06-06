package in.jordon.matrix;

public class Matricies {

	private Matricies() {
	}

	public static MatrixTable add(MatrixTable table1, MatrixTable table2) {
		if (!table1.dimension().equals(table2.dimension()))
			throw new IllegalArgumentException("Tables are not the same size!");
		int[][] newMatrixRows = new int[table1.getRows()][table1.getColumns()];
		for (int row = 0; row < table1.getRows(); row++) {
			for (int column = 0; column < table1.getColumns(); column++) {
				newMatrixRows[row][column] = table1.getElement(row, column)
						+ table2.getElement(row, column);
			}
		}
		return MatrixTable.create(newMatrixRows);
	}

	public static MatrixTable multiply(MatrixTable table1, MatrixTable table2) {
		int[][] newMatrixRows = new int[2][2];
		for (int row = 0; row < table1.getRows(); row++) {
			for (int column = 0; column < table1.getColumns(); column++) {
				newMatrixRows[row][column] = multiply(table1.getRow(row),
						table2.getColumn(column));
			}
		}

		return MatrixTable.create(newMatrixRows);
	}

	private static int multiply(int[] vector1, int[] vector2) {
		int base = 0;
		for (int i = 0; i < vector1.length; i++) {
			base += vector1[i] * vector2[i];
		}
		return base;
	}

	public static MatrixTable subtract(MatrixTable table1, MatrixTable table2) {
		return null;
	}

}
