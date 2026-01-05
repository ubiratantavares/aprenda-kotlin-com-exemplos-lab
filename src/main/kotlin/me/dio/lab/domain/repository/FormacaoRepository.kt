package me.dio.lab.domain.repository

import me.dio.lab.domain.model.Formacao

interface FormacaoRepository {
    fun salvar(formacao: Formacao)
    fun listarTodas(): List<Formacao>
    fun buscarPorNome(nome: String): Formacao?
}
