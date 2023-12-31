package br.inatel.labs.labjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.labs.labjpa.entity.Fornecedor;
import br.inatel.labs.labjpa.entity.NotaCompra;
import br.inatel.labs.labjpa.entity.NotaCompraItem;
import br.inatel.labs.labjpa.entity.Produto;

public interface NotaCompraItemRepository extends JpaRepository<NotaCompraItem, Long>{
	
}
