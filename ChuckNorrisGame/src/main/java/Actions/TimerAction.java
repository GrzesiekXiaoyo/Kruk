package Actions;

import Enums.Operation;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerAction implements ActionListener
{
	private JLabel pointLabel;

	public TimerAction(JLabel pointLabel)
	{
		this.pointLabel = pointLabel;
	}

	public void actionPerformed(ActionEvent e)
	{
		PointCalculator instance = PointCalculator.getInstance();
		instance.SetPoints(Operation.Sub);
		pointLabel.setText(String.valueOf(instance.getPoints()));
	}
}
