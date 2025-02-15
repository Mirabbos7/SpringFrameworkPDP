package uz.pdp.springframework;

import uz.pdp.springframework.model.Todo;

import java.util.List;

public interface Service<T, K> {

    void addTodo(T t, K k);

    void deleteTodo(Integer id);

    void updateTodo(Integer id, String title, String priority);

    List<Todo> getAllTodos();
}
