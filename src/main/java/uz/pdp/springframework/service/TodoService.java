package uz.pdp.springframework.service;

import uz.pdp.springframework.Service;
import uz.pdp.springframework.model.Todo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoService implements Service<String, String> {
    private final List<Todo> todoList = new ArrayList<>();
    private Integer id = 0;

    @Override
    public void addTodo(String title, String priority) {
        todoList.add(new Todo(id++, title, priority, LocalDateTime.now()));
    }

    @Override
    public void deleteTodo(Integer id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
    }

    @Override
    public void updateTodo(Integer id, String title, String priority) {
        Optional<Todo> todoOpt = todoList.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst();
        todoOpt.ifPresent(todo -> {
            todo.setTitle(title);
            todo.setPriority(priority);
        });
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoList;
    }
}
