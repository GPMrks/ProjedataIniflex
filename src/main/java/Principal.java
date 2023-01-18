import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {

        LinkedList<Funcionario> listaDeFuncionarios = new LinkedList<>();

        cadastrarFuncionarios(listaDeFuncionarios);

        listaDeFuncionarios.removeIf(funcionario -> Objects.equals(funcionario.getNome(), "João"));

        System.out.println("\nLista dos funcionários: \n");

        for (Funcionario func : listaDeFuncionarios) {
            System.out.println(func);
        }

        System.out.println("\n________________________________________________________________\n");

        aplicarAumentoDeSalario(listaDeFuncionarios);

        Map<Object, List<Funcionario>> funcionariosAgrupadosPorFuncao = agruparFuncionariosPorFuncao(listaDeFuncionarios);

        System.out.println("Lista dos funcionários ordenados por função: \n");

        for (Map.Entry<Object, List<Funcionario>> entry : funcionariosAgrupadosPorFuncao.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        System.out.println("________________________________________________________________\n");

        System.out.println("Lista dos funcionários com mês de aniversário 10 e 12: \n");

        listaDeFuncionarios.stream()
                .filter((funcionario) ->
                        funcionario.getDataNascimento().getMonth() == ((Month.of(10))))
                .forEach(System.out::println);

        listaDeFuncionarios.stream()
                .filter((funcionario) ->
                        funcionario.getDataNascimento().getMonth() == ((Month.of(12))))
                .forEach(System.out::println);

        System.out.println("\n________________________________________________________________\n");

        System.out.println("Lista dos funcionários ordenados em ordem alfabética: \n");

        listaDeFuncionarios.sort(Comparator.comparing(Pessoa::getNome));

        for (Funcionario func : listaDeFuncionarios) {
            System.out.println(func);
        }

        System.out.println("\n________________________________________________________________\n");

        BigDecimal somaDosSalarios = listaDeFuncionarios.stream()
                .map(Funcionario::getSalario)    // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        DecimalFormat formatarSalario = new DecimalFormat("###,##0.00");

        String salarioFormatado = formatarSalario.format(somaDosSalarios).replace(".", ",").replaceFirst(",", ".");
        System.out.println("A soma de todos os salários dos funcionários é: R$" + salarioFormatado);

        System.out.println("\n________________________________________________________________\n");

        System.out.println("Quantidade de salários mínimos:\n");

        BigDecimal salarioMinimo = BigDecimal.valueOf(1212.00);

        DecimalFormat formatarQuantidadeDeSalariosMinimos = new DecimalFormat("#,##0.00");

        for (Funcionario func : listaDeFuncionarios) {
            String quantidadeDeSalariosMinimos = formatarQuantidadeDeSalariosMinimos.format(func.getSalario().divide(salarioMinimo, RoundingMode.CEILING)).replace(".", ",").replaceFirst(",", ".");
            System.out.println(func.getNome() + ": " + quantidadeDeSalariosMinimos);
        }
    }

    private static void cadastrarFuncionarios(LinkedList<Funcionario> listaDeFuncionarios) {
        listaDeFuncionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), BigDecimal.valueOf(2009.44), "Operador"));
        listaDeFuncionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), BigDecimal.valueOf(2284.38), "Operador"));
        listaDeFuncionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), BigDecimal.valueOf(9836.14), "Coordenador"));
        listaDeFuncionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88), "Diretor"));
        listaDeFuncionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), BigDecimal.valueOf(2234.68), "Recepcionista"));
        listaDeFuncionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), BigDecimal.valueOf(1582.72), "Operador"));
        listaDeFuncionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), BigDecimal.valueOf(4071.84), "Contador"));
        listaDeFuncionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), BigDecimal.valueOf(3017.45), "Gerente"));
        listaDeFuncionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), BigDecimal.valueOf(1606.85), "Eletricista"));
        listaDeFuncionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), BigDecimal.valueOf(2799.93), "Gerente"));
    }

    private static void aplicarAumentoDeSalario(LinkedList<Funcionario> listaDeFuncionarios) {

        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            listaDeFuncionarios.get(i).setSalario(listaDeFuncionarios.get(i).getSalario().multiply(BigDecimal.valueOf(1.1)));
        }
    }

    private static Map<Object, List<Funcionario>> agruparFuncionariosPorFuncao(LinkedList<Funcionario> listaDeFuncionarios) {
        return listaDeFuncionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));
    }
}
