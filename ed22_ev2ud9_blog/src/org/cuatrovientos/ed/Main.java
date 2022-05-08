package org.cuatrovientos.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner miscan = new Scanner(System.in);
		int num;
		String str;
		Blog blog = new Blog();
		System.out.println("Escoge una opción");
		str = miscan.nextLine();
		num = Integer.parseInt(str);
		switch (num) {
		case 1:
			Post post1 = new Post();
			post1.setContenido("");
			blog.addPost(post1);
			break;

		case 2:
			Post post2 = new Post();
			post2 = blog.getPost(0);
			post2.showPost();
			break;
			
		case 3:
			Post post3 = new Post();
			post3 = blog.getPost(1);
			if (null != post3)
			{
			blog.removePost(1);
			}
			break;
			
		case 4:
			for (int i = 0; i < 10; i ++)
			{
			blog.getPost(i).toString();
			}
			break;
		}
	}
}
