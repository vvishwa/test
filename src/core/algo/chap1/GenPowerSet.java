package core.algo.chap1;

public class GenPowerSet {

	public static void main(String[] args) {
		getSet();
	}

	private static void getSet() {
		int A[] = { 1, 2, 3, 4, 5 };
		int N = 5;
		int Total = 1 << N;
		for (int i = 0; i < Total; i++) {
			for (int j = 0; j < N; j++) {
				int k = (i >> j) & 1;
				if ( k > 0)
					System.out.println(A[j]);
			}
			System.out.println();
		}
	}
}
