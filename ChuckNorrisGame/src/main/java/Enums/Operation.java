package Enums;

public enum Operation
{
	Add(1), Sub(-1);

	private final int value;

	Operation(int value)
	{

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}
