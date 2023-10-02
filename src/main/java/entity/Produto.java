package entity;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Produto {
	
	private static Map<Integer, Produto> produtos;
	
	static {
		produtos = new LinkedHashMap<Integer, Produto>();
		produtos.put(1, new Produto(1, "P1", 100));
		produtos.put(1, new Produto(1, "P2", 200));
		produtos.put(1, new Produto(1, "P3", 300));
		produtos.put(4, new Produto(4, "P4", 400));
		produtos.put(5, new Produto(1, "P5", 500));
	}
	
	private int id;
	private String nome;
	private double valor;
	
	
	private Produto(int id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public static Collection<Produto> getProdutos() {
		return produtos.values();
	}
	
	public static Produto getProdutoById(int id) {
		return produtos.get(id);
	}

}
