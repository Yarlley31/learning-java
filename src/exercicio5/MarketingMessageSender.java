package exercicio5;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MessageService {
    void reciveMessage(String message);
}

public class MarketingMessageSender {
    static void main() {
        String message = "Promoção de 13% em todo o estoque";

        MessageService ServiceSMS = msg -> {
            System.out.println("[SMS] Torpedo disparado: " + msg);
        };

        MessageService ServiceEmail = msg -> {
            System.out.println("[EMAIL] Enviando para lista de contato: " + msg);
        };

        MessageService ServiceSocialMedia = msg -> {
            System.out.println("[Redes Sociais] Enviado para o social media: " + msg);
        };

        MessageService ServiceWhatsapp = msg -> {
            System.out.println("[Whatsapp] Enviando para o contatos do Whatsapp: " + msg);
        };

        List<MessageService> servicesList = Arrays.asList(ServiceSMS, ServiceEmail, ServiceSocialMedia, ServiceWhatsapp);

        for (MessageService service : servicesList) {
            service.reciveMessage(message);
        }
    }
}
