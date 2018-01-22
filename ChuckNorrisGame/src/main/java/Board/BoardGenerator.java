package Board;

import Buttons.ButtonBuilderDirector;
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
				if (getRandomBoolean())
				{
					board[i] = true;
					return board;
				}
			}
		}
	}

	private static boolean getRandomBoolean()
	{
		return Math.random() < 0.15;
	}

	public static void PrepareBoard(JLabel jLabel, JPanel jpanel)
	{
		int level = LevelManager.getLevel();
		jpanel.removeAll();
		GridLayout experimentLayout = new GridLayout(level, level);
		jpanel.setLayout(experimentLayout);
		boolean[] board = getBoard();
		ButtonImageBuilder buttonImageBuilder = new ButtonImageBuilder();
		ButtonBuilderDirector buttonBuilderDirector = new ButtonBuilderDirector(buttonImageBuilder);
		for (boolean value : board)
		{
			buttonBuilderDirector.buildButton(value, jLabel);
			jpanel.add(buttonBuilderDirector.getButton());
		}
	}
}
