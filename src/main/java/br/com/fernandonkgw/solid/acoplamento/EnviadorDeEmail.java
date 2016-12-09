package br.com.fernandonkgw.solid.acoplamento;

public class EnviadorDeEmail {

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
