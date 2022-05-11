package mainPackage;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
  {
    public Window()
    {
    }
    
    public void activateWindow()
    {
      Window window = new Window();
      JPanel content = new JPanel();

      //set up window
      window.setLocationRelativeTo(null);
      window.setVisible(true);   

      //set up panel
      content = new JPanel();
      content.setLayout(new FlowLayout());
     
      
      //adjust window
      window.setContentPane(content);
      window.pack();
      window.setTitle("Tiny Window using JFrame Subclass");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
    }

    public void activateTutorial()
    {
      Window window = new Window();
      JPanel content = new JPanel();

      window.setVisible(false);
      window.setLocationRelativeTo(null);

      window.setVisible(true);
      JLabel tutorialText = new JLabel(EventCardStorage.tutorialString);
      content.add(tutorialText);
      content.setLayout(new FlowLayout());
      window.setContentPane(content);
      window.pack();
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
   
    
  }