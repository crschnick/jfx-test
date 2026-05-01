package io.xpipe.jfx_runner;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.*;

public class MenuBar extends Application {

    static void main(String[] args) {
        // Initialize AWT
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        // Initialize JavaFX
        Application.launch(MenuBar.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Desktop.getDesktop().setPreferencesHandler(e -> {

        });
    }
}
