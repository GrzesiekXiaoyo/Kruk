package Points;

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

	public void AddPoints()
	{
		points++;
	}

	public void SubPoints()
	{
		points--;
	}

	public int getPoints()
	{
		return points;
	}
}
