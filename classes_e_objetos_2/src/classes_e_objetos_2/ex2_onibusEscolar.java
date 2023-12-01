package classes_e_objetos_2;
import java.util.ArrayList;
import java.util.List;

public class ex2_onibusEscolar {

	private int aluno;
	private int professor;

	public static List<ex2_onibusEscolar> listaOnibusEscolar = new ArrayList<>();

	public ex2_onibusEscolar(int aluno, int professor) {

		setAluno(aluno);
		setProfessor(professor);
		listaOnibusEscolar.add(this);
	}

	public int getAluno() {
		return aluno;
	}

	public void setAluno(int aluno) {
		if (aluno > 40) {
			this.aluno = 40;

		} else {
			this.aluno = aluno;
		}

	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		if (professor == 0) {
			aluno = 0;
		} else {
			this.professor = professor;
		}

	}
	public void alteraAluno(int aux1){
		setAluno(getAluno() - aux1);
		
	}

	@Override
	public String toString() {
		return "o onibus com " + this.getAluno() + " alunos e " + this.getProfessor() + " professores";
	}

}

