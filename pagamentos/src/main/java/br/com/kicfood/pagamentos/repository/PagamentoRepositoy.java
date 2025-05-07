package br.com.kicfood.pagamentos.repository;

import br.com.kicfood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}
