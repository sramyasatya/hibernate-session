package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {

	@Id
	
	@Column(name="item_id")
	private int itemId;
	@Column(name="item_total")
	private int itemTotal;
	@Column(name="item_quantity")
	private int itemQuatity;
	
	@ManyToOne
	//column to have reference to access college details
	@JoinColumn(name="cart_id")
	private Cart cartId;
	
	
	public Items() {
		super();
	}

	public Items(int itemId, int itemTotal, int itemQuatity, Cart cartId) {
	
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.itemQuatity = itemQuatity;
		this.cartId = cartId;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Cart getCartId() {
		return cartId;
	}

	public void setCartId(Cart cartId) {
		this.cartId = cartId;
	}

	public int getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}
	public int getItemQuatity() {
		return itemQuatity;
	}
	public void setItemQuatity(int itemQuatity) {
		this.itemQuatity = itemQuatity;
	}
	
}
