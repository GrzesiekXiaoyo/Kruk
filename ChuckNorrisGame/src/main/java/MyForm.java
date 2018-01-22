import Actions.LabelPropertyChange;
import Actions.TimerAction;
import Board.BoardGenerator;
import Manager.SettingsManager;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.*;

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

		this.setLayout(new BorderLayout(2, 1));

		pointLabel = new JLabel(String.valueOf(pointCalculator.getPoints()));

		this.add(pointLabel, BorderLayout.NORTH);

		BoardGenerator.PrepareBoard(pointLabel, jPanel);

		this.add(jPanel);

		pointLabel.addPropertyChangeListener(new LabelPropertyChange(pointLabel, jPanel));

		this.setMinimumSize(new Dimension(SettingsManager.MIN_Width, SettingsManager.MIN_Hight));

		Timer timer = new Timer(SettingsManager.START_IMAGE_CHANGE, new TimerAction(pointLabel));
		timer.start();
	}

}
