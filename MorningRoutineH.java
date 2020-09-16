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

public class MorningRoutineH {

	
	public static void main(String[] args) {
		String toDoListH = "My morning routine";
		TodoListH myTodoListH = new TodoListH();
		myTodoListH.TodoListH(toDoListH);
		myTodoListH.addTask("Cofee");
		myTodoListH.addTask("Shower");
		myTodoListH.addTask("Breakfast");
		myTodoListH.addTask("Commute by train");
		myTodoListH.display();
		myTodoListH.removeTask("Breakfast");
		myTodoListH.display();
		myTodoListH.rename("Shower", "Take shower");
		myTodoListH.display();
		myTodoListH.removeTask("Switch on alarm");
		myTodoListH.rename("Cofee", "Thee");
		myTodoListH.display();
		myTodoListH.rename("Let dog out", "Let cat out");
	} 
}