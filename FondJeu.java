import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class FondJeu extends JPanel{
    public void paintComponent(Graphics g) {
        System.out.println("Je suis exécutée !");
        try {
            Image img = ImageIO.read(new File("Fond Marin 1.jpg"));
            g.drawImage(img, 0, 0, this);
            //Pour une image de fond
            //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
