package statki;

import javax.swing.Icon;



public abstract class Jednostka {

    int size;
    Icon icon;
    char type;
    
    
    public Jednostka(int size)
    {
        this.size = size;
    }

    public int getSize()
    {
        return size;
    }

    public Icon getIcon()
    {
        return icon;
    }

    public char getType()
    {
        return type;
    }
    
    
    

    
    

    
    
}
