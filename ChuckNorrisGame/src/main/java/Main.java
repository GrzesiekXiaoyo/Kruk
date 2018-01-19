import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main
{
	public static void main(String[] args)
	{
		System.out.print("ChuckNorris game started...");

		MyForm form = new MyForm();
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
