package br.com.etec.horacio.model;

import br.com.etec.horacio.interfaces.Defensor;

public class Zangao extends Abelha implements Defensor {
    private int vooParaAcasalamento;

    public Zangao(String nome, int idadeDias, int vooParaAcasalamento) {
        super(nome, idadeDias);
        this.vooParaAcasalamento = vooParaAcasalamento;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade Realizando " + vooParaAcasalamento + " voos através acasalamento.");
        defenderColmeia();
    }

    @Override
    public double calcularConsumoDiario() {
        return 0;
    }

    @Override
    public void defenderColmeia() {
        System.out.println("Defendendo a colmeia de invasores");
    }

    public double calcularConsumoAlimentar() {
        return 15.0 + (vooParaAcasalamento * 3.0);
    }
}