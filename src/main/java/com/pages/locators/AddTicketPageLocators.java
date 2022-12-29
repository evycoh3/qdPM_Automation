package com.pages.locators;

import org.openqa.selenium.By;

public final class AddTicketPageLocators {
    private AddTicketPageLocators(){}
    private static final By PROJECT_NAME= By.id("form_projects_id");
    private static final By TICKET_DEPARTMENT=By.id("tickets_departments_id");
    private static final By TICKET_TYPE=By.id("tickets_tickets_types_id");
    private static final By TICKET_STATUS=By.id("tickets_tickets_status_id");
    private static final By TICKET_SUBJECT=By.id("tickets_name");
    private static final By TICKET_CREATEDBY=By.id("tickets_users_id");
    public static By getProjectName() {
        return PROJECT_NAME;
    }

    public static By getTicketDepartment() {
        return TICKET_DEPARTMENT;
    }

    public static By getTicketType() {
        return TICKET_TYPE;
    }

    public static By getTicketStatus() {
        return TICKET_STATUS;
    }

    public static By getTicketSubject() {
        return TICKET_SUBJECT;
    }

    public static By getTicketCreatedby() {
        return TICKET_CREATEDBY;
    }
}
