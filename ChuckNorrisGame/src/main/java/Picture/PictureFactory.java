package Picture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
		return getImage(resource);
	}

	private static BufferedImage getRandomImage()
	{
		URL resource = PictureFactory.class.getResource("/Images/Random.png");
		return getImage(resource);
	}

	private static BufferedImage getImage(URL imageUrl)
	{
		File imageFile = new File(imageUrl.getFile());
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(imageFile);
		} catch (IOException e)
		{
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}

		return image;
	}
}
