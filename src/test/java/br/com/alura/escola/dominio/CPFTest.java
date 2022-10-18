package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {
    @Test
    void naoDeveriaCriarCPFcomNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                ()-> new CPF(null));
        assertThrows(IllegalArgumentException.class,
                ()-> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                ()->new CPF("12345678900"));
    }
    @Test
    void deveriaCriarCPFcomNumerosValidos(){
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }

}