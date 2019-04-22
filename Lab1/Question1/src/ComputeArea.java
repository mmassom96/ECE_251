public class ComputeArea {
    double radius;
    double area;    
    
    public ComputeArea(){
     // Assign a radius
   	    radius = 20.0;
   }
    
    public void compute(){
    // Compute area
    area = radius * radius * 3.14159;
    
    // Display results
    System.out.println("The area for the circle of radius "+ radius + " is " + area);
    }
}