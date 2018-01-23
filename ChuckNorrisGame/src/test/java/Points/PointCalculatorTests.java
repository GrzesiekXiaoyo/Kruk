package Points;

import Enums.Operation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointCalculatorTests
{
	private PointCalculator instance = PointCalculator.getInstance();

	@Before
	public void BeforeEach()
	{
		instance.resetPoints();
	}

	@Test
	public void WhenGetInstanceIsCalledThenAlwaysReturnTheSameObject()
	{
		PointCalculator secondInstance = PointCalculator.getInstance();

		Assert.assertSame(instance, secondInstance);
	}

	@Test
	public void WhenGetPointsIsCalledOnStartThen0IsReturned()
	{
		int expected = 0;

		int result = instance.getPoints();

		Assert.assertSame(expected, result);
	}

	@Test
	public void WhenSetPointsIsCalledWIthAddOperationThen1IsReturned()
	{
		int expected = 1;

		instance.SetPoints(Operation.Add);
		int result = instance.getPoints();

		Assert.assertSame(expected, result);
	}

	@Test
	public void WhenSetPointsIsCalledWIthAddOperationThenMinus1IsReturned()
	{
		int expected = -1;

		instance.SetPoints(Operation.Sub);
		int result = instance.getPoints();

		Assert.assertSame(expected, result);
	}
}
