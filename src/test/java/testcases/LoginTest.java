package testcases;

import com.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTest extends BaseTest {

    @Test
    public void tc_loginLogout(Map<String, String> map)  {
        String title = new LoginPage()
                .setEmail(map.get("email"))
                .setPassword(map.get("password"))
                .clickLogin()
                .clickLogout()
                .getTitle();
        assertThat(title).isEqualTo("qdPM | Login");


    }
}
