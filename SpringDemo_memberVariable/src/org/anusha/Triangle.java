/*package org.anusha;

public class Triangle {
public void draw(){
	System.out.println("Traingle Drawn");
}
}
*/
package org.anusha;

public class Triangle {

	private String type;
	private int height;

	public int getHeight() {
		return height;
	}

	public Triangle(String type) {
		this.type = type;
	}
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height=height;
	}
	
	

	public String getType() {
		return type;
	}

	/*
	 * public void setType(String type) { this.type = type; }
	 */
	public void draw() {
		System.out.println(getType() + " Traingle drawn of height " + getHeight());
	}
}
