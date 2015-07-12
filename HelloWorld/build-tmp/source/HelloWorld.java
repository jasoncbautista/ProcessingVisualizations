import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HelloWorld extends PApplet {

public void setup(){
	fill(0xffFF3300);
	//for(int ii = 0 ; ii < 100; i++ );
		rect(20, 20, 50, 50);
	//}
}


public void draw(){

	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HelloWorld" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
