package br.com.etec.horacio.model;

import br.com.etec.horacio.interfaces.Coletor;
import br.com.etec.horacio.interfaces.Defensor;

public class Operaria extends Abelha implements Coletor, Defensor {
    private int duradevoo;

    public Operaria(String nome, int idade, int duracaoVoo) {
        super(nome, idade);
        this.duradevoo = duracaoVoo;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividades: pegando néctar/protegendo a colmeia");
        coletarRecurso();
        defenderColmeia();
    }

    @Override
    public double calcularConsumoDiario() {
        return 10.0 + (duradevoo * 2.0);
    }

    @Override
    public void coletarRecurso() {
        System.out.println("Coletando os recursos da colmeia (pólen)");
    }

    @Override
    public void defenderColmeia() {
        System.out.println("Impedindo invasores de entrar na colmeia");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo operadora, Duração: " + duradevoo);
    }
}