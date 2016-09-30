package br.com.csintegra.services;

import java.util.List;

import br.com.csintegra.models.EventosCalendario;

public interface CalendarioService extends GenericService<EventosCalendario> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.tangramit.services.GenericService#findByName(java.lang.String)
	 */
	@Override
	EventosCalendario findByName(String name);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#save(java.lang.Object)
	 */
	@Override
	void save(EventosCalendario entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#update(java.lang.Object)
	 */
	@Override
	void update(EventosCalendario entity);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteById(java.lang.Long)
	 */
	@Override
	void deleteById(Long id);

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#findAll()
	 */
	@Override
	List<EventosCalendario> findAll();

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.tangramit.services.GenericService#deleteAll()
	 */
	@Override
	void deleteAll();

}
