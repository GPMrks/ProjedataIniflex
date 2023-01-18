import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(salario, that.salario) && Objects.equals(funcao, that.funcao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salario, funcao);
    }

    DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat formatarSalario = new DecimalFormat("###,##0.00");

    @Override
    public String toString() {
        return "Funcionario{" +
                " Nome: " + this.getNome() + "  | " +
                " Data de Nascimento: " + this.getDataNascimento().format(formataData) + "  | " +
                " Salário: " + formatarSalario.format(salario).replace(".", ",").replaceFirst(",", ".") + "  | " +
                " Função: " + funcao +
                " }";
    }
}
