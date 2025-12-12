public class SistemaDeEntregas {
    public enum StatusPedido {
        AGUARDANDO_PAGAMENTO,
        PREPARANDO,
        ENVIADO,
        ENTREGUE,
        CANCELADO
    }

    static void main() {
        // simulando que o dado veio de um bando de dados
        StatusPedido statusAtual = StatusPedido.AGUARDANDO_PAGAMENTO;

        tomarAcao(statusAtual);
    }

    static void  tomarAcao(StatusPedido status) {
        switch (status) {
            case AGUARDANDO_PAGAMENTO:
                System.out.println(">> Sistema: Enviar e-mail de cobrança para o cliente.");
                break;
            case PREPARANDO:
                System.out.println(">> Sistema: Alertar o estoque para separar os itens.");
                break;
            case ENVIADO:
                System.out.println(">> Sistema: Enviar código de rastreio por SMS.");
                break;
            case ENTREGUE:
                System.out.println(">> Sistema: Enviar pesquisa de satisfação.");
                break;
            case CANCELADO:
                System.out.println(">> Sistema: Perguntar ao usuário o motivo do cancelamento.");
                break;
            default:
                System.out.println(">> Erro: Status desconhecido.");
        }
    }
}
