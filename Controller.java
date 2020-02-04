package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.*;

public class Controller {
    public TextField txfSource;
    public ComboBox cmbTarget;

    /*
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        if (txfSource.getText().length() > 0){
            Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }

    }

    //Exercice 1
    public void imgDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgDragDropped(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        txfSource.clear();
    }

     */

    //Exercice 2
    public void cmbDragDropped(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        cmbTarget.getItems().addAll(txfSource.getText());
        cmbTarget.getSelectionModel().selectLast();
        txfSource.clear();
    }

    public void cmbDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    //Exercice 3
    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        TextField ref = (TextField) mouseEvent.getSource();
        if (ref.getText().length() > 0) {
            Dragboard db = ref.startDragAndDrop((TransferMode.ANY));
            ClipboardContent content = new ClipboardContent();
            content.putString(ref.getText());
            db.setContent(content);
        }
    }

    public void imgDragDropped(DragEvent dragEvent) {
        TextField refSource = (TextField) dragEvent.getGestureSource();
        Dragboard db = dragEvent.getDragboard();
        refSource.clear();
    }

    public void imgDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }
}
