/**
 * 
 */
package br.com.randrade.dao.generic.jpa;

import java.io.Serializable;

import br.com.randrade.domain.jpa.Persistente;

/**
 * @author rafael.andrade
 *
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
