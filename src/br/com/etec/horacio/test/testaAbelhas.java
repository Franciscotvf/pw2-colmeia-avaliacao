package br.com.etec.horacio.test;
import br.com.etec.horacio.model.AbelhaRainha;
import br.com.etec.horacio.model.Operaria;
import br.com.etec.horacio.model.Zangao;

public class testaAbelhas {

    static void main(String[] args) {
        System.out.println("-------------Abelhas-------------");

        Operaria neumann = new Operaria("Neumann", 40, 67);
        Zangao chico = new Zangao("Chico", 30, 40);
        AbelhaRainha eduardo = new AbelhaRainha("Eduardo Sassone", 30, 10000);

        System.out.println("\n" + neumann.getNome() + ":");
        neumann.coletarRecurso();
        neumann.defenderColmeia();

        System.out.println("\n" + chico.getNome() + ":");
        chico.defenderColmeia();

        System.out.println("\n" + eduardo.getNome() + ":");
        System.out.println("Não possui capacidades especiais.");
    }
}