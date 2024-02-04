/**
 * 
 */
package br.com.randrade.dao.jpa;

import br.com.randrade.dao.generic.jpa.IGenericJapDAO;
import br.com.randrade.domain.jpa.Persistente;

/**
 * @author rafael.andrade
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}

