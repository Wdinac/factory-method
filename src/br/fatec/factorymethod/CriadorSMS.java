package br.fatec.factorymethod;

public class CriadorSMS extends CriadorNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new SMSNotificacao();
    }
}