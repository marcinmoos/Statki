package statki;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileSaver {
    
    private static FileSaver inst;
    Path filePath;
    
    public static FileSaver inst(Path path){
        if(inst == null){
            inst = new FileSaver(path);
        }
        inst.setFilePath(path);
        return inst;
    }

    private FileSaver(Path filePath) {
        this.filePath = filePath;
    }
    private void setFilePath(Path filePath) {
        this.filePath = filePath;
    }
        
        public void saveData(Object ob){
            try(ObjectOutputStream zapisObiektu = new ObjectOutputStream(Files.newOutputStream(filePath))) {
                zapisObiektu.writeObject(ob);
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public Object OpenData(){
            Object ob = null;
            try(ObjectInputStream odczytObiektu = new ObjectInputStream(Files.newInputStream(filePath))) {
                ob = odczytObiektu.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            }
            return ob;
        }
}