package Todo.example.todoEx.Todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	@Autowired
	private TodoRepo todorepo;
	
	public void saveTODO(TodoEntity todo) {
		todorepo.save(todo);
		
		
	}

	public List<TodoEntity> getTodo() {
		return todorepo.findAll();
		
		
	}

	public void updateTodo(Long id, TodoEntity newtodo) {
	Optional<TodoEntity> todoold = todorepo.findTodoByid(id);
		if(todoold.isPresent()) {
			TodoEntity oldbox = todoold.get();
			oldbox.setContent(newtodo.getContent());
			oldbox.setStatus(newtodo.getStatus());
			todorepo.updateTodo(oldbox);
		}
	}

}
