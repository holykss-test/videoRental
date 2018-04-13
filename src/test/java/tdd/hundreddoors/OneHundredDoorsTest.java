package tdd.hundreddoors;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneHundredDoorsTest {

	@Test
	public void oneDoorNoPass() {
		OneHundredDoors oneHundredDoors = new OneHundredDoors(1);
		
		assertArrayEquals(new boolean[] {false}, oneHundredDoors.getDoorStates());
	}
	
	@Test
	public void oneDoorOnePass() {
		OneHundredDoors oneHundredDoors = new OneHundredDoors(1);
		
		oneHundredDoors.pass();
		
		assertArrayEquals(new boolean[] {true}, oneHundredDoors.getDoorStates());
	}


	@Test
	public void twoDoorsNoPass() {
		OneHundredDoors oneHundredDoors = new OneHundredDoors(2);
		
		assertArrayEquals(new boolean[] {false, false}, oneHundredDoors.getDoorStates());
	}
	
	@Test
	public void twoDoorsOnePass() {
		OneHundredDoors oneHundredDoors = new OneHundredDoors(2);
	
		oneHundredDoors.pass();
		
		assertArrayEquals(new boolean[] {true, true}, oneHundredDoors.getDoorStates());
	}

	@Test
	public void twoDoorsTwoPasses() {
		OneHundredDoors oneHundredDoors = new OneHundredDoors(2);
	
		oneHundredDoors.pass();
		oneHundredDoors.pass();
		
		assertArrayEquals(new boolean[] {true, false}, oneHundredDoors.getDoorStates());
	}

}
