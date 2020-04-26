package com.TrainingManagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "category_name", nullable = false)
	private String categoryName;
	@Column(name = "parent_id", nullable = false)
	private int parentId;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Category(int categoryId, String categoryName, int parentId) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", parentId=" + parentId + "]";
	}
	
}
