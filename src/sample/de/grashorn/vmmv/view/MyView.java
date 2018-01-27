package sample.de.grashorn.vmmv.view;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.de.grashorn.vmmv.viewmodel.MyViewModel;

public class MyView {
    @FXML
    Label label;
    @FXML
    TextField input;
    @FXML
    Button button;

    MyViewModel viewModel = new MyViewModel();

    public void initialize() {
        label.textProperty().bind(viewModel.labelTextProperty());
        input.textProperty().bindBidirectional(viewModel.inputTextProperty());
        button.disableProperty().bind(viewModel.buttonDisabledProperty());
    }

    // will be called when button is pressed
    public void onAction() {
        viewModel.changeLabel();
    }
}