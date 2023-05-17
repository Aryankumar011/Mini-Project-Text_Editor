import javafx.application.Application;
import javafx.scene.Scene;
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
      scene.setFill(Color.AQUA);
      stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
