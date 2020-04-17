package RealTest2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class StreamFileTest {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\user\\Desktop\\MyStudy\\OS_\\Study");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName()));
	}
}