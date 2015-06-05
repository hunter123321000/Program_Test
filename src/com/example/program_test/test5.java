package com.example.program_test;

public class test5 {

	public String findPath(String input) {
		String dirPath = "";
		if ((input.length() > 0)&&(input.contains("/"))) {//determinate source is exists
			input = input.substring(0, input.length() - 1);//normalization source data, delete last symbol
			dirPath = input.substring(input.lastIndexOf("/"), input.length());
		}
		return dirPath;
	}
}
