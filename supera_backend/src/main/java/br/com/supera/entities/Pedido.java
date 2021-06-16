package br.com.supera.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import br.com.supera.enumerations.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "pedido")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	private String endereco;

	private Instant dataPedido;

	private Status status;
	
	private Double Valorfrete;

	@ManyToMany()
	private Set<Produto> produto = new HashSet();

}
