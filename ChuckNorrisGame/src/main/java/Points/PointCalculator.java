package Points;

import Enums.Operation;

public class PointCalculator
{
	private static PointCalculator calculator = new PointCalculator();
	private int points;

	private PointCalculator()
	{
		points = 0;
	}

	public static PointCalculator getInstance()
	{
		return calculator;
	}

	public void SetPoints(Operation operation)
	{
		points += operation.getValue();
	}

	public int getPoints()
	{
		return points;
	}
}
