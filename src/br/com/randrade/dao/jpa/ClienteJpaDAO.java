/**
 * 
 */
package br.com.randrade.dao.jpa;

import br.com.randrade.dao.generic.jpa.GenericJpaDAO;
import br.com.randrade.domain.jpa.ClienteJpa;

/**
 * @author rafael.andrade
 *
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
