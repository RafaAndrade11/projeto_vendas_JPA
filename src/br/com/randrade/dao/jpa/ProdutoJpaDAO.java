/**
 * 
 */
package br.com.randrade.dao.jpa;

import br.com.randrade.dao.generic.jpa.GenericJpaDAO;
import br.com.randrade.domain.jpa.ProdutoJpa;

/**
 * @author rafael.andrade
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
