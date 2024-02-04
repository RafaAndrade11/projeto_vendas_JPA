/**
 * 
 */
package br.com.randrade.dao.jpa;

import br.com.randrade.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.randrade.domain.jpa.ClienteJpa;

/**
 * @author rafael.andrade
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
