import controller.DashboardFormController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        DashboardFormController.stage =  stage;
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/login_form.fxml"))));
        stage.show();
    }
}
