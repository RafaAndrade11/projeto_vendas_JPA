/**
 * 
 */
package dao;

import br.com.randrade.dao.generic.jpa.GenericJpaDAO;
import br.com.randrade.dao.jpa.IVendaJpaDAO;
import br.com.randrade.domain.jpa.VendaJpa;
import br.com.randrade.exceptions.DAOException;
import br.com.randrade.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
