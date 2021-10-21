/**
 * @author Bryner Gibson - bpgibson1
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.beans;

public class Dog {
	private String name;
	private int size;
	private String description;
	
	public Dog() {
		super();
	}

	public Dog(String name, int size, String description) {
		super();
		this.name = name;
		this.size = size;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", size=" + size + ", description=" + description + "]";
	}
	
}
