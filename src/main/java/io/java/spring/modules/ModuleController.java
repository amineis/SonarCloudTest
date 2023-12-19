package io.java.spring.modules;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping("/modules")
	public List<Module> getModules() {
		return moduleService.getModules();
		}
	
	@RequestMapping("/modules/{id}")
	public Optional<Module> getModule(@PathVariable int id) {
		return moduleService.getModule(id);
	}
	
	@PostMapping("/modules")
	public void addModule(@RequestBody Module module) {
			moduleService.addModule(module);
		}
	
	@RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
	public void updateModule(@PathVariable int id,@RequestBody Module module) {
		moduleService.updateModule(module);
		}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
	public void deleteModule(@PathVariable int id) {
		moduleService.deleteModule(id);
	}
	
	
	
	
	

}
