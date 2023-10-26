package Tests;

import Commons.BaseTest;
import Pages.DragAndDropPage;
import org.junit.Assert;
import org.junit.Test;


public class DragAndDropTest extends BaseTest {

    @Test
    public void test(){

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);

        dragAndDropPage.loadDragAndDropPage();

        dragAndDropPage.dragAndDrop();

        Assert.assertEquals("B", dragAndDropPage.getBoxAText());

    }
}
