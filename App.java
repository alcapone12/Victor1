
package app;


public class App {

    public static void main(String[] args) {
      
        Aluno p1 = new Aluno ();
        p1.setNome(" Mario ");
        p1.setCpf(" 066.695.252.01 ");
        p1.setEndereco(" Rua 10 ");
        p1.setMatricula(" 202102591538 ");
        
        System.out.println("O Nome do aluno(a) é "+p1.getNome());
        System.out.println("O Cpf do aluno(a) é "+ p1.getCpf());
        System.out.println("O Endereco do aluno(a) é "+p1.getEndereco());
        System.out.println("A Matricula do aluno(a) é " +p1.getMatricula());
        
        Coodernador p2 = new Coodernador ();
        p2.setNome(" Victor ");
        p2.setCpf(" 066.685.525.10 ");
        p2.setEndereco("Rua 9");
        p2.setCurso(" Sistema de Informação ");
        p2.setCodigo(" 123456 ");
        p2.setSalario(5000);
        
         
        Funcionario funcionario = new Funcionario();
	funcionario.setSalario((int) 5400.00);
        System.out.println("\nO Salario do funcionario é "+funcionario.getSalario());
        
        System.out.println("\nO Nome do coodernador(a) é "+p2.getNome());
        System.out.println("O Cpf do coodernador(a) é "+p2.getCpf());
        System.out.println("O Endereco do coodernador(a) é "+p2.getEndereco());
        System.out.println("O Curso responsavél do coodernador(a) é "+p2.getCurso());
        System.out.println("O Codigo de acesso do coodernador(a) é "+p2.getCodigo());
        System.out.println("O Salario do condernador(a) é "+p2.getSalario());
        
        
        Professor p3 = new Professor ();
        p3.setNome(" Claudia ");
        p3.setCpf(" 066.525.100.05 ");
        p3.setCodigo(" 202205 ");
        p3.setEndereco(" Rua 15 ");
        p3.setDepartamento(" Estacio ");
        p3.setSalario(6500);
        
        System.out.println("\nO Nome do Professor(a) é "+p3.getNome());
        System.out.println("O Cpf do professor(a) é "+p3.getCpf());
        System.out.println("O Codigo do professor(a) é "+p3.getCodigo());
        System.out.println("O Endereco do professor(a) é "+p3.getEndereco());
        System.out.println("O Departamento do professor(a) é "+p3.getDepartamento());
        System.out.println("O Salario do professor(a) é "+p3.getSalario());
        
        Professor p4 = new Professor ();
        p4.setNome(" Neymar ");
        p4.setCpf(" 066.525.100.35 ");
        p4.setCodigo(" 202207 ");
        p4.setEndereco(" Rua 54 ");
        p4.setDepartamento(" Estacio ");
        p4.setSalario(6000);
        
        System.out.println("\nO Nome do Professor(a) é "+p4.getNome());
        System.out.println("O Cpf do professor(a) é "+p4.getCpf());
        System.out.println("O Codigo do professor(a) é "+p4.getCodigo());
        System.out.println("O Endereco do professor(a) é "+p4.getEndereco());
        System.out.println("O Departamento do professor(a) é "+p4.getDepartamento());
        System.out.println("O Salario do professor(a) é "+p4.getSalario());
        
        
        
        
        
        
        
        
    }
    
}
