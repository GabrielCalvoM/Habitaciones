package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	private JTextArea textArea;
	
	public RodriWindow() {
		setTitle("Habitaciones casa #4");
        setSize(500, 600); // Set the desired size
        setResizable(false); // Disable frame resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(50, 60);
        
        JLabel label = new JLabel("Ventana");
        label.setFont(new Font("Arial", 18)); // Set font and size
        label.setForeground(Color.BLACK); // Set text color
        label.setBounds(150, 10, 100, 40);

        // Add label to the frame's content pane
        getContentPane().setLayout(null);
        getContentPane().add(label);
        
        textArea = new JTextArea();
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        Rectangle textAreaBounds = new Rectangle(40, 60, 180, 200);
        textArea.setBounds(textAreaBounds);
        
        // Add text area to the frame's content pane
        getContentPane().add(textArea);    
        
    }
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(() -> {
			Ventana frame = new Ventana();
	        frame.setVisible(true);
	    });
	}
}