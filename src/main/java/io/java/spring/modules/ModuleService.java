package io.java.spring.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
	
	@Autowired
	private ModuleRepository moduleRepo;
	

	
	public List<Module> getModules() {
		List<Module> modules = new ArrayList<>();
		moduleRepo.findAll().forEach(modules::add);
		return modules;
	}
	
	public Optional<Module> getModule(Integer id) {
		return moduleRepo.findById(id);
	}
	
	public void addModule(Module module) {
		moduleRepo.save(module);
	}
	
	
	public void updateModule(Module updatedModule) {
		moduleRepo.save(updatedModule);	
	}
	
	public void deleteModule(Integer id) {
		moduleRepo.deleteById(id);
	}
	

}
