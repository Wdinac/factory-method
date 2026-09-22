package br.fatec.factorymethod;

public class CriadorPush extends CriadorNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}