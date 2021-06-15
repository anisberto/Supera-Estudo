package br.com.supera.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "produto")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Long score;
    private String image;
}
