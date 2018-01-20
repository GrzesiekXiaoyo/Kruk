package Buttons;

import javax.swing.*;

public class ButtonBuilderDirector
{
	private ButtonBuilder buttonBuilder;

	public ButtonBuilderDirector(ButtonBuilder buttonBuilder)
	{
		this.buttonBuilder = buttonBuilder;
	}

	public JButton getButton()
	{
		return buttonBuilder.getButton();
	}

	public void buildButton(boolean isChuck, JLabel jLabel)
	{
		buttonBuilder.createNewButton();
		buttonBuilder.BuildAction(isChuck, jLabel);
		buttonBuilder.BuildIcon(isChuck);
	}
}
