//Dependencies 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;

//Program Starts from here
public class CoinFlip {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Coin Flip");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("Click the button to flip the coin.");
    JButton button = new JButton("Flip");
    button.setBackground(Color.WHITE);
    button.setBorderPainted(true);
    Dimension size = button.getPreferredSize();
    button.setBounds(300, 180, size.width, size.height);
    label.setForeground(Color.WHITE);

    label.setAlignmentX(Component.CENTER_ALIGNMENT);
    button.setAlignmentY(Component.CENTER_ALIGNMENT);
    // JLabel l2 = new JLabel();

    JPanel panel = new JPanel();

    panel.add(label);
    panel.add(button);
    panel.setBorder(BorderFactory.createTitledBorder("Coin Flip"));

    frame.add(panel, BorderLayout.CENTER);
    panel.setBackground(Color.gray);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Generate a random number between 0 and 1
        Random rng = new Random();
        int coin = rng.nextInt(100);

        if (coin <= 50) {
          label.setText("Heads");
        } else {
          label.setText("Tails");
        }
      }
    });

    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}
