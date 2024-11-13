import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        // Prompt for difficulty level
        String[] options = {"Easy", "Medium", "Hard"};
        int choice = JOptionPane.showOptionDialog(
            null, "Select Difficulty Level", "Flappy Bird",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, options, options[0]
        );

        // Convert choice to difficulty setting
        String difficulty;
        switch (choice) {
            case 1: difficulty = "Medium"; break;
            case 2: difficulty = "Hard"; break;
            default: difficulty = "Easy"; break;
        }

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird(difficulty);
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
