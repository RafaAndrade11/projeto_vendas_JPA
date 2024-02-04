/**
 * 
 */
package br.com.randrade.dao.jpa;

import br.com.randrade.domain.jpa.ProdutoJpa;
import br.com.randrade.dao.generic.jpa.GenericJpaDB1DAO;

/**
 * @author rafael.andrade
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
