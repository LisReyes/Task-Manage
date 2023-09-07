package com.taskmanager;

public interface TaskMethods {
	
	public void creatTask(String name, String description, String priority);
	public void deleteTask(int taskId);
	public Task editTask(int taskId, String name, String description, String priority);
	public void printTask();
	public boolean emptyTask();
	public void deleteTaskByName(String name);
}
