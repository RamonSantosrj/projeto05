package abstractions;

import entities.Profissional;

public abstract class ProfissionalRepositoryAbstract {
	
	protected static final String PATH = "C:\\Users\\ramon\\Desktop\\backup\\Aula Coti Informatica - java web\\";
	
	public abstract void exportar(Profissional profissional) throws Exception;
	
	
}
