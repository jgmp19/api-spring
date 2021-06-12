package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table(name = "Telefone")
@Data
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	private String numero;
	private String tipo;
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
	@JsonBackReference
    private Cliente cliente;
}
