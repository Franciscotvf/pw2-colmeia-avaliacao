package br.com.etec.horacio;

public class Zangao extends Abelha {
    private int vooParaAcasalamento;

    public Zangao(String nome, int idadeDias, int vooParaAcasalamento) {
        super(nome, idadeDias);
        this.vooParaAcasalamento = vooParaAcasalamento;
    }


    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade Realizando " + vooParaAcasalamento + " voos através acasalamento.");
    }

    @Override
    public double calcularConsumoDiario() {
        return 0;
    }


    public double calcularConsumoAlimentar() {
        return 15.0 + (vooParaAcasalamento * 3.0);
    }
}