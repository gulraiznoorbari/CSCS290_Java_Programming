package TaskOne;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		TallyCounter counter = new TallyCounter(count);
		counter.setLimit(4);
		counter.Button();
		counter.Button();
		counter.print();
		counter.Button();
		counter.Button();
		counter.print();
		counter.Button();
		counter.Button();
	}

}
