package TodoList;
/** TodoList models the attributes
 * and the operations we can perform
 */
 import java.util.ArrayList;
 
 public class TodoList {
	private String topic;
	private ArrayList<String> tasks;

/** TodoList instantiates a TodoList with the provided string as a topic for the list
* and allocates the memory for the list of tasks
* @param topic The topic for which the list is created for
*/
public void TodoList(String topic) {
	this.topic=topic;
	this.tasks=new ArrayList<String>();
}

/** addTask appends the provided String at the end of the list
* @param taskName The description of the task to be added
*/
public void addTask(String taskName) {
	this.tasks.add(taskName);
}

/** display displays the topic of the list
 * and each task order and description 
 */
public void display() {
	if(this.tasks.size()==0){
		System.out.println("Our Todo List for " + topic + "is currently empty!");
	}else {
		System.out.println("Here is our Todo List for " + topic);
		for(int i=0;i<this.tasks.size();i++) {
			System.out.println("Task " + i + " is " + this.tasks.get(i));
		}
	}
}

/** find position of task in the list
 */
public int findTaskPosition(String task) {
	if(this.tasks.size()==0){
		System.out.println("Our Todo List for " + topic + "is currently empty!");
		/* force exception */
		return -1;
	}else {
		for(int i=0;i<this.tasks.size();i++) {
			if (task==this.tasks.get(i)) {
			System.out.println("Task " + this.tasks.get(i)+ " is at position " + i );
			return i;
			}
		}
		/* force exception */
		return -1;
	}
}

/** remove removes a task at the provided index 
 * @param i The index of the task to remove
 */
public void removeTask(int i) {
	try {
		this.tasks.remove(i);
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("Could not remove task, no task at this index!");
	}
}

/** rename renames the task at the provided index
 * 
 * @param i The index of the task to rename
 * @param newtask The new description for the task
 */
public void rename(int i, String newTask) {
	try {
		this.tasks.set(i,newTask);
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("Could not rename task, no task at this index!");
	}
}

public void renameTask(String oldTask, String newTask) {
	try {
		
		this.tasks.set(findTaskPosition(oldTask),newTask);
		System.out.println("Task "+oldTask+" renamed by "+newTask);
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("Could not rename task "+oldTask+" not found in list !");
	}
}
}
