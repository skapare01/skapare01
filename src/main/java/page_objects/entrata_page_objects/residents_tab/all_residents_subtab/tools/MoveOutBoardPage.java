package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveOutBoardPage extends BasePage {
    public MoveOutBoardPage(WebDriver driver) {
        super(driver);
    }

    private final By DOWNLOAD_LINK = By.id("export_move_out_board");

    public boolean confirmVisibilityOfDownloadLink() {
        return confirmElementIsVisible(DOWNLOAD_LINK);
    }
}
