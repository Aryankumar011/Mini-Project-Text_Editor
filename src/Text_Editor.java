import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Text_Editor extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        TextArea textArea = new TextArea();
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Text Editor");
        Image image = new Image("/image/Pen.png");
        // Image image = new Image("image\\Pen.png");
        stage.getIcons().add(image);
        stage.setResizable(false);
        MenuBar menuBar = new MenuBar();
        Menu Menu1 = new Menu("File");
        Menu Menu2 = new Menu("Edit");
        Menu Menu3 = new Menu("Format");
        Menu Menu4 = new Menu("View");
        Menu Menu5 = new Menu("Help");
        menuBar.getMenus().addAll(Menu1, Menu2, Menu3, Menu4, Menu5);
        borderPane.setTop(menuBar);
        // menuBar.setBorder();
       //1. File Menu
        MenuItem Mi11 = new MenuItem("Open");
        Mi11.setOnAction(e->{
        //     FileChooser Fc = new FileChooser();
        // //    FileChooser.ExtensionFilter fChooser = new FileChooser.ExtensionFilter("txt files", "*.txt");
        //    File saveFile = Fc.showSaveDialog(null);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Text File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(stage); 
           try {
                //FileReader Fw= new FileReader(saveFile);
                // File file = new File(fileChooser.getAbsolutePath());
                // Scanner scanner = new Scanner(file);
                // while (scanner.hasNextLine()) {
                //     String line = scanner.nextLine();
                //     textArea.appendText(line);
                //     currentFile = selectedFile;
                String content = new String(Files.readAllBytes(selectedFile.toPath()));
                textArea.setText(content);
               // currentFile = selectedFile;
                }
                
                // file.close();

            
            catch(Exception e1) {
                System.out.println(e1.getMessage());
                // TODO: handle exception
            }
           
        });

        MenuItem Mi12 = new MenuItem("Save");
        Mi12.setOnAction(e->{
            FileChooser Fc = new FileChooser();
           FileChooser.ExtensionFilter fChooser = new FileChooser.ExtensionFilter("txt files", "*.txt");
           File saveFile = Fc.showSaveDialog(null);
           
           try {
                FileWriter Fw= new FileWriter(saveFile);
                Fw.write(textArea.getText());
                Fw.close();
            } 
            catch(Exception e1) {
                System.out.println(e1.getMessage());
                // TODO: handle exception
            }
           
        });
        MenuItem Mi13 = new MenuItem("Save As");
        Menu Mi14 = new Menu("Print");
        Menu1.getItems().addAll(Mi11, Mi12, Mi13,Mi14);
        // Edit Menu
        MenuItem Mi21 = new MenuItem("Redo");
        MenuItem Mi22 = new MenuItem("Undo");
         MenuItem Mi23 = new MenuItem("Remove Line");
        Menu2.getItems().addAll(Mi21, Mi22, Mi23);
        // Format Menu
        MenuItem Mi31 = new MenuItem("Change Font");
        MenuItem Mi32 = new MenuItem("Change Color");
        MenuItem Mi33 = new MenuItem("Change BackGroung Color");
        Menu3.getItems().addAll(Mi31, Mi32,Mi33);
        // View 
        MenuItem Mi41 = new MenuItem("Zoom In");
        MenuItem Mi42 = new MenuItem("Zoom Out");
        Menu4.getItems().addAll(Mi41, Mi42);

        borderPane.setCenter(textArea);
        textArea.setWrapText(true);
        textArea.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 20));
        Label label = new Label("Available Files");

        HBox hBox = new HBox(label);
        hBox.setMinWidth(100);
        borderPane.setRight(hBox);

        scene.setFill(Color.AQUA);

        // Add Tab Code


        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
