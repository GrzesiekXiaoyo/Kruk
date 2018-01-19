package Manager;

import Enums.Operation;
import Exceptions.EndGameException;

public class LevelManager
{
	private static int level = SettingsManager.MIN_LEVEL;

	public static int getLevel()
	{
		return level;
	}

	public static void setLevel(Operation operation) throws EndGameException
	{
		level += operation.getValue();

		if (level > 10)
		{
			throw new EndGameException();
		} else if (level < SettingsManager.MIN_LEVEL)
		{
			level -= operation.getValue();
			System.out.println("Level cannot be less then 2.");
		}
	}

	public static int getFieldsCountByLevel()
	{
		return level * level;
	}
}
