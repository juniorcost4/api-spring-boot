package br.com.springboot.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.springboot.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u where u.id > :id")
	public List<User> findAllMoreThan(@Param("id") Long id);
	
	public List<User> findByIdGreaterThan(Long id);
	
	public List<User> findAllByNameIgnoreCase(String name);
}
