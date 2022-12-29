package com.pages;

import com.driver.Driver;
import com.driver.DriverManager;
import com.pages.locators.AddTaskPageLocators;
import com.pages.locators.AddTicketPageLocators;

public class AddTicketPage extends BasePage{

    public AddTicketPage setProjectName(String projectName){
        customSelect(AddTicketPageLocators.getProjectName(),projectName,"projectName");
        return this;
    }
    public AddTicketPage setTicketDepartment(String ticketDepartment){
        customSelect(AddTicketPageLocators.getTicketDepartment(),ticketDepartment,"ticketDepartment");
        return this;
    }
    public AddTicketPage setTicketType(String ticketType){
        customSelect(AddTicketPageLocators.getTicketType(),ticketType,"ticketType");
        return this;
    }
    public AddTicketPage setTicketStatus(String ticketStatus){
        customSelect(AddTicketPageLocators.getTicketStatus(),ticketStatus,"ticketStatus");
        return this;
    }
    public AddTicketPage setTicketSubject(String ticketSubject){
        sendKeys(AddTicketPageLocators.getTicketSubject(),ticketSubject,"ticketSubject");
        return this;
    }
    public AddTicketPage setTicketDescription(String ticketDescription){
        DriverManager.getDriver().switchTo().frame(DriverManager.getDriver().findElement(AddTaskPageLocators.getTaskDescriptionFrame()));
        sendKeys(AddTaskPageLocators.getTaskDescriptionTextbox(),ticketDescription,"ticketDescription");
        DriverManager.getDriver().switchTo().defaultContent();
        return this;
    }
    public AddTicketPage setTicketCreatedBy(String ticketCreatedBy){
        customSelect(AddTicketPageLocators.getTicketCreatedby(),ticketCreatedBy,"ticketCreatedBy");
        return this;
    }
    public AddTicketPage setTicketNotify(String ...value){
        selectMultipleCheckboxes(AddTaskPageLocators.getTaskAssigned(),"TicketNotifyTo",value);
        return this;
    }
    public AddTicketPage clickSaveBtn(){
        click(AddTaskPageLocators.getTaskSaveBtn(),"save btn");
        return this;
    }
    public boolean ticketStatusDisplay(){
        return isDisplay(AddTaskPageLocators.getTaskDisplay(),"ticketStatus");
    }
}
