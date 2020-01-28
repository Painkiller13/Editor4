import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.*;


public class openFile {

    @FXML
    private static MenuItem file;
    @FXML
    private static TextArea Textarea;
    private Desktop desktop = Desktop.getDesktop();


    /**
     * User can choose a File
     */
    public static void open() {

        Desktop desktop = Desktop.getDesktop();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.showOpenDialog(null);

                file.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                File file = fileChooser.showOpenDialog(null);
                if (file != null) {
                    Textarea.setText(readFile(file));
                }
            }
        });
    }

    /**
     * The bufferedReader will read the File
     * @param file
     * @return
     */
    public static String readFile(File file) {
        StringBuilder stringBuffer = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}



