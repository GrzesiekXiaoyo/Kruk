package Manager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class FileManager
{
	public static BufferedImage getImage(URL imageUrl)
	{
		File imageFile = new File(imageUrl.getFile());
		BufferedImage image = null;
		try
		{
			image = ImageIO.read(imageFile);
		} catch (IOException e)
		{
			System.err.println("Error during reading image");
			e.printStackTrace();
		}

		return image;
	}
}
