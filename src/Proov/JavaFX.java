package Proov;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by piret on 29.01.17.
 */

public class JavaFX extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox algusAken = new VBox();                         //Teeb uue vBoxi
        algusAken.setPadding(new Insets(10));                //Lisab äärtesse tühja ruumi.
        algusAken.setSpacing(20);                            //Lisab kasti eri osade vahele tühja ruumi.
        Scene esimeneAken = new Scene(algusAken, 500, 400);  //Teeb uue stseeni ja määrab akna suuruse
        primaryStage.setScene(esimeneAken);
        primaryStage.show();
        Label kasutajainfo = new Label("Siseta enda nimi");   //Tekst kasti sees kasutaja jaoks
        TextField kasutajainfoTekst = new TextField();
        Label telefoniinfo = new Label("Sisesta telefoni mark");
        TextField telefoniinfoTekst = new TextField();

        Button kasutajaandmedNupp = new Button();
        kasutajaandmedNupp.setOnAction(event -> {
            Telefon uusTelefon = new Telefon(kasutajainfoTekst.getText(), telefoniinfoTekst.getText());
            uusTelefon.kelleTelefon();
            System.out.println("Telefoni mark on " + uusTelefon.mark);
            teineAken(primaryStage, uusTelefon);
        });

        algusAken.getChildren().addAll(kasutajainfo, kasutajainfoTekst, telefoniinfo, telefoniinfoTekst, kasutajaandmedNupp);
       }

       public void teineAken (Stage teineStage, Telefon uusTelefon){
           VBox teineAken = new VBox();                         //Teeb uue vBoxi
           teineAken.setPadding(new Insets(10));                //Lisab äärtesse tühja ruumi.
           teineAken.setSpacing(20);                            //Lisab kasti eri osade vahele tühja ruumi.
           Scene esimeneAken = new Scene(teineAken, 500, 400);  //Teeb uue stseeni ja määrab akna suuruse
           teineStage.setScene(esimeneAken);
           teineStage.show();

           Label kasutajaAndmed = new Label("Selle telefoni omanik on " + uusTelefon.kelleTelefon() + ". Selle telefoni mark on " + uusTelefon.mark);

           teineAken.getChildren().addAll(kasutajaAndmed);
       }
}

