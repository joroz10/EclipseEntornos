package org.cuatrovientos.ed;

import java.util.ArrayList;

public class Blog {

	public Blog() {
		
	}
	private ArrayList<Post> posts = new ArrayList<Post>();
	public void addPost(Post post) {
		posts.add(post);
	}
	public Post getPost(int pos) {
		return posts.get(pos);
	}
	public void removePost(int pos) {
		posts.remove(pos);
	}
	
}
