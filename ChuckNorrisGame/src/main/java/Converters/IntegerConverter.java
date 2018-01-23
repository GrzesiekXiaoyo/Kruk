package Converters;

public class IntegerConverter
{
	public static Integer convert(Object value)
	{
		if (value instanceof String)
		{
			try
			{
				return Integer.valueOf((String) value);
			} catch (NumberFormatException nfe)
			{
				return 0;
			}
		}

		//other not supported
		return 0;
	}
}
