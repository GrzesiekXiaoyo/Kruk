package Manager;

public class GameManager
{
	private static int LEVEL = 2;

	public static int getLevel()
	{
		return LEVEL;
	}

	public static void setLevel(int level)
	{
		if (level > 1)
		{
			LEVEL = level;
		} else
		{
			System.out.println("Level cannot be less then 0.");
		}
	}

	public static int getFieldsCountByLevel()
	{
		return LEVEL * LEVEL;
	}
}
