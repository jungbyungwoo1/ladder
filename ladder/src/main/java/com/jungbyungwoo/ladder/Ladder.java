package com.jungbyungwoo.ladder;

import java.util.ArrayList;

public class Ladder {
	private ArrayList<ArrayList<Steps>> map;

	public Ladder(int width, int height) {
		map = new ArrayList<ArrayList<Steps>>();

		for (int i = 0; i < width; i++) {
			map.add(setDefaultPath(height));
		}
	}

	private ArrayList<Steps> setDefaultPath(int height) {
		ArrayList<Steps> path = new ArrayList<Steps>();

		for (int i = 0; i < height; i++) {
			path.add(Steps.BELOW);
		}

		return path;
	}

	public void addBranch(int depth, int start) {
		map.get(start - 1).set(depth - 1, Steps.RIGHT);
		map.get(start).set(depth - 1, Steps.LEFT);
	}

	public int getResult(int start) {
		int current = start - 1;
		int height = map.get(0).size();
		
		for (int i = 0; i < height; i++) {
			switch (map.get(current).get(i)) {
				case LEFT :
					current--;
					break;
				case RIGHT :
					current++;
					break;
				case BELOW :
					// Nothing
					break;
			}
		}
		
		return current + 1;
	}
}
