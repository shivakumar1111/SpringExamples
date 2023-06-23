package com.sonata.spring15jun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{
	
	private Points center;
	
	
	

	public Points getCenter() {
		return center;
	}


	
	public void setCenter(Points center) {
		this.center = center;
	}




	public void draw() {
		
		System.out.println("draw circle");
		System.out.println("point of circle is (" + center.getX()+" ,"+center.getY()+")"  );
		
		
		
	}

}
