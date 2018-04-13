package tdd.hundreddoors;

public class OneHundredDoors {
	private int pass;
	private boolean[] doorStates;
	private int doorCount;

	public OneHundredDoors(int doorCount) {
		this.doorCount = doorCount;
		if ( doorCount == 1 )
			 doorStates = new boolean[] {false};
		else
			 doorStates = new boolean[] {false,false};
	}

	public boolean[] getDoorStates() {
		return doorStates;
	}

	private boolean[] changeDoorStates() {
		if ( doorCount == 2 ) {
			if ( pass == 2 ) {
				doorStates[1] = !doorStates[1];
				return doorStates;
			}
			if ( pass == 1 ) {
				doorStates[0] = !doorStates[0];
				doorStates[1] = !doorStates[1];
				
				return doorStates;
			}
			return doorStates;
		}
		if ( pass == 1 ) {
			doorStates[0] = !doorStates[0];
			return doorStates;
		}
		return doorStates;
	}

	public void pass() {
		pass++;
		changeDoorStates();
	}

}
