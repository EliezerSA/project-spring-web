/**
 * 
 */
package com.buenmaestro.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.buenmaestro.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Eliezer
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		
		return "Eliezer Santiago Fuentes";
	}

}
