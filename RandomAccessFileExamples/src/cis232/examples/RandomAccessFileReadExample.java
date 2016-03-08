package cis232.examples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadExample {

	public static void main(String[] args) throws IOException{
		RandomAccessFile file = new RandomAccessFile("file1.dat", "r");
		String text = file.readUTF();
		file.close();
		System.out.println(text);

	}

}
