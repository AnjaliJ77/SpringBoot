package Todo.example.todoEx.Todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoservice;
	
	
	
		
	
	@RequestMapping("/")
	public String getAllTodo(Model model) {
		List<TodoEntity> res = todoservice.getTodo();
		model.addAttribute("listOfTodos", res);
		return "todotask";
	
}
	
	
	@RequestMapping(value= "/addtodo", method = RequestMethod.POST)
	@ResponseBody
	public String createTodo(@ModelAttribute TodoEntity todo) {
		todoservice.saveTODO(todo);
		return "success";
	}
	
	@RequestMapping(value = "/updatetodo/{id}")
	public String updateTodo(@PathVariable("id") Long id,@ModelAttribute TodoEntity todo ) {
		todoservice.updateTodo(id,todo);
		return "redirect:/";
	}

//public String deletereateTodo() {
//	
//}
//


}
