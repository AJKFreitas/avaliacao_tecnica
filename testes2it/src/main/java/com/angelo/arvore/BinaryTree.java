package com.angelo.arvore;

public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;

	public BinaryTree(int valor) {
		this.valor = valor;
	}

	public int somar(BinaryTree node) {
		if (null != node) {
			int soma = 0;
			soma += somar(node.getLeft());
			soma += somar(node.getRight());
			soma += node.getValor();
			return soma;
		} else {
			return 0;
		}
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
