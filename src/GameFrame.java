import java.awt.event.KeyAdapter;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    public static final long serialVersionUID = 1l;

   

    GameFrame(){
              GamePanel panel = new GamePanel();
              this.add(panel);
              this.setTitle("SNAKE");
              this.setDefaultCloseOperation(EXIT_ON_CLOSE);
              this.pack();
              this.setVisible(true);
              this.setLocationRelativeTo(null);
              // adding music
                String filepath ="D:\\javaprograms\\SNAKEGAME\\8-bit-background-music-for-arcade-game-come-on-mario-164702.wav";
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
                           
                                AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("D:\\javaprograms\\SNAKEGAME\\8-bit-background-music-for-arcade-game-come-on-mario-164702.wav").getAbsoluteFile());
                                Clip clip = AudioSystem.getClip();
                                clip.open(audioInput);
                                clip.loop(Clip.LOOP_CONTINUOUSLY);
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