package com.pharmexpressgroup.pharmexpress.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "produto")
public class Produto {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

    @Column(nullable = false)
	private String descricao;

    @Column(nullable = false)
	private String tipo;

    @Column(nullable = false)
	private String codigoBarras;

    @Column(nullable = false)
	private int quantidade;

    @Column(nullable = false)
	private double preco;

    @Column(nullable = false)
	private String image;

	@Column(nullable = false, name = "status_produto")
	private boolean codStatusProduto;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}

    public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}

    public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCodigoBarras() {
		return this.codigoBarras;
	}

    public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}

    public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}

    public void setImage(String image) {
		this.image = image;
	}
	public String getImage() {
		return this.image;
	}
	
	public void setCodStatusProduto(boolean codStatusProduto) {
		this.codStatusProduto = codStatusProduto;
	}
	public boolean getCodStatusProduto() {
		return this.codStatusProduto;
	}

	@Override
	public String toString() {
		return "Produto{" +
		    "id=" + id +
			", nome=" + nome +
			", descricao=" + descricao +
			", tipo=" + tipo +
			", codigoBarras=" + codigoBarras +
			", quantidade=" + quantidade +
			", preco=" + preco +
			", image=" + image +
			", codStatusProduto=" + codStatusProduto +
			"}";
	}

}
