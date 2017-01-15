package statki;

import javax.swing.ImageIcon;


public class Samolot extends Jednostka{
    
    String imageFile = "icons/T.png";
    
    public Samolot(int size)
    {
        super(size);
        icon = new ImageIcon(imageFile);
        type = 't';
    }
    
}
