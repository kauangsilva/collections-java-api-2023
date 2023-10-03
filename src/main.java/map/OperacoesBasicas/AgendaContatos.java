package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("Agenda de Contatos Vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("Agenda de Contatos Vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


         agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Kauan", 45456);
        agendaContatos.adicionarContato("Kauan", 15151);
        agendaContatos.adicionarContato("Kauan Silva", 44444);
        agendaContatos.adicionarContato("Joao Pedro", 11111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover Contato
        agendaContatos.removerContato("Joao Pedro");
        agendaContatos.exibirContatos();

        // Pesquisando por nome
        System.out.println("O número é: "+ agendaContatos.pesquisarPorNome("Kauan Silva"));
    }
}