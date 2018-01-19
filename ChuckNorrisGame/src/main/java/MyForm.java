import Actions.LabelPropertyChange;
import Board.BoardGenerator;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.*;

//todo dodac timer ktory sprawdzi ze nic sie nie zmienilo przez kilka sec to zmiana boarda

public class MyForm extends JFrame
{
	private JLabel pointLabel;
	private JPanel jPanel;

	public MyForm()
	{
		final PointCalculator pointCalculator = PointCalculator.getInstance();
		this.setEnabled(true);
		this.setVisible(true);
		jPanel = new JPanel();
		jPanel.setMinimumSize(new Dimension(500, 500));

		this.setLayout(new BorderLayout(2, 1));

		pointLabel = new JLabel(String.valueOf(pointCalculator.getPoints()));

		this.add(pointLabel, BorderLayout.NORTH);

		BoardGenerator.PrepareBoard(pointLabel, jPanel);

		this.add(jPanel);

		pointLabel.addPropertyChangeListener(new LabelPropertyChange(pointLabel, jPanel));

		this.setMinimumSize(new Dimension(500, 500));
	}

}
