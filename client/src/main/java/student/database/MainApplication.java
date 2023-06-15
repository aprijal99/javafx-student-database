package student.database;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import student.database.configuration.JavaFxEntryPoint;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        Application.launch(JavaFxEntryPoint.class, args);
    }
}
