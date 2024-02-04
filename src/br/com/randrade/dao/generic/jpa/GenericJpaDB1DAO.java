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
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
