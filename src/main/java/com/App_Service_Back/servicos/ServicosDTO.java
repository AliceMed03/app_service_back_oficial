package com.App_Service_Back.servicos;

import com.App_Service_Back.agendamento.Agendamento;
import com.App_Service_Back.categoria.Categoria;
import com.App_Service_Back.prestador.Prestador;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicosDTO {
    private Long servico_id;
    @NotNull(message = "O campo NOME é requerido")
    private String servico_nome;
    private Double servico_preco;
    @NotNull(message = "O campo DESCRICAO é requerido")
    private String servico_descricao;
    private String servico_informacoesExtras;
    @NotNull(message = "O campo CATEGORIAS é requerido")
    private Categoria categorias;
    @NotNull(message = "O campo PRESTADORES é requerido")
    private Prestador prestadores;
    private List<Agendamento> agendamentos;
    private String servico_classificacao;

    public Long getServico_id() {
        return servico_id;
    }

    public void setServico_id(Long servico_id) {
        this.servico_id = servico_id;
    }

    public @NotNull(message = "O campo NOME é requerido") String getServico_nome() {
        return servico_nome;
    }

    public void setServico_nome(@NotNull(message = "O campo NOME é requerido") String servico_nome) {
        this.servico_nome = servico_nome;
    }

    public Double getServico_preco() {
        return servico_preco;
    }

    public void setServico_preco(Double servico_preco) {
        this.servico_preco = servico_preco;
    }

    public @NotNull(message = "O campo DESCRICAO é requerido") String getServico_descricao() {
        return servico_descricao;
    }

    public void setServico_descricao(@NotNull(message = "O campo DESCRICAO é requerido") String servico_descricao) {
        this.servico_descricao = servico_descricao;
    }

    public String getServico_informacoesExtras() {
        return servico_informacoesExtras;
    }

    public void setServico_informacoesExtras(String servico_informacoesExtras) {
        this.servico_informacoesExtras = servico_informacoesExtras;
    }

    public @NotNull(message = "O campo CATEGORIAS é requerido") Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(@NotNull(message = "O campo CATEGORIAS é requerido") Categoria categorias) {
        this.categorias = categorias;
    }

    public @NotNull(message = "O campo PRESTADORES é requerido") Prestador getPrestadores() {
        return prestadores;
    }

    public void setPrestadores(@NotNull(message = "O campo PRESTADORES é requerido") Prestador prestadores) {
        this.prestadores = prestadores;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public String getServico_classificacao() {
        return servico_classificacao;
    }

    public void setServico_classificacao(String servico_classificacao) {
        this.servico_classificacao = servico_classificacao;
    }
}