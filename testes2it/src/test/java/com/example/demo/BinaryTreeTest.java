package com.example.demo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.angelo.arvore.BinaryTree;

public class BinaryTreeTest {

	@Test
	public void testSomarUmUnicoNo() {
		BinaryTree arvore = new BinaryTree(10);
		assertEquals(10, arvore.somar(arvore));
	}
	
	@Test
	public void testSomarComNoLeft() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setLeft(new BinaryTree(10));
		assertEquals(20, arvore.somar(arvore));
	}
	
	@Test
	public void testSomarComNoRight() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setRight(new BinaryTree(10));
		assertEquals(20, arvore.somar(arvore));
	}
	
	@Test
	public void testSomarComNoRightAndLeft() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setRight(new BinaryTree(10));
		arvore.setLeft(new BinaryTree(10));
		assertEquals(30, arvore.somar(arvore));
	}
	
	@Test
	public void testSomarComNoRightAndLeftLevel2() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setRight(new BinaryTree(10));
		arvore.setLeft(new BinaryTree(10));
		arvore.getLeft().setLeft(new BinaryTree(10));
		arvore.getLeft().setRight(new BinaryTree(10));
		assertEquals(50, arvore.somar(arvore));
	}
	
	@Test
	public void testSomarComNoRightAndLeftLevel3() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setRight(new BinaryTree(10));
		arvore.setLeft(new BinaryTree(10));
		arvore.getLeft().setLeft(new BinaryTree(10));
		arvore.getLeft().setRight(new BinaryTree(10));
		arvore.getRight().setLeft(new BinaryTree(10));
		arvore.getRight().setRight(new BinaryTree(10));
		assertEquals(70, arvore.somar(arvore));
	}
	/*
	 * 	  10      level 1
	 * 10	 10   level 2
	 *10 10 10 10 level 3 
	 *
	 */
	@Test
	public void testSomarApartirNoLeftLevel2() {
		BinaryTree arvore = new BinaryTree(10);
		arvore.setRight(new BinaryTree(10));
		arvore.setLeft(new BinaryTree(10));
		arvore.getLeft().setLeft(new BinaryTree(10));
		arvore.getLeft().setRight(new BinaryTree(10));
		arvore.getRight().setLeft(new BinaryTree(10));
		arvore.getRight().setRight(new BinaryTree(10));
		assertEquals(30, arvore.somar(arvore.getLeft()));
	}

}
