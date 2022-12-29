package com.pages;

import com.driver.DriverManager;
import com.pages.locators.AddTaskPageLocators;

public class AddTaskPage extends BasePage{

    public AddTaskPage setProjectName(String projectName){
        customSelect(AddTaskPageLocators.getProjectName(),projectName,"projectName");
        return this;
    }
    public AddTaskPage setTaskType(String taskType){
        customSelect(AddTaskPageLocators.getTaskType(),taskType,"taskType");
        return this;
    }
    public AddTaskPage setTaskName(String taskName){
        sendKeys(AddTaskPageLocators.getTaskName(),taskName,"taskName");
        return this;
    }
    public AddTaskPage setTaskStatus(String taskStatus){
        customSelect(AddTaskPageLocators.getTaskStatus(),taskStatus,"taskStatus");
        return this;
    }
    public AddTaskPage setTaskPriority(String taskPriority){
        customSelect(AddTaskPageLocators.getTaskPriority(),taskPriority,"taskPriority");
        return this;
    }
    public AddTaskPage setTaskLabel(String taskLabel){
        customSelect(AddTaskPageLocators.getTaskLabel(),taskLabel,"taskLabel");
        return this;
    }
    public AddTaskPage setTaskAssignedTo(String ...value){
        selectMultipleCheckboxes(AddTaskPageLocators.getTaskAssigned(),"taskAssignedTo",value);
        return this;
    }
    public AddTaskPage setTaskDescription(String taskDescription){
        DriverManager.getDriver().switchTo().frame(DriverManager.getDriver().findElement(AddTaskPageLocators.getTaskDescriptionFrame()));
        sendKeys(AddTaskPageLocators.getTaskDescriptionTextbox(),taskDescription,"taskDescription");
        DriverManager.getDriver().switchTo().defaultContent();
        return this;
    }
    public AddTaskPage setTaskCreatedBy(String taskCreatedBy){
        customSelect(AddTaskPageLocators.getTaskCreatedBy(),taskCreatedBy,"createdBy");
        return this;
    }
    public AddTaskPage clickSaveBtn(){
        click(AddTaskPageLocators.getTaskSaveBtn(),"saveButton");
        return this;
    }
    public  boolean isTaskStatusDisplay(){
        return isDisplay(AddTaskPageLocators.getTaskDisplay(),"taskDisplay");
    }


}
