package Todo.example.todoEx.Todo;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class TodoRepo {
	
	@PersistenceContext
	private EntityManager entitymanager;     //Manager who talks to the database
	
	public List<TodoEntity> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<TodoEntity> typedQuery = entitymanager.createQuery("from TodoEntity", TodoEntity.class);
		return typedQuery.getResultList();
	}
	
	public Optional<TodoEntity> findTodoByid(Long id) {
		TodoEntity todo = entitymanager.find(TodoEntity.class, id);
		return Optional.ofNullable(todo);
	}
	
	
	
	
	@Transactional
	public void save(TodoEntity todo) {
		entitymanager.persist(todo);
	}
	
	
	@Transactional
	public void updateTodo(TodoEntity todo) {
		entitymanager.merge(todo);
		
	}

	


	

}
