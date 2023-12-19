package io.java.spring.cours;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours, Integer>{
	public List<Cours> findByModuleId(Integer moduleId);
}