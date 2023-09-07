package com.taskmanager;

import java.util.Objects;

public class Task {
	private static int nextId = 1;
	
	private int idTask;
	private String name;
	private String description;
	private String priority;
	
	public Task(String name, String description, String priority) {
		this.idTask = nextId++;
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public Task() {
		this.idTask = idTask++;
	}

	public int getIdTask() {
		return idTask;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTask, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return idTask == other.idTask && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Task ");
		builder.append(" ID: ");
		builder.append(idTask);
		builder.append(" Name: ");
		builder.append(name);
		builder.append(" Description: ");
		builder.append(description);
		builder.append(" Priority: ");
		builder.append(priority);
		return builder.toString();
	}
	
	
	
	
	
}
