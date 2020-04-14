package decoratorpattern;

import java.util.function.Function;

public class ShapeClient {
public static void main(String[] args) {
	//multiple decoration
	Function<Shade, Shade> fun1 = (shade) -> new Shade(shade.getShade()+1);
	Function<Shade, Shade> fun2 = (shade) -> new Shade(shade.getShade()+2);
	Function<Shade, Shade> fun3 = (shade) -> new Shade(shade.getShade()*2);
	Camera camera = new Camera(fun1,fun2,fun3);
	
	System.out.println(camera.manipulatePhot0(new Shade(23)));
	}
}
