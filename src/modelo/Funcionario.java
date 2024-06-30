package modelo;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class Funcionario extends Pessoa {
    
    private double salarioBase;
    private double imposto;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario(){
        return this.salarioBase - this.salarioBase * this.imposto / 100;  
    }

    @Override
    public String toString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DecimalFormat dfm = new DecimalFormat(",##0.00");
        return  "Funcionario" + "\n" + 
                "Nome: " + getNome() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Data de Nascimento: " + df.format(getDataNascimento()) + "\n" +
                "Salario Base: R$ " + dfm.format(salarioBase) + "\n" + 
                "Imposto:  " + dfm.format(imposto) + "%\n" + 
                "Salario Liquido: R$ " + dfm.format(calcularSalario())+ "\n";
                
    }  
    
}
