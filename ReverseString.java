import java.io.*;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		String name = "krupa";
		char[] input = name.toCharArray();
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i]);
		}
	}
}