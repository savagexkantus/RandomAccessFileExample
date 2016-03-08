package cis232.examples;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) throws IOException {
		//Writing to a file requires at least "rw" mode
		RandomAccessFile file = new RandomAccessFile("file1.dat", "rw");
		file.writeUTF("Hello Random World!");
		file.close();
	}

}
