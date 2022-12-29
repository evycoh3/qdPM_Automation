package testcases;

import com.pages.AddTicketPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.JsonUtils;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;

public class AddTicketTest extends BaseTest{

    @Test
    public void tc_addTicket(Map<String,String> map){
        HomePage homePage=new LoginPage().setEmail(map.get("email")).setPassword(map.get("password")).clickLogin();
        homePage.clickOnSideNavBar("Tickets").clickOnSubSideNavBar("Add Ticket");
      boolean status=  new AddTicketPage()
                .setProjectName(JsonUtils.getValue("projectName"))
                .setTicketDepartment(JsonUtils.getValue("ticketDepartment"))
                .setTicketType(JsonUtils.getValue("ticketType"))
                .setTicketStatus(JsonUtils.getValue("ticketStatus"))
                .setTicketSubject(JsonUtils.getValue("ticketSubject"))
                .setTicketDescription(JsonUtils.getValue("ticketDescription"))
                .setTicketCreatedBy(JsonUtils.getValue("ticketCreatedBy"))
                .setTicketNotify(JsonUtils.getValue("ticketNotifyTo"))
                .clickSaveBtn().ticketStatusDisplay();
        Assertions.assertThat(status).isTrue();

    }
}
