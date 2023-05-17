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

public class Text_Editor extends Application{

    @Override
    public void start(Stage stage) throws Exception {
       BorderPane borderPane = new BorderPane();
       Scene scene = new Scene(borderPane,800,600);
       stage.setScene(scene);
       stage.setTitle("Text Editor");
      Image image = new Image("/image/Pen.png");
     // Image image = new Image("image\\Pen.png");
      stage.getIcons().add(image);
      stage.setResizable(false);
      MenuBar menuBar = new MenuBar();
      Menu Menu1 = new Menu("Test1");
      Menu Menu2 = new Menu("Test2");
      Menu Menu3 = new Menu("Test3");
      Menu Menu4 = new Menu("Test4");
      Menu Menu5 = new Menu("Test5");
      menuBar.getMenus().addAll(Menu1,Menu2,Menu3,Menu4,Menu5);
      borderPane.setTop(menuBar);
    //   menuBar.setBorder();

      MenuItem Mi11 = new MenuItem("MI11");
      MenuItem Mi12 = new MenuItem("MI12");
      Menu Mi13 = new Menu("MI13");
      Menu1.getItems().addAll(Mi11,Mi12,Mi13);

      MenuItem Mi21 = new MenuItem("MI21");
      MenuItem Mi22 = new MenuItem("MI22");
      MenuItem Mi23 = new MenuItem("MI23");
      Mi13.getItems().addAll(Mi21,Mi22,Mi23);
      
      MenuItem Mi51 = new MenuItem("MI11");
      MenuItem Mi52 = new MenuItem("MI12");
      Menu5.getItems().addAll(Mi51,Mi52);

      TextArea textArea = new TextArea();
      borderPane.setCenter(textArea);
    textArea.setFont(Font.font("Times New Roman",FontPosture.ITALIC,20));
        Label label = new Label("Available Files");

        HBox hBox = new HBox(label);
        hBox.setMinWidth(100);
        borderPane.setRight(hBox);
        
      
      scene.setFill(Color.AQUA);
      stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
