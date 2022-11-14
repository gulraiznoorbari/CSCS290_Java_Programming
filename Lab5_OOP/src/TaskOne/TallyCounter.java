package TaskOne;

public class TallyCounter {
	
	public int limit;
	public int count = 0;
	
	public TallyCounter(int count) {
		this.count = count;
	}
	
	public void setLimit(int maximum) {
		limit = maximum;
	}
	
	public void Button() {
		if (count >= limit) {
			System.out.println("Limit exceeded");
		}
		else if (count < limit) {
			count++;			
		}
	}
	
	public void print() {
		System.out.println("Total Number of People are: " + this.count);
	}

}
