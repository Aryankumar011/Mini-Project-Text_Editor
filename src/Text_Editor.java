import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
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
      scene.setFill(Color.AQUA);
      stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
