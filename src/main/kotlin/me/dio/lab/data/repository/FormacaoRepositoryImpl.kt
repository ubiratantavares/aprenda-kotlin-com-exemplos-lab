package me.dio.lab.data.repository

import me.dio.lab.domain.model.Formacao
import me.dio.lab.domain.repository.FormacaoRepository

class FormacaoRepositoryImpl : FormacaoRepository {
    private val formacoes = mutableListOf<Formacao>()

    override fun salvar(formacao: Formacao) {
        formacoes.add(formacao)
    }

    override fun listarTodas(): List<Formacao> {
        return formacoes.toList()
    }

    override fun buscarPorNome(nome: String): Formacao? {
        return formacoes.find { it.nome.equals(nome, ignoreCase = true) }
    }
}
