package Telas;



import Entidades.Strings;
import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Mobile extends Application{
private Button btnVoltar = new Button("Voltar"); 
private TextArea feed = new TextArea();
		
	 
	
	public void Voltar(Stage stage) {
	
	try {
		new MeusCursos().start(new Stage());
		stage.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	public void ApagarTexto(String string) {
		
		try {
			feed.setText("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(1000,1000);
		Label label = new Label(Strings.cont);
		label.setFont(new Font	("Arial Black", 40));
		Label label1 = new Label(Strings.quest1);
		Label label2 = new Label(Strings.responda);
		label2.setFont(new Font	("Arial Black", 20));
		CheckBox check1 = new CheckBox(Strings.p1);
		CheckBox check2 = new CheckBox(Strings.p2);
		CheckBox check3 = new CheckBox(Strings.p3);
		feed.setPromptText("Deixe-nos seu FeedBack");
	
		
		Button enviar = new Button("Enviar");
		
		pane.getChildren().addAll(label, label1, label2, check1, check2, check3, feed, enviar, btnVoltar);
		
		Scene scene = new Scene(pane);
		stage.setTitle("Seus Cursos");
		stage.setScene(scene);
		stage.show();
		
		label.setLayoutX((pane.getWidth() - label.getWidth()) / 2);
		label.setLayoutY(10);
		
		label1.setLayoutX((pane.getWidth() - label1.getWidth()) / 2);
		label1.setLayoutY(100);
		
		label2.setLayoutX((pane.getWidth() - label2.getWidth()) / 2);
		label2.setLayoutY(330);
		
		check1.setLayoutX((pane.getWidth() - check1.getWidth()) / 2);
		check1.setLayoutY(360);
		
		check2.setLayoutX((pane.getWidth() - check2.getWidth()) / 2);
		check2.setLayoutY(380);
		
		check3.setLayoutX((pane.getWidth() - check3.getWidth()) / 2);
		check3.setLayoutY(400);
		
		feed.setLayoutX((pane.getWidth() - feed.getWidth()) / 10);
		feed.setLayoutY(450);
		feed.setPrefSize(400,200);
		
		enviar.setLayoutX((pane.getWidth() - enviar.getWidth()) / 2);
		enviar.setLayoutY(628);
		
		btnVoltar.setLayoutX((pane.getWidth() - btnVoltar.getWidth()) / 100);
		btnVoltar.setLayoutY(1);
		
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, Lavender 0%, silver 800%);");
		
		btnVoltar.setOnAction(e -> {
			Voltar(stage);
		});
		enviar.setOnAction(e -> {
			ApagarTexto(toString());
		});
		
	}

}