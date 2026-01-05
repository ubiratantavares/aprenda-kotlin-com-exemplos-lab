package me.dio.lab.presentation

import me.dio.lab.domain.model.ConteudoEducacional
import me.dio.lab.domain.model.Formacao
import me.dio.lab.domain.model.Nivel
import me.dio.lab.domain.model.Usuario
import me.dio.lab.domain.repository.FormacaoRepository

class FormacaoViewModel(private val repository: FormacaoRepository) {

    fun criarFormacao(nome: String, nivel: Nivel, conteudos: List<ConteudoEducacional>) {
        val formacao = Formacao(nome, nivel, conteudos)
        repository.salvar(formacao)
        println("Formação '$nome' criada com sucesso.")
    }

    fun matricularUsuario(nomeFormacao: String, vararg usuarios: Usuario) {
        val formacao = repository.buscarPorNome(nomeFormacao)
        if (formacao != null) {
            formacao.matricular(*usuarios)
            println(
                    "Usuários matriculados na formação '$nomeFormacao': ${usuarios.joinToString { it.nome }}"
            )
        } else {
            println("Erro: Formação '$nomeFormacao' não encontrada.")
        }
    }

    fun listarFormacoes() {
        val formacoes = repository.listarTodas()
        println("--- Lista de Formações ---")
        formacoes.forEach { formacao ->
            println("Formação: ${formacao.nome} | Nível: ${formacao.nivel}")
            println("Conteúdos:")
            formacao.conteudos.forEach { println(" - ${it.nome} (${it.duracao} min)") }
            println("Inscritos (${formacao.inscritos.size}):")
            formacao.inscritos.forEach { println(" - ${it.nome}") }
            println("--------------------------")
        }
    }
}
