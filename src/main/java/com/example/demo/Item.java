package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Item {
	private String name;

	public String getName() {
		return name; 
	}

	public void setName(String name) { 
		this.name = name;
	}
}