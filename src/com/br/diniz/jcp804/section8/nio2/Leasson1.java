package com.br.diniz.jcp804.section8.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Leasson1 {
	
	public static void main(String... a) {
		//Path p = Paths.get("c:\\temp\\teste.txt");
		//Path p = Paths.get(URI.create("file:///c://temp//teste.txt"));
		Path p5 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");
		System.out.println(p5.toString());
		
		
		Path path = Paths.get("C:\\home\\joe\\foo");
		
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getName(1): %s%n", path.getName(1));
		System.out.format("getName(2): %s%n", path.getName(2));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		
		System.out.println(path.toUri());
		
	}

}
