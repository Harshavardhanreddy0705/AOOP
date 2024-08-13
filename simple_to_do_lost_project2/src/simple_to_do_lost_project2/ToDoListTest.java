package simple_to_do_lost_project2;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    void testAddTask() {
        toDoList.addTask("Task 1");
        List<Task> tasks = toDoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Task 1", tasks.get(0).getDescription());
    }

    @Test
    void testRemoveTask() {
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");
        toDoList.removeTask(0);
        List<Task> tasks = toDoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Task 2", tasks.get(0).getDescription());
    }

    @Test
    void testMarkTaskAsCompleted() {
        toDoList.addTask("Task 1");
        toDoList.markTaskAsCompleted(0);
        List<Task> tasks = toDoList.getTasks();
        assertTrue(tasks.get(0).isCompleted());
    }

    @Test
    void testListTasks() {
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");
        List<Task> tasks = toDoList.getTasks();
        assertEquals(2, tasks.size());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals("Task 2", tasks.get(1).getDescription());
    }
}
