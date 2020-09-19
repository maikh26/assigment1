package najah.edu.acceptance_test;

public class Market {
private int  Total= 0;

		public void add(Integer count, int price) {
			Total += (count * price);
	}

		public int total() {
			return 	Total;
		}

		
}
