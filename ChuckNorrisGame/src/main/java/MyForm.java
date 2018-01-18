import Board.BoardGenerator;
import Manager.GameManager;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyForm extends JFrame
{
	private JLabel pointLabel;
	private JPanel jPanel;

	public MyForm(int level)
	{
		final PointCalculator pointCalculator = PointCalculator.getInstance();
		this.setEnabled(true);
		this.setVisible(true);
		jPanel = new JPanel();
		jPanel.setMinimumSize(new Dimension(300, 300));

		this.setLayout(new BorderLayout(2, 1));

		pointLabel = new JLabel(String.valueOf(pointCalculator.getPoints()));

		this.add(pointLabel, BorderLayout.NORTH);

		BoardGenerator.PrepareBoard(pointLabel, jPanel);

		this.add(jPanel);

		pointLabel.addPropertyChangeListener(new PropertyChangeListener()
		{
			public void propertyChange(PropertyChangeEvent evt)
			{
				if (pointCalculator.getPoints() > 0)
				{
					System.out.println("You clicked Chuck Norris");
					GameManager.setLevel(GameManager.getLevel() + 1);
					BoardGenerator.PrepareBoard(pointLabel, jPanel);
				} else
				{
					GameManager.setLevel(GameManager.getLevel() - 1);
					BoardGenerator.PrepareBoard(pointLabel, jPanel);
				}
			}
		});

		this.setMinimumSize(new Dimension(300, 300));
	}

}
