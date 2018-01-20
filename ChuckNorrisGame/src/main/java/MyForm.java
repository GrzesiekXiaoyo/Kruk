import Actions.LabelPropertyChange;
import Board.BoardGenerator;
import Manager.LevelManager;
import Manager.SettingsManager;
import Points.PointCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		this.setLayout(new BorderLayout(2, 1));

		pointLabel = new JLabel(String.valueOf(pointCalculator.getPoints()));

		this.add(pointLabel, BorderLayout.NORTH);

		BoardGenerator.PrepareBoard(pointLabel, jPanel);

		this.add(jPanel);

		pointLabel.addPropertyChangeListener(new LabelPropertyChange(pointLabel, jPanel));

		this.setMinimumSize(new Dimension(SettingsManager.MIN_Width, SettingsManager.MIN_Hight));

		//todo
		Timer timer = new Timer(5000, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				pointLabel.setText(String.valueOf(LevelManager.getLevel() - 1));
			}
		});
		timer.start();
	}

}
