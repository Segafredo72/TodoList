package TodoList; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MorningRoutine {

	
	public static void main(String[] args) {
		String toDoList = "My morning routine";
		TodoList myTodoList = new TodoList();
		myTodoList.TodoList(toDoList);
		myTodoList.addTask("Cofee");
		myTodoList.addTask("Shower");
		myTodoList.addTask("Breakfast");
		myTodoList.addTask("Commute by train");
		myTodoList.display();
		myTodoList.removeTask(2);
		myTodoList.display();
		myTodoList.rename(1, "Take shower");
		myTodoList.display();
		myTodoList.removeTask(4);
		myTodoList.findTaskPosition("Cofee");
		myTodoList.renameTask("Cofee", "Thee");
		myTodoList.display();
		myTodoList.renameTask("Let dog out", "Let cat out");
	} 
}