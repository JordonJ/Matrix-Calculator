package in.jordon;

import in.jordon.matrix.Matricies;
import in.jordon.matrix.MatrixTable;

public class Launch {

	public static void main(String args[]) {
		MatrixTable table = MatrixTable.create(new int[] { 3, 1, 2 },
				new int[] { -2, 0, 5 });
		MatrixTable table1 = MatrixTable.create(new int[] { -1, 3 }, new int[] {
				0, 5 }, new int[] { 2, 5 });
		System.out.println(Matricies.multiply(table1, table));
	}
}
