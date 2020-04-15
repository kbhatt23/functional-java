package basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapReadFile {
public static void main(String[] args) {
	
	Path file =Paths.get("C:/Kanishk/workspaces/functional-java/functional-streams/sampleFile.txt");
	
	try {
		List<String> allLines = Files.readAllLines(file);
		
		List<String> uniqueWords = allLines.stream()
				.map(line -> line.split(" "))//return Stream<String[]>
				.flatMap(array -> Arrays.stream(array))
				.distinct()
				.collect(Collectors.toList());
		
		uniqueWords.forEach(System.out::println);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
