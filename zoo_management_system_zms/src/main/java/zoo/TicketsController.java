package zoo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
// import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TicketsController {

    @FXML
    Label adultTotal;
    
    @FXML
    Label childTotal;

    @FXML
    Label chiTickPriceLabel;

    @FXML
    Label aduTickPriceLabel;
     
    @FXML
    Label finalTotal;
   
    @FXML
    TextField aduNumOfTickInput;

    @FXML
    TextField chilNumOfTickeInput;

    @FXML
    Label dateLable;
    
    
    @FXML
    private void switchToLogInPage(ActionEvent event) throws IOException {
    
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("logInPage.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader logInPageFxmlLoader= new FXMLLoader(App.class.getResource("logInPage.fxml"));
        Parent logInPageParent = logInPageFxmlLoader.load();
        Scene logInPageScene = new Scene(logInPageParent);
        App.secondaryStage.setScene(logInPageScene); 


   }
   @FXML
    private void switchToSearch(ActionEvent event) throws IOException {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("search.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader searchFxmlLoader= new FXMLLoader(App.class.getResource("sreach.fxml"));
        Parent searchParent = searchFxmlLoader.load();
        Scene searchScene = new Scene(searchParent);
        App.secondaryStage.setScene(searchScene);
    }
    
   
    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
   
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader homePageFxmlLoader= new FXMLLoader(App.class.getResource("homePage.fxml"));
        Parent homePageParent = homePageFxmlLoader.load();
        Scene homePageScene = new Scene(homePageParent);
        App.secondaryStage.setScene(homePageScene);

    }

    @FXML
    private void switchToTickets(ActionEvent event) throws IOException {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("tickets.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader ticketsFxmlLoader= new FXMLLoader(App.class.getResource("tickets.fxml"));
        Parent ticketsParent = ticketsFxmlLoader.load();
        Scene ticketsScene = new Scene(ticketsParent);
        App.secondaryStage.setScene(ticketsScene);

    }

}
