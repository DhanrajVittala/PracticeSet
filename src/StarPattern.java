
public class StarPattern {

	public static void main(String[] args) {
		int n = 4;
		int nst =4;
		int nsp =0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= nst; k++) {
				System.out.print(" *");
			}
			nsp++;
			nst = nst -1;

			System.out.println();
		}

	}

}
