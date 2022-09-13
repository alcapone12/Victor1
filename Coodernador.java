
package app;

public class Coodernador extends Funcionario {
    
    private String curso;

    public Coodernador() {
    }

    public Coodernador(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void terMatricula(){
        System.out.println("Minha Matricula");
    }

    
}
