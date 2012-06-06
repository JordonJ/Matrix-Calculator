package in.jordon.matrix;

public class MatrixTable {

	private final int[][] rows;

	private MatrixTable(int[][] rows) {
		this.rows = rows;
	}

	public int getRows() {
		return rows.length;
	}

	public int getColumns() {
		return rows[0].length;
	}

	public static MatrixTable create(int[]... rows) {
		return new MatrixTable(rows);
	}

	public int size() {
		return getRows() * getColumns();
	}

	public String dimension() {
		return getRows() + " x " + getColumns();
	}

	public int getElement(int row, int column) {
		return rows[row][column];
	}

	public int[] getColumn(int column) {
		int[] rColumn = new int[rows.length];
		for (int i = 0; i < rows.length; i++)
			rColumn[i] = rows[i][column];
		return rColumn;
	}

	public int[] getRow(int row) {
		return rows[row];
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < rows.length; i++) {
			builder.append("| ");
			for (int j = 0; j < rows[i].length; j++) {
				if (rows[i][j] > 0)
					builder.append(" ");
				builder.append(rows[i][j] + " ");
			}
			builder.append(" |\n");
		}
		return builder.toString();
	}
}
