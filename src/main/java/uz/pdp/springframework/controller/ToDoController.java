package uz.pdp.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import uz.pdp.springframework.model.Todo;
import uz.pdp.springframework.service.TodoService;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.util.List;

@Controller
public class ToDoController {

    private final TodoService todoService;

    public ToDoController() {
        this.todoService = new TodoService();
    }

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("greeting", "Welcome to Todo app");
        return modelAndView;
    }

    @GetMapping("/getall")
    public String getAll(Model model){
        List<Todo> todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);
        return "getall";
    }


}
