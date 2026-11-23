import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {

	public Main() {
		// TODO: 3x3 board (arbitrary size?)
		// TODO: characters
		// TODO: make characters interact
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 800);
		window.setContentPane(new Main());
		window.setVisible(true);
	}

	// // Reads a file and returns each line split on commas.
	// private ArrayList<String[]> readFile(String filename) {
	// 	ArrayList<String[]> data = new ArrayList<>();

	// 	try (Scanner s = new Scanner(new File(filename))) {
	// 		while (s.hasNextLine()) {
	// 			String line = s.nextLine();
	// 			data.add(line.split(","));
	// 		}
	// 	} catch (FileNotFoundException e) {
	// 		IO.println("Could not open " + filename);
	// 	}

	// 	return data;
	// }

}
