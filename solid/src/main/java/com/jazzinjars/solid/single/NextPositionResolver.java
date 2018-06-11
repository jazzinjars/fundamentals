package com.jazzinjars.solid.single;

public class NextPositionResolver {

	// The NextPositionResolver class will resolve the next position based on the direction given.
	public Position resolve(Position position, Direction direction) {

		switch (direction) {
			case N:
				return new Position(position.getXAxis(), position.getYAxis() + 1);
			case S:
				return new Position(position.getXAxis(), position.getYAxis() - 1);
			case E:
				return new Position(position.getXAxis() - 1, position.getYAxis());
			case W:
				return new Position(position.getXAxis() - 1, position.getYAxis());
			default:
				throw new IllegalArgumentException();
		}
	}
}
