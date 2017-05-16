package com02.a_2ThreadsTransData139;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private static List list = new ArrayList<>();
	public static void add(){
		list.add("cj");
	}
	public static int size(){
		return list.size();
	}

}
