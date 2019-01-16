
public class FrogSimulator {
	private int goalDistance;
	private int maxHops;

	public boolean simulate() {
		int currentDistance = 0;
		for (int i = 0; i < maxHops; i++) {
			int currentHop = hopDistance();
			currentDistance += currentHop;
			if (currentDistance >= goalDistance)
				return true;

		}
		return false;
	}
	
	public double runSimulatuons(int num) {
		int numSuccess = 0;
		for(int i = 0; i<num; i++) {
			if(simulate()) {
				numSuccess++;
			}
		}
		return (double)numSuccess / num;
	}

	private int hopDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
}