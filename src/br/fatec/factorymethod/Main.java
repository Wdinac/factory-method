package br.fatec.factorymethod;

public class Main {

    public static void main(String[] args) {

        CriadorNotificacao criadorEmail = new CriadorEmail();
        CriadorNotificacao criadorSMS = new CriadorSMS();
        CriadorNotificacao criadorPush = new CriadorPush();

        criadorEmail.processarNotificacao(
                "Bem-vindo ao sistema!"
        );

        criadorSMS.processarNotificacao(
                "Seu código é 1234."
        );

        criadorPush.processarNotificacao(
                "Nova atualização disponível."
        );
    }
}