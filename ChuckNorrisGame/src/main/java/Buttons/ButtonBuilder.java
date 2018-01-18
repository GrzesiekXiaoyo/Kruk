package Buttons;

import javax.swing.*;

public abstract class ButtonBuilder
{
	protected JButton button;

	JButton getButton()
	{
		return button;
	}

	void createNewButton()
	{
		button = new JButton();
	}

	public abstract void BuildIcon(boolean isChuck);

	public abstract void BuildAction(boolean isChuck, JLabel jLabel);
}
