package Actions;

import Board.BoardGenerator;
import Enums.Operation;
import Exceptions.EndGameException;
import Manager.LevelManager;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LabelPropertyChange implements PropertyChangeListener
{
	private JLabel pointLabel;
	private JPanel panel;

	public LabelPropertyChange(JLabel pointLabel, JPanel panel)
	{
		this.pointLabel = pointLabel;
		this.panel = panel;
	}

	public void propertyChange(PropertyChangeEvent evt)
	{
		Operation operation = Operation.Add;
		if (Integer.valueOf((String) evt.getNewValue()) < Integer.valueOf((String) evt.getOldValue()))
		{
			operation = Operation.Sub;
		}

		try
		{
			LevelManager.setLevel(operation);
			BoardGenerator.PrepareBoard(pointLabel, panel);
		} catch (EndGameException e)
		{
			JOptionPane.showMessageDialog(null, "Congratulation game is end.", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
}
