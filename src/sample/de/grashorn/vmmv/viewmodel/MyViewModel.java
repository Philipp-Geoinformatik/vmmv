package sample.de.grashorn.vmmv.viewmodel;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

public class MyViewModel {
    private StringProperty labelText = new SimpleStringProperty("default");
    private StringProperty inputText = new SimpleStringProperty();
    private BooleanProperty buttonDisabled = new SimpleBooleanProperty();

    public MyViewModel() {
        buttonDisabled.bind(inputText.isEmpty());
    }

    public void changeLabel() {
        labelText.set(inputText.get());
        inputText.set("");
    }

    public ObservableValue<? extends String> labelTextProperty() {
        return this.labelText;
    }
    public Property<String> inputTextProperty() {
        return this.inputText;
    }

    public ObservableValue<? extends Boolean> buttonDisabledProperty() {
        return this.buttonDisabled;
    }

    // getter, setter, property-accessors
}