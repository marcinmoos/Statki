package statki;

import javax.swing.ImageIcon;


public class Statek extends Jednostka{
    
    String imageFile = "icons/S.png";
    
    public Statek(int size)
    {
        super(size);
        icon = new ImageIcon(imageFile);
        type = 's';
    }
    
}
