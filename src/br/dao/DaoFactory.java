package br.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;


public class DaoFactory<T> {
	
	private Session session;
	
	public DaoFactory (){
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		
		acfg.addAnnotatedClass(br.model.Aluno.class);
		acfg.addAnnotatedClass(br.model.Disciplina.class);
		
		session = acfg.buildSessionFactory().openSession();
		session.beginTransaction();		
	}
	
	public void save (T t){
		session.save(t);
		session.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> retrive (Class<T> c){
		return session.createQuery("from " + c.getName()).list();
	}
	
	public void close(){
		session.close();
	}
	
}
