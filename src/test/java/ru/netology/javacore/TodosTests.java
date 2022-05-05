package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TodosTests {
    Todos todos = new Todos();
    Todos todos1 = new Todos();
    Todos todos2 = new Todos();

    @Test
    public void testAddTask() {
        boolean expected = true;
        todos.addTask("A");
        boolean result = todos.list.contains("A");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRemoveTask() {
        boolean expected = false;
        todos1.addTask("Breakfast");
        todos1.removeTask("Breakfast");
        boolean result = todos1.list.contains("Breakfast");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetAllTasks() {
        String expected = "A B Breakfast ";
        todos2.addTask("Breakfast");
        todos2.addTask("A");
        todos2.addTask("B");
        String result = todos2.getAllTasks();

        Assertions.assertEquals(expected, result);
    }


}