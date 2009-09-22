package br.simpleTest;

import java.util.List;

import javax.swing.JOptionPane;

import br.dao.DaoFactory;
import br.model.Disciplina;

public class DisciplinaSimpleTest {
	
	public static void main(String[] args) {
		Disciplina d = new Disciplina();
		d.setCodigo(1);
		d.setDescricao("P.O.O");
		d.setPeso(2.3);
		d.setDataAtualizacao(java.sql.Date.valueOf("2009-09-20"));
		
		DaoFactory<Disciplina> dao = new DaoFactory<Disciplina>();
	//	dao.save(d);
		
		List <Disciplina> lista = dao.retrive(br.model.Disciplina.class);
		for (Disciplina disc : lista){
			JOptionPane.showMessageDialog(null, "Cód: " + disc.getCodigo() + " Data: " + disc.getDataAtualizacao().toString() + " Descricao: " + disc.getDescricao() + "\n");
		}
		
		dao.close();
		
	}

}
