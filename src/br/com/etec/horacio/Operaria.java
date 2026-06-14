package br.com.etec.horacio;

public class Operaria extends Abelha {
    private int durodevoo;

    public Operaria(String nome, int idade, int duracaoVoo) {
        super(nome, idade);
        this.durodevoo = duracaoVoo;
    }
    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividades: pegando néctar/protegendo a colmeia");
    }
    @Override
    public double calcularConsumoDiario() {
        return 10.0 + (durodevoo * 2.0);
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo operadora, Duração: " + durodevoo);
    }
}