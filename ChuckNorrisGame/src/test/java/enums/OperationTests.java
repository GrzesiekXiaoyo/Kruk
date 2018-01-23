package enums;

import Enums.Operation;
import org.junit.Assert;
import org.junit.Test;

public class OperationTests
{
	@Test
	public void WhenGetValueIsCalledOnAddThen1IsReturned()
	{
		int result = Operation.Add.getValue();

		Assert.assertSame(1, result);
	}

	@Test
	public void WhenGetValueIsCalledOnAddThenMinus1IsReturned()
	{
		int result = Operation.Sub.getValue();

		Assert.assertSame(-1, result);
	}
}
