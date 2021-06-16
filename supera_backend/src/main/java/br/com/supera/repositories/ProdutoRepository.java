package br.com.supera.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.supera.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query("SELECT p FROM Produto p where p.name = :name")
	List<Produto> findByName(@Param("name") String name);

	@Query("SELECT p FROM Produto p where p.name LIKE CONCAT('%',:name,'%')")
	List<Produto> findByNameContaining(@Param("name") String name);
}
