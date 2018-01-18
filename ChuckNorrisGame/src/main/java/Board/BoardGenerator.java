package Board;

import Buttons.BuilderDirector;
import Buttons.ButtonImageBuilder;
import Manager.GameManager;

import javax.swing.*;
import java.awt.*;

public class BoardGenerator
{
	private static boolean isChuck = false;

	private static boolean[] getBoard()
	{
		int elements = GameManager.getFieldsCountByLevel();
		boolean[] board = new boolean[elements];

		while (!isChuck)
		{
			for (int i = 0; i < elements; i++)
			{
				if (isChuck)
				{
					board[i] = false;
				} else
				{
					boolean random = getRandomBoolean();
					if (random)
					{
						isChuck = true;
					}

					board[i] = random;
				}
			}
		}

		isChuck = false;
		return board;
	}

	private static boolean getRandomBoolean()
	{
		return Math.random() < 0.3;
	}

	public static void PrepareBoard(JLabel jLabel, JPanel jpanel)
	{
		int level = GameManager.getLevel();
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