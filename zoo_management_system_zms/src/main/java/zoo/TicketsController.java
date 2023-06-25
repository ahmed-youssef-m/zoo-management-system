package zoo;

import java.io.File;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

        FXMLLoader logInPageFxmlLoader = new FXMLLoader(App.class.getResource("layouts/logInPage.fxml"));
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

        FXMLLoader searchFxmlLoader = new FXMLLoader(App.class.getResource("layouts/search.fxml"));
        Parent searchParent = searchFxmlLoader.load();
        Scene searchScene = new Scene(searchParent);
        App.secondaryStage.setScene(searchScene);
        SearchController searchController = searchFxmlLoader.getController();
        searchController.greetingUser(LogInPageController.userName);
    }

    @FXML
    private void switchToHomePage(ActionEvent event) throws IOException {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("homePage.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader homePageFxmlLoader = new FXMLLoader(App.class.getResource("layouts/homePage.fxml"));
        Parent homePageParent = homePageFxmlLoader.load();
        Scene homePageScene = new Scene(homePageParent);
        App.secondaryStage.setScene(homePageScene);
        HomePageController homePageController = homePageFxmlLoader.getController();
        homePageController.greetingUser(LogInPageController.userName);

    }

    @FXML
    private void switchToTickets(ActionEvent event) throws IOException {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("tickets.fxml"));
        // Parent root=loader.load();

        // Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene=new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        FXMLLoader ticketsFxmlLoader = new FXMLLoader(App.class.getResource("layouts/tickets.fxml"));
        Parent ticketsParent = ticketsFxmlLoader.load();
        Scene ticketsScene = new Scene(ticketsParent);
        App.secondaryStage.setScene(ticketsScene);
        TicketsController ticketsController = ticketsFxmlLoader.getController();
        ticketsController.setDate();
        // setDate();

    }

    public void setDate() {
        Date date = new Date();
        String dateOutput = date.toString();
        dateLable.setText(dateOutput);
    }

    Integer initAduNumOfTickets = 0;
    Integer initChiNumOfTickets = 0;

    @FXML
    public void aduNumOfTickIncreaseMethod() {
        initAduNumOfTickets = initAduNumOfTickets + 1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        aduNumOfTickInput.setText(initAduNumOfTickets.toString());
        adultTotal.setText(initAduNumOfTickets.toString());
        Integer priceTimesNumOfTickets = initAduNumOfTickets * 120;
        Integer biTotal = priceTimesNumOfTickets + (initChiNumOfTickets * 60);
        adultTotal.setText(priceTimesNumOfTickets.toString() + " $");
        finalTotal.setText(biTotal.toString() + " $");
    }

    @FXML
    public void chilNumOfTickIncreaseMethod() {
        initChiNumOfTickets = initChiNumOfTickets + 1;
        // String numOfTickInecrease=""+initNumOfTickInecrease;
        chilNumOfTickeInput.setText(initChiNumOfTickets.toString());
        Integer priceTimesNumOfTickets = initChiNumOfTickets * 60;
        childTotal.setText(priceTimesNumOfTickets.toString() + " $");
        Integer biTotal = priceTimesNumOfTickets + (initAduNumOfTickets * 120);
        finalTotal.setText(biTotal.toString() + " $");
    }

    @FXML
    public void aduNumOfTickDecreaseMethod() {
        if (initAduNumOfTickets > 0) {
            initAduNumOfTickets = initAduNumOfTickets - 1;
            // String numOfTickInecrease=""+initNumOfTickInecrease;
            aduNumOfTickInput.setText(initAduNumOfTickets.toString());
            Integer priceTimesNumOfTickets = initAduNumOfTickets * 120;
            adultTotal.setText(priceTimesNumOfTickets.toString() + " $");
            Integer biTotal = priceTimesNumOfTickets + (initChiNumOfTickets * 60);
            finalTotal.setText(biTotal.toString() + " $");
        }
    }

    @FXML
    public void chilNumOfTickDecreaseMethod() {
        if (initChiNumOfTickets > 0) {
            initChiNumOfTickets = initChiNumOfTickets - 1;
            // String numOfTickInecrease=""+initNumOfTickInecrease;
            chilNumOfTickeInput.setText(initChiNumOfTickets.toString());
            Integer priceTimesNumOfTickets = initChiNumOfTickets * 60;
            childTotal.setText(priceTimesNumOfTickets.toString() + " $");
            Integer biTotal = priceTimesNumOfTickets + (initAduNumOfTickets * 120);
            finalTotal.setText(biTotal.toString() + " $");
        }
    }

    public void printTicket() throws IOException, InterruptedException {
        String path = "ticket.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        document.add(new Paragraph("").setPaddingTop(120f).setBorderBottom(new DashedBorder(0.5f)));

        float width0[] = { 200f, 100f, 150f, 100f };
        Table table0 = new Table(width0);
        table0.addCell(new Cell().add("Zoo Ticket").setBold().setBorder(Border.NO_BORDER).setPaddingTop(10f)
                .setFontSize(20f).setMarginBottom(10f));
        table0.addCell(new Cell().add("Ticket Price").setBold().setBorder(Border.NO_BORDER).setPaddingTop(15f));
        table0.addCell(new Cell().add("Number Of Tickets").setBold().setBorder(Border.NO_BORDER).setPaddingTop(15f));
        table0.addCell(new Cell().add("Total").setBold().setBorder(Border.NO_BORDER).setPaddingTop(15f));
        document.add(table0);

        float width1[] = { 100f, 100f, 100f, 150f, 50f };
        Table table1 = new Table(width1);
        table1.addCell(new Cell().add("").setBold().setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table1.addCell(new Cell().add("Adults Tickets").setBold().setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table1.addCell(new Cell().add(aduTickPriceLabel.getText()).setBorder(Border.NO_BORDER).setPaddingTop(7f).setPaddingLeft(20f));
        table1.addCell(new Cell().add(initAduNumOfTickets.toString()).setBorder(Border.NO_BORDER).setPaddingTop(7f)
                .setPaddingLeft(50f));
        table1.addCell(new Cell().add(adultTotal.getText()).setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table1.addCell(new Cell().add("").setBold().setBorder(Border.NO_BORDER));
        table1.addCell(new Cell().add("Child Tickets ").setBold().setBorder(Border.NO_BORDER));
        table1.addCell(new Cell().add(chiTickPriceLabel.getText()).setBorder(Border.NO_BORDER).setPaddingLeft(20f));
        table1.addCell(new Cell().add(initChiNumOfTickets.toString()).setBorder(Border.NO_BORDER).setPaddingLeft(50f));
        table1.addCell(new Cell().add(childTotal.getText()).setBorder(Border.NO_BORDER));
        document.add(table1);

        float width2[] = { 220f, 40f, 80f, 170f };
        Table table2 = new Table(width2);
        table2.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table2.addCell(new Cell().add("Total: ").setBold().setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table2.addCell(new Cell().add(finalTotal.getText()).setBorder(Border.NO_BORDER).setPaddingTop(7f));
        table2.addCell(new Cell().add(dateLable.getText()).setBorder(Border.NO_BORDER)
                .setPaddingTop(10f).setFontSize(8f));
        document.add(table2);

        Paragraph paragraphborder = new Paragraph("ZMS").setFontSize(10f);
        paragraphborder.setBorderBottom(new DashedBorder(0.5f));
        paragraphborder.setWordSpacing(365f);
        document.add(paragraphborder);

        String imageFile = "src\\main\\resources\\zoo\\images\\elephantForTicket.png";
        ImageData imageData = ImageDataFactory.create(imageFile);
        com.itextpdf.layout.element.Image image = new com.itextpdf.layout.element.Image(imageData);
        image.setFixedPosition(30, 550);
        document.add(image);

        document.close();

        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler ticket.pdf");

    }

}
