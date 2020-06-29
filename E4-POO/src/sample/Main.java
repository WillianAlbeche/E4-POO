package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Categoria");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        grid.setGridLinesVisible(false);

        Text sceneTitle = new Text("Bem vindo");
        sceneTitle.setId("Titulo");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,35));
        grid.add(sceneTitle,0,0);

        Label categoriaName= new Label("Categoria");
        categoriaName.setFont(Font.font("Tahoma",25));
        categoriaName.setAlignment(Pos.CENTER_LEFT);
        grid.add(categoriaName,0 ,1);

        TextField catTextField= new TextField();
        catTextField.setMaxSize(2000,2000);
        grid.add(catTextField,1,1);

        Button btn = new Button("Cadastrar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1,4);

        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
        btn.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                actiontarget.setFill(Color.RED);
                actiontarget.setText("Cadastrado com sucesso");
                System.out.println("botão pressionado, resultado: "+"\nCategoria: "+catTextField.getText());
            }
        });


        Scene scene= new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
