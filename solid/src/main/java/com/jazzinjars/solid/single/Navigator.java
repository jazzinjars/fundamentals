package com.jazzinjars.solid.single;

public class Navigator {

	private NextPositionResolver nextPositionResolver;
	private PositionRepairer positionRepairer;


	// An approach that does not break the single responsibility principle is:
	// - create a class that will resolve the next position
	// - and a class responsible for fixing the new position.
	// ->
	public Position beforeSolidNavigate(Position position, Direction direction) {

		Position nextPosition = resolve(position, direction);
		Position fixedPosition = fix(nextPosition);
		return fixedPosition;
	}

	public Position beforeSolidResolve(Position position, Direction direction) {

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

	public Position beforeSolidFix(Position position) {
		return new Position(position.getXAxis() < 0 ? 0 : position.getXAxis(), position.getYAxis() < 0 ? 0 : position.getYAxis());
	}

	// ->

	public Positionnavi(NextPositionResolver nextPositionResolver, PositionRepairer positionRepairer) {
		this
	}
}
