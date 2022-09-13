
package app;

public class Professor extends Funcionario {
    
    private String departamento;

    public Professor() {
    }

    public Professor(String departamento, String codigo, double salario) {
        
        super(codigo, salario * 1.2);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario * 1.2); 
    }
    
    
}

