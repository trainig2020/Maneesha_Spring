package org.anusha;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


/*@Component
*/

/*@Service
*/
@Controller
public class Circle implements Shape{
   
	private Point center;
    
    @Override
	public void draw() {
    	System.out.println("Drawing Circle");
    	System.out.println("Circle Point is: ( " + center.getX() +", " + center.getY() + ")");
		
	}
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void DestroyCircle(){
		System.out.println("Destroy of Circle");
	}


}
