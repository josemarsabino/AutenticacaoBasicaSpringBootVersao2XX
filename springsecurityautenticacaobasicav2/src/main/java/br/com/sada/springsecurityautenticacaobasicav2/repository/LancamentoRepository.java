package br.com.sada.springsecurityautenticacaobasicav2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.springsecurityautenticacaobasicav2.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
