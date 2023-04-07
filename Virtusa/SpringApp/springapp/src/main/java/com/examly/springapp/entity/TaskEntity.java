package com.examly.springapp.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Taskentity {

    @Id
    private String taskId;
    private String taskHolderName;
    private String taskDate;
    private String taskName;
    private String taskStatus;
   

    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getTaskHolderName() {
        return taskHolderName;
    }
    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }
    public String getTaskDate() {
        return taskDate;
    }
    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }

    public Taskentity(String taskId, String taskHolderName, String taskDate, String taskName, String taskStatus) {
        this.taskId = taskId;
        this.taskHolderName = taskHolderName;
        this.taskDate = taskDate;
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }
  public Taskentity(){
      
  }  
}