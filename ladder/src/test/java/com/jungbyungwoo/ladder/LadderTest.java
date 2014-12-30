package com.jungbyungwoo.ladder;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class LadderTest {
	private Ladder ladder3by3;
	private Ladder ladder6by10;
	
	@Before
	public void setUp() {
		ladder3by3 = new Ladder(3, 3);
		
		ladder3by3.addBranch(1, 1);
		ladder3by3.addBranch(2, 2);
		ladder3by3.addBranch(3, 1);
		
		ladder6by10 = new Ladder(6, 10);
		
		ladder6by10.addBranch(1, 1);
		ladder6by10.addBranch(6, 1);
		ladder6by10.addBranch(9, 1);
		
		ladder6by10.addBranch(3, 2);
		ladder6by10.addBranch(5, 2);
		ladder6by10.addBranch(8, 2);
		
		ladder6by10.addBranch(4, 3);
		ladder6by10.addBranch(7, 3);
		ladder6by10.addBranch(10, 3);
		
		ladder6by10.addBranch(2, 4);
		ladder6by10.addBranch(6, 4);
		ladder6by10.addBranch(8, 4);
		
		ladder6by10.addBranch(3, 5);
		ladder6by10.addBranch(5, 5);
		ladder6by10.addBranch(7, 5);
	}
	
	@Test
	public void testGetResult3by3() {
		assertThat(ladder3by3.getResult(1), is(3));
		assertThat(ladder3by3.getResult(2), is(2));
		assertThat(ladder3by3.getResult(3), is(1));
	}

	@Test
	public void testGetResult6by10() {
		assertThat(ladder6by10.getResult(1), is(6));
		assertThat(ladder6by10.getResult(2), is(4));
		assertThat(ladder6by10.getResult(3), is(5));
		assertThat(ladder6by10.getResult(4), is(1));
		assertThat(ladder6by10.getResult(5), is(2));
		assertThat(ladder6by10.getResult(6), is(3));
	}
}
