package Converters;

public class IntegerConverter
{
	public static Integer getInteger(Object value)
	{
		return Integer.valueOf((String) value);
	}
}
