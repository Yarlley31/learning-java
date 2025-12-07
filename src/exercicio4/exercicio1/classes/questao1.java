package exercicio4.exercicio1.classes;

public class questao1 {
    public static void main(String[] args) {
        ingressos inPadrao = new ingressos("Wicked", true, 22);

        meia ingressoMeia = new meia("Wicked", true, 22);

        familia ingressoFamilia = new familia("Wicked", true, 22, 4);



        System.out.println("Preço Ingresso inteiro: " + inPadrao.getValue());
        System.out.println("Preço Ingresso meia: " + ingressoMeia.getValue());
        System.out.println("Preço Ingresso familia: " + ingressoFamilia.getValue());


    }
}
