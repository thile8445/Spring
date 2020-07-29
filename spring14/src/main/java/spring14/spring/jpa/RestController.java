package spring14.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	@Autowired
	private TodoRepository todoRepository;
//	@GetMapping("/todo/{todoId}")
//	public Todo getTodo(@PathVariable(name = "todoId") Integer  todoId) {
//		return todoRepository.findAllById(todoId.intValue());
//	}
	@GetMapping("/todo")
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }
	@GetMapping("/todo/{todoId}")
	public Todo getTodo(@PathVariable(name = "todoId") Integer  todoId) {
		return todoRepository.findById(todoId.longValue()).get();
	}
	@PutMapping("/todo/{todoId}")
    public Todo editTodo(@PathVariable(name = "todoId") Integer todoId,
                         @RequestBody Todo todo){
		Todo todoEdit = todoRepository.findById(todoId.longValue()).get();
		todoEdit.setTitle(todo.getTitle());
		todoEdit.setDetail(todo.getDetail());
        todoRepository.save(todoEdit);
        // Trả về đối tượng sau khi đã edit
        return todoEdit;    }
	@PostMapping("/todo")
	public Todo addTodo(@RequestBody Todo todo) {
		todoRepository.save(todo);
		return todo;
	}
    @DeleteMapping("/todo/{todoId}")
    public ResponseEntity deleteTodo(@PathVariable(name = "todoId") Integer todoId){
        todoRepository.deleteById(todoId.longValue());
        return ResponseEntity.ok().build();
    }
}