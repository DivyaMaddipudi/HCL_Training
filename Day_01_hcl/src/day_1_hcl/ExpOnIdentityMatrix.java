package day_1_hcl;

public class ExpOnIdentityMatrix {

	public static void main(String[] args) {
		int x[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		for (int temp[] : x) {
			for (int val : temp) {
				System.out.print(val);
			}
			System.out.println();
		}

		System.out.println(isIdentity(x));
	}

	private static boolean isIdentity(int[][] x) {
		// check whether identity matrix
		boolean isIdentity = true;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (i == j) {
					if (x[i][j] != 1) {
						isIdentity = false;
						break;
					}
				} else if (x[i][j] != 0) {
					isIdentity = false;
					break;
				}
			}
		}
		return isIdentity;
	}

}
