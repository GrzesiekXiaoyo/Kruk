package Picture;

import Manager.FileManager;

import java.awt.image.BufferedImage;
import java.net.URL;

public final class PictureFactory
{
	public static BufferedImage getImage(boolean isChuck)
	{
		if (isChuck)
		{
			return getChuckNorrisImage();
		}

		return getRandomImage();
	}

	private static BufferedImage getChuckNorrisImage()
	{
		URL resource = PictureFactory.class.getResource("/Images/Chuck-Norris.jpg");
		return FileManager.getImage(resource);
	}

	private static BufferedImage getRandomImage()
	{
		URL resource = PictureFactory.class.getResource("/Images/Random.png");
		return FileManager.getImage(resource);
	}
}
