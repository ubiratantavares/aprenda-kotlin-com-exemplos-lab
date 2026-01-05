package me.dio.lab.domain.model

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}
