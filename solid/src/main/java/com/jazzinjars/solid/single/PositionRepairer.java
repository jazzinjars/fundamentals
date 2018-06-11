package com.jazzinjars.solid.single;

public class PositionRepairer {

	// The PositionRepairer class will fix the position in case of invalid x or y values.
	public Position fix(Position position) {
		return new Position(position.getXAxis() < 0 ? 0 : position.getXAxis(), position.getYAxis() < 0 ? 0 : position.getYAxis());
	}
}
