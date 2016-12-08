package br.com.fernandonkgw.solid.coesao;

import static br.com.fernandonkgw.solid.coesao.Cargo.DESENVOLVEDOR;
import static br.com.fernandonkgw.solid.coesao.Cargo.DBA;
import static br.com.fernandonkgw.solid.coesao.Cargo.TESTER;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
        if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return new DezOuVintePorcento().dezOuVintePorcento(funcionario);
        }

        if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return new QuinzeOuVinteCincoPorcento().quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

}
