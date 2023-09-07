package com.taskmanager.test;

import java.util.Scanner;

import com.taskmanager.ManageTask;

public class TestTask {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ManageTask task = new ManageTask();
		int option =0;
		do {
			System.out.println(" Task menu ");
			System.out.println(" 1. Create 2. Edit task 3. Delete by ID 4. Delete by Name 5. Print 6. Exit ");
			option = read.nextInt();			
            read.nextLine();
			switch(option) {
				case 1:
					System.out.print("Name of the task: ");
                    String name = read.nextLine();
                    System.out.print("Description of the task: ");
                    String description = read.nextLine();
                    System.out.print("Priority of the task : ");
                    String priority = read.nextLine();
                    task.creatTask(name, description, priority);
                    System.out.println(" Task successfully created! .");
                break;
				case 2:
					if(task.emptyTask()) {
						System.out.println(" ERROR! The tasks is empty, here is nothing to edit ");
					}else {
						System.out.println(" Edit task ");
						System.out.println(" Introduce the ID ");
						int id = read.nextInt();
						read.nextLine();
						System.out.println(" Introduce the name ");
						name =  read.nextLine();
						System.out.println(" Introduce the description ");
						description = read.nextLine();
						System.out.println(" Introduce the priority ");
						priority = read.nextLine();
						task.editTask(id, name, description, priority);
						System.out.println(" Update the task with ID  " + id + " successfully! ");
					}
				break;
				case 3:
					if(task.emptyTask()) {
						System.out.println(" ERROR! The tasks are empty, there is nothing to delete ");
					}else {
						System.out.println(" Introduce the ID of the task to delete ");
						int id = read.nextInt();
						task.deleteTask(id);
					
						System.out.println(" Task with ID  "+id+ " deleted successfully ");
					}
					
				break;
				case 4:
					if(task.emptyTask()) {
						System.out.println(" ERROR! The tasks are empty, there is nothing to delete ");
					}else {
						System.out.println(" Introduce the name of the task to delete ");
						name = read.nextLine();
						task.deleteTaskByName(name);
					
						System.out.println(" Task with name  "+name+ " deleted successfully ");
					}
				
				case 5:
					if(task.emptyTask()) {
						System.out.println(" ERROR! The tasks are empty, there is nothing to print ");
					}else {
						System.out.println(" Printing the tasks ");
						task.printTask();
					}
					
				break;
				case 6:
					System.out.println(" Have a good day. Bye ");
				break;
				default:
					System.out.println(" That's not a valid option. Try again or exit ");
			}
		}while(option!=6);
		read.close();
	}

}
