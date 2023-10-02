package es.ieslosmontecillos.di_t1a432_annoninnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class AnonInnerClass extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("AnonymousInnerClass");
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(15, 12, 15, 12));

        //Buttons
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");
        hbox.getChildren().addAll(btnNew,btnOpen, btnSave, btnPrint);


        //Buttons Actions
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Nuevo proceso");
            }
        });
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Abrir proceso");
            }
        });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Guardar proceso");
            }
        });
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Imprimir proceso");
            }
        });



        Scene scene = new Scene(hbox,240, 50);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}