/**
 * Save.java saves the content to a choosen file
 * */

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class Save {

     /**
     * returns the standart documents path as a String
     * */

    public static String getStandardPath(){
        return FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
    }

    public static void saveToFileChooser(){
    //Create a file chooser
        final JFileChooser fc = new JFileChooser();

    //In response to a button click:
        int returnVal = fc.showSaveDialog(null);

        if(returnVal == JFileChooser.APPROVE_OPTION)
        {
            // Ausgabe der ausgewaehlten Datei
            System.out.println("Die folgende Datei wurde gespeichert: " +
                    fc.getSelectedFile().getName());
        }
    }

}
