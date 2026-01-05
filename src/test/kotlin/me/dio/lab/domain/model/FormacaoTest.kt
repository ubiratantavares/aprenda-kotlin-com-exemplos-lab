package me.dio.lab.domain.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FormacaoTest {

    @Test
    fun `deve matricular usuario com sucesso`() {
        // Arrange
        val conteudo = ConteudoEducacional("Intro", 60)
        val formacao = Formacao("Kotlin", Nivel.BASICO, listOf(conteudo))
        val usuario = Usuario(1, "Teste", "teste@email.com")

        // Act
        formacao.matricular(usuario)

        // Assert
        assertEquals(1, formacao.inscritos.size)
        assertEquals(usuario, formacao.inscritos[0])
    }

    @Test
    fun `deve matricular multiplos usuarios com sucesso`() {
        // Arrange
        val conteudo = ConteudoEducacional("Intro", 60)
        val formacao = Formacao("Kotlin", Nivel.BASICO, listOf(conteudo))
        val usuario1 = Usuario(1, "Teste1", "teste1@email.com")
        val usuario2 = Usuario(2, "Teste2", "teste2@email.com")

        // Act
        formacao.matricular(usuario1, usuario2)

        // Assert
        assertEquals(2, formacao.inscritos.size)
        assertTrue(formacao.inscritos.contains(usuario1))
        assertTrue(formacao.inscritos.contains(usuario2))
    }
}
