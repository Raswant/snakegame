import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JOptionPane;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Login {
          

          public static void main(String[] args)
           {
                     X obj = new X();
                 // adding music
                String filepath ="D:\\javaprograms\\SNAKEGAME\\Snake Game - Theme Song.wav";
                Playmusic(filepath);
                //JOptionPane.showMessageDialog(null," Press ok to stop Playing");
                
            }
            public static void Playmusic(String location)
            {
                     
                try
                 {
                        File musicPath = new File(location);
                        if(musicPath.exists())
                        {
                                AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("D:\\javaprograms\\SNAKEGAME\\Snake Game - Theme Song.wav").getAbsoluteFile());
                                Clip clip = AudioSystem.getClip();
                                clip.open(audioInput);
                                clip.start();
                                clip.isRunning();
                        
                                
        
        
                        }
                        else
                        {
                            System.out.println("cant't find file ");
                        }
                    
                } catch (Exception e) 
                {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
        } 



 class X  extends JFrame {
          
          JPanel jp = new JPanel();
          JLabel jl = new JLabel();
          JTextField t1;
          JTextField t2;
          JLabel l1;
          JLabel l2;
          String s;
          
          
          public X()

          {   
              
              
               
                 l1 = new JLabel("PLAY");
                 l2 = new JLabel("EXIT");
                // JButton button = new JButton("LOGIN");
                 JRadioButton rbutton1 = new JRadioButton("");
                 JRadioButton rbutton2 = new JRadioButton("");
                 jl.setIcon(new ImageIcon("D:\\corejava\\SNAKEGAME\\th.jpg"));
                jp.add(jl);
                add(jp);
                 validate();
                 rbutton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                    {
                              if(rbutton1.isSelected())
                              {

                              new Snake();
                              new GameFrame();
                              new GamePanel();
                              dispose();
                              }
                              
                             
                              
                    }
                 });
                  rbutton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                    {
                              if(rbutton2.isSelected())
                              {

                                  JOptionPane.showMessageDialog(null," Press ok to stop Playing");
                                  dispose();
                              }
                              
                             
                              
                    }
                 });
                
                
                 add(l1);
                 add(rbutton1);
                 add(l2);
                 add(rbutton2);
                 
                 
                 setLayout(new FlowLayout());
                 setVisible(true);
                 setTitle("SNAKE GAME");
                 setSize(500,250);
                 setBackground(Color.GREEN);
                 setDefaultCloseOperation(EXIT_ON_CLOSE);
          }
         
}


