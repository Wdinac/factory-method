package br.fatec.factorymethod;

public class CriadorEmail extends CriadorNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new EmailNotificacao();
    }
}