package decoratorpattern;

import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
	
	//decorator addition of features at runtime
	private Function<Shade, Shade> filterPhotoShades;

	public Camera(Function<Shade, Shade>... allfilterPhotoShades) {
		
		filterPhotoShades = Stream.of(allfilterPhotoShades)
			.reduce(Function.identity(), (result,currentFunction) -> result.andThen(currentFunction));
	}
	
	public Shade manipulatePhot0(Shade shade) {
	
		System.out.println("starting shade processing for shade "+shade);
		
		return filterPhotoShades.apply(shade);
	}
	
}

