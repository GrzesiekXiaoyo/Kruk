package Board;

import Buttons.BuilderDirector;
import Buttons.ButtonImageBuilder;
import Manager.LevelManager;

import javax.swing.*;
import java.awt.*;

public class BoardGenerator
{
	private static boolean[] getBoard()
	{
		int elements = LevelManager.getFieldsCountByLevel();
		boolean[] board = new boolean[elements];

		while (true)
		{
			for (int i = 0; i < elements; i++)
			{
				boolean isChuck = getRandomBoolean();
				if (isChuck)
				{
					board[i] = isChuck;
					return board;
				}
			}
		}
	}

	private static boolean getRandomBoolean()
	{
		return Math.random() < 0.3;
	}

	public static void PrepareBoard(JLabel jLabel, JPanel jpanel)
	{
		int level = LevelManager.getLevel();
		jpanel.removeAll();
		GridLayout experimentLayout = new GridLayout(level, level);
		jpanel.setLayout(experimentLayout);
		boolean[] board = getBoard();
		ButtonImageBuilder buttonImageBuilder = new ButtonImageBuilder();
		BuilderDirector builderDirector = new BuilderDirector(buttonImageBuilder);
		for (boolean value : board)
		{
			builderDirector.buildButton(value, jLabel);
			jpanel.add(builderDirector.getButton());
		}
	}
}
