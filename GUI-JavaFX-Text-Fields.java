package myThirdJavaFXProgram;//Needed for my IDE

/*Israel Showell
 * Date: 10-20-23
 */


import javafx.application.Application;//Imports library for Application
import javafx.event.ActionEvent;//Imports library for ActionEvent
import javafx.stage.Stage;//Imports library for Stage
import javafx.scene.Scene;//Imports library for Scene
import javafx.scene.control.Label;//Imports library for Labels
import javafx.scene.control.TextField;//Imports library for Text Field
import javafx.scene.layout.GridPane;//Imports library for GridPane
import javafx.scene.text.Font;//Imports library for Font
import javafx.scene.control.Button;//Imports library for Buttons

public class GUI-JavaFX-Text-Fields extends Application {//Creates the main class
	TextField Name;//TextField object named Name
	
	TextField Age;//TextField object named Age
	
	TextField Color_;//TextField object named Color
	
	TextField Hobby;//TextField object named Hobby
	
	public void processButtonPress(ActionEvent event)//Handles the button pressed event
	{
		System.out.println("Name: " + Name.getText() + "\nAge: "+ Age.getText() + "\nColor: " + Color_.getText()+"\nHobby: "+Hobby.getText());
		//Above line prints out the values stored in the text fields to the console window
	}
	
	public void start(Stage primaryStage) {//Creates main method for the program
    	
		GridPane mainGrid = new GridPane(); //Creates the main grid for the elements
		
		
		Button Printvalues = new Button("Print Fields!");//Creates button object
		
		Printvalues.setOnAction(this::processButtonPress);
		
		Font font = new Font(18);//Creates a font object for the labels and text fields
		
		Label NameL = new Label("Name:");//Creates label for Name area
		
		NameL.setFont(font);//Sets the font for the label
		
		Label AgeL = new Label("Age:");//Creates label for Age area
		
		AgeL.setFont(font);//Sets the font for the label
		
		Label ColorL = new Label("Color:");//Creates label for Color area
		
		ColorL.setFont(font);//Sets the font for the label
		
		Label HobbyL = new Label("Hobby:");//Creates label for Hobby area
		
		HobbyL.setFont(font);//Sets the font for the label
		
		Name = new TextField();//Creates new Text Field for Name
		
		Name.setFont(font);//Sets font for Name Text Field
		
		Name.setPrefWidth(200);//Sets width of Text Field to 200
		
		Age = new TextField();//Creates new Text Field for Age
		
		Age.setFont(font);//Sets font for Name Text Field
		
		Age.setPrefWidth(200);//Sets width of Text Field to 200
		
		Color_ = new TextField();//Creates new Text Field for Age
		
		Color_.setFont(font);//Sets font for Name Text Field
		
		Color_.setPrefWidth(200);//Sets width of Text Field to 200
		
		Hobby = new TextField();//Creates new Text Field for Age
		
		Hobby.setFont(font);//Sets font for Name Text Field
		
		Hobby.setPrefWidth(200);//Sets width of Text Field to 200
		
		mainGrid.add(NameL, 0, 0);//Adds the Name label to row 0 and column 0
		
		mainGrid.add(Name, 1, 0);//Adds the Name object to row 0 and column 1
		
		mainGrid.add(AgeL, 0, 1);//Adds the Age label to row 1 and column 0
		
		mainGrid.add(Age, 1, 1);//Adds the Age object to row 1 and column 1
		
		mainGrid.add(ColorL, 0, 2);//Adds the Age label to row 2 and column 0
		
		mainGrid.add(Color_, 1, 2);//Adds the Age object to row 2 and column 1
		
		mainGrid.add(HobbyL, 0, 3);//Adds the Age label to row 3 and column 0
		
		mainGrid.add(Hobby, 1, 3);//Adds the Age object to row 3 and column 1
		
		mainGrid.add(Printvalues, 3, 4); //Adds the Print button to row 4 and column 3
		
		Scene mainScene = new Scene(mainGrid, 500, 300);//Creates the main scene and adds mainGrid to it
		
		primaryStage.setScene(mainScene);//Sets the primary stage to mainScene
		
		primaryStage.setTitle("Assignment-5");//Sets the stage title to Assignment-5
		
		primaryStage.show();//Finally, this displays the GUI to the user
		
    }

}
