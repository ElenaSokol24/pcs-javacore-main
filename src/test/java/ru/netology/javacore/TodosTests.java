package ru.netology.javacore;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodosTests {

    static Todos todos = null;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        todos = new Todos();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test finished");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests finishedAll");
    }

    @Test
    public void testAddTask() {
        //arrange
        String task = "Пробежка", expected = "Пробежка";
        //act
        todos.addTask(task);
        String result = todos.getTasksElementByIndex(0);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testSortTasks() {
        //arrange
        String expected = "[Выучить уроки, Завтрак, Поспать, Умыться]";
        //act
        todos.addTask("Поспать");
        todos.addTask("Умыться");
        todos.addTask("Завтрак");
        todos.addTask("Выучить уроки");

        String result = todos.getAllTasks();
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveTask() {
        //arrange
        String expected = "[Выучить уроки, Поспать, Умыться]";
        //act
        todos.addTask("Поспать");
        todos.addTask("Умыться");
        todos.addTask("Завтрак");
        todos.addTask("Выучить уроки");
        todos.removeTask("Завтрак");
        String result = todos.getAllTasks();
        //assert
        assertEquals(expected, result);
    }
}