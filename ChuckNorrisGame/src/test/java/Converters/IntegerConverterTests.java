package Converters;

import org.junit.Assert;
import org.junit.Test;

public class IntegerConverterTests
{
	@Test
	public void WhenInputIsStringWhichCanBeConvertToIntegerThenIsConverted()
	{
		String input = "12";

		int result = IntegerConverter.convert(input);

		Assert.assertSame(12, result);
	}

	@Test
	public void WhenInputIsStringWhichCanNotBeConvertToIntegerThenIsNotConverted()
	{
		String input = "abc";

		int result = IntegerConverter.convert(input);

		Assert.assertSame(0, result);
	}

	@Test
	public void WhenInputIsDoubleThen0IsReturned()
	{
		final int expected = 0;
		double input = 12.2;

		int result = IntegerConverter.convert(input);

		Assert.assertSame(expected, result);
	}
}
