package com.pages.locators;

import org.openqa.selenium.By;

public final class AddTaskPageLocators {
    private AddTaskPageLocators(){}
    private static final By PROJECT_NAME= By.id("form_projects_id");
    private static final By TASK_TYPE=By.id("tasks_tasks_type_id");
    private static final By TASK_NAME=By.id("tasks_name");
    private static final By TASK_STATUS=By.id("tasks_tasks_status_id");
    private static final By TASK_PRIORITY=By.id("tasks_tasks_priority_id");
    private static final By TASK_LABEL=By.id("tasks_tasks_label_id");
    private static final By TASK_ASSIGNED=By.cssSelector(".checkbox_list label");
    private static final By TASK_DESCRIPTION_FRAME=By.cssSelector(".cke_wysiwyg_frame.cke_reset");
    private static final By TASK_DESCRIPTION_TEXTBOX=By.tagName("p");
    private static final By TASK_CREATED_BY=By.id("tasks_created_by");
    private static final By TASK_SAVE_BTN=By.cssSelector("button[type='submit']");
    private static final By TASK_DISPLAY=By.cssSelector(".selectedFilterItems");
    public static By getProjectName() {
        return PROJECT_NAME;
    }

    public static By getTaskType() {
        return TASK_TYPE;
    }

    public static By getTaskName() {
        return TASK_NAME;
    }

    public static By getTaskStatus() {
        return TASK_STATUS;
    }

    public static By getTaskAssigned() {
        return TASK_ASSIGNED;
    }

    public static By getTaskCreatedBy() {
        return TASK_CREATED_BY;
    }

    public static By getTaskDescriptionFrame() {
        return TASK_DESCRIPTION_FRAME;
    }

    public static By getTaskLabel() {
        return TASK_LABEL;
    }

    public static By getTaskPriority() {
        return TASK_PRIORITY;
    }

    public static By getTaskDescriptionTextbox() {
        return TASK_DESCRIPTION_TEXTBOX;
    }

    public static By getTaskSaveBtn() {
        return TASK_SAVE_BTN;
    }

    public static By getTaskDisplay() {
        return TASK_DISPLAY;
    }
}
