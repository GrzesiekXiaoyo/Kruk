package Buttons;

import Actions.ButtonImageClick;
import Picture.PictureFactory;

import javax.swing.*;

public class ButtonImageBuilder extends ButtonBuilder
{
	public void BuildIcon(boolean isChuck)
	{
		ImageIcon icon = new ImageIcon();
		icon.setImage(PictureFactory.getImage(isChuck));
		button.setIcon(icon);
	}

	public void BuildAction(boolean isChuck, JLabel jLabel)
	{
		button.addActionListener(new ButtonImageClick(isChuck, jLabel));
	}
}
