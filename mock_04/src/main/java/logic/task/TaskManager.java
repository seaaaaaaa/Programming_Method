package logic.task;


import interfaces.Duplicatable;

import java.util.ArrayList;

public class TaskManager {
	public static ArrayList<Task> getTaskByType(ArrayList<Class> types) {
    	// TODO implement this method
        ArrayList<Task> tasks = TaskList.getTasks();
        ArrayList<Task> returnTasks = new ArrayList<Task>();
        for (Task task : tasks) {
            for(Class type : types) {
                if (instanceOf(task.getClass(), type)) {
                    returnTasks.add(task);
                    break;
                }
            }
        }
        return returnTasks;
    }
	
    public static void deleteDuplicateTasks() {
    	// TODO implement this method
        ArrayList<Task> tasks = TaskList.getTasks();
        tasks.removeIf(task -> instanceOf(task.getClass(), Duplicatable.class) && task.toString().contains("-"));
    }

    public static boolean instanceOf(Class checkClass, Class interfaceClass) {
        return interfaceClass.isAssignableFrom(checkClass);
    }
}
