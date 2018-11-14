package com.spark.java.intro;

import java.io.File;
import java.io.FilenameFilter;


public class MyFileNameFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith("java");
	}

}
