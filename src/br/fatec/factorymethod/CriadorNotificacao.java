package br.fatec.factorymethod;

public abstract class CriadorNotificacao {

    public abstract Notificacao criarNotificacao();

    public void processarNotificacao(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}