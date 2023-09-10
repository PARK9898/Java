package main.Exception;

import main.Collection.Unit;
import main.classStudy.Generic1.Side;

class Dragon extends Unit {
	public Dragon(Side side) {
		super(side, 3000);
	}

	@Override
	public String toString() {
		return side.toString() + " 진영 드래곤";
	}
}