package Actions;

import Enums.Operation;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonImageClick implements ActionListener
{
	private Boolean isChuck;
	private PointCalculator pointCalculator;
	private JLabel pointLabel;

	public ButtonImageClick(Boolean isChuck, JLabel pointLabel)
	{
		this.pointLabel = pointLabel;
		this.isChuck = isChuck;
		pointCalculator = PointCalculator.getInstance();
	}

	public void actionPerformed(ActionEvent e)
	{
		Operation operation = Operation.Sub;
		if (isChuck)
		{
			operation = Operation.Add;
		}

		pointCalculator.SetPoints(operation);
		this.pointLabel.setText(String.valueOf(pointCalculator.getPoints()));
	}
}
