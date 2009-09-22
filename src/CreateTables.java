import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;



public class CreateTables {

	public static void main(String[] args) {
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.addAnnotatedClass(br.model.Aluno.class);
		acfg.addAnnotatedClass(br.model.Disciplina.class);
		SchemaUpdate se = new SchemaUpdate(acfg);
		se.execute(true, true);
	}

}
