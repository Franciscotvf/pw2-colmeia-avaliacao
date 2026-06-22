package br.com.etec.horacio.model;

public class AbelhaRainha extends Abelha {
    private int qtdOvos;

    public AbelhaRainha(String nome, int idade, int qtdOvosDia) {
        super(nome, idade);
        this.qtdOvos = qtdOvosDia;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade: Gerar mais ovos para a Colônia");
    }

    @Override
    public double calcularConsumoDiario() {
        return 20.0 + (qtdOvos * 0.01);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo Rainha / Ovos por Dia: " + qtdOvos);
    }
}