package br.dao;

import java.util.List;

public interface IDAO <T> {
	public void add (T t);
	public void remove (T t);
	public void update (T t);
	public List query  (T t);
	
}
