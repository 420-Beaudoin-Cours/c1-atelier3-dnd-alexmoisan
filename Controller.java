package sample;

import javafx.scene.control.TextField;
import javafx.scene.input.*;

public class Controller {
    public TextField txfSource;

    public void txfSourceDragDetected(MouseEvent mouseEvent) {
        if (txfSource.getText().length() > 0){
            Dragboard db = txfSource.startDragAndDrop(TransferMode.ANY);
            ClipboardContent content = new ClipboardContent();
            content.putString(txfSource.getText());
            db.setContent(content);
        }

    }

    public void imgDragOver(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.ANY);
    }

    public void imgDragDropped(DragEvent dragEvent) {
        Dragboard db = dragEvent.getDragboard();
        txfSource.clear();
    }
}
