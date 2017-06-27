package edu.wpi.first.outlineviewer.controller.dialog;

import javafx.scene.control.ListView;
import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public abstract class AddEntryArrayDialogTest extends AddEntryDialogTest {

  AddEntryArrayDialogTest(Supplier<AddEntryDialog> dialogSupplier) {
    super(dialogSupplier);
  }

  @Test
  public void testAddElementButton() {
    final int initialLength = ((ListView) lookup(".list-view").query()).getItems().size();
    clickOn("+");

    assertEquals(initialLength + 1, ((ListView) lookup(".list-view").query()).getItems().size());
  }

}