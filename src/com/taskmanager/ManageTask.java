package com.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class ManageTask implements TaskMethods{
	
	private List<Task> tasks;
	
	
	public ManageTask() {
		this.tasks = new ArrayList<>();
	}

	@Override
	public void creatTask(String name, String description, String priority) {
		tasks.add(new Task(name, description, priority));
	}

	@Override
	public void deleteTask(int taskId) {
		tasks.removeIf(task -> task.getIdTask()==taskId);
	}

	@Override
	public Task editTask(int taskId,String name, String description, String priority) {
		for(Task task: tasks) {
			if(task.getIdTask() == taskId) {
				task.setName(name);
				task.setDescription(description);
				task.setPriority(priority);
				return task;
			}
		}
		return null;
	}

	@Override
	public void printTask() {
		for(Task task: tasks) {
			System.out.println(task);
		}
	}

	@Override
	public boolean emptyTask() {
		return tasks.isEmpty();
	}

	@Override
	public void deleteTaskByName(String name) {
		tasks.removeIf(task -> task.getName().equals(name));
	}

}
