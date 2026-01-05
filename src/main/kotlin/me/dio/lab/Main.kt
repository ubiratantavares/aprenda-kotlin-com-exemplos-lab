package me.dio.lab

import me.dio.lab.data.repository.FormacaoRepositoryImpl
import me.dio.lab.domain.model.ConteudoEducacional
import me.dio.lab.domain.model.Nivel
import me.dio.lab.domain.model.Usuario
import me.dio.lab.presentation.FormacaoViewModel

fun main() {
    // Dependência (Repository)
    val repository = FormacaoRepositoryImpl()

    // ViewModel (Controller/Presenter)
    val viewModel = FormacaoViewModel(repository)

    // Criando Usuários
    val usuario1 = Usuario(1, "Alice", "alice@example.com")
    val usuario2 = Usuario(2, "Bob", "bob@example.com")
    val usuario3 = Usuario(3, "Charlie", "charlie@example.com")

    // Criando Conteúdos
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo2 = ConteudoEducacional("POO com Kotlin", 120)
    val conteudo3 = ConteudoEducacional("Collections em Kotlin", 90)

    // Criando Formação via ViewModel
    viewModel.criarFormacao(
            "Kotlin Developer",
            Nivel.INTERMEDIARIO,
            listOf(conteudo1, conteudo2, conteudo3)
    )

    // Matriculando Usuários
    viewModel.matricularUsuario("Kotlin Developer", usuario1, usuario2)

    // Tentando matricular em formação inexistente
    viewModel.matricularUsuario("Java Developer", usuario3)

    // Listando Formações e Inscritos
    viewModel.listarFormacoes()

    // Adicionando mais um inscrito
    viewModel.matricularUsuario("Kotlin Developer", usuario3)

    // Listando novamente para confirmar
    viewModel.listarFormacoes()
}
