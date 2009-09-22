package br.simpleTest;

import java.util.List;

import javax.swing.JOptionPane;

import br.dao.DaoFactory;
import br.model.Aluno;

public class AlunoSimpleTest {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setCod(2);
		a.setNome("Gésio L. Veras");
		DaoFactory<Aluno> dao = new DaoFactory<Aluno>();
		//dao.save(a);
		List<Aluno> alunos = dao.retrive(Aluno.class);
		for (Aluno aluno: alunos){
			JOptionPane.showMessageDialog(null, "Cód: " + aluno.getCod() + " - Nome: " + aluno.getNome() + "\n" );
		}		
		dao.close();
	}
	
}
