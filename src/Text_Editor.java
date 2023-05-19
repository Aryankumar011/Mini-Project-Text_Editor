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
import javafx.stage.Stage;

public class Text_Editor extends Application {

    @Override
    public void start(Stage stage) throws Exception {
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
        MenuItem Mi12 = new MenuItem("Save");
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

        TextArea textArea = new TextArea();
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
