package testcases;

import com.pages.AddTaskPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.JsonUtils;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;


public class AddTaskTest extends BaseTest{

    @Test
    public void tc_addTask(Map<String,String>map){
        HomePage homePage=new LoginPage()
                .setEmail(map.get("email"))
                .setPassword(map.get("password"))
                .clickLogin();
        homePage.clickOnSideNavBar("Tasks").clickOnSubSideNavBar("Add Task");
     boolean status  = new AddTaskPage()
                .setProjectName(JsonUtils.getValue("projectName"))
                .setTaskType(JsonUtils.getValue("taskType"))
                .setTaskName(JsonUtils.getValue("taskName"))
                .setTaskStatus(JsonUtils.getValue("taskStatus"))
                .setTaskPriority(JsonUtils.getValue("taskPriority"))
                .setTaskLabel(JsonUtils.getValue("taskLabel"))
                .setTaskAssignedTo(JsonUtils.getValue("taskAssignedTo"))
                .setTaskDescription(JsonUtils.getValue("taskDescription"))
                .setTaskCreatedBy(JsonUtils.getValue("taskCreatedBy"))
                .clickSaveBtn().isTaskStatusDisplay();
        Assertions.assertThat(status).isTrue();



    }


}
