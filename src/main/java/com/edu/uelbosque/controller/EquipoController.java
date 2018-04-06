package com.edu.uelbosque.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.uelbosque.entity.Equipo;
import com.edu.uelbosque.persistence.EquipoPersistence;

@RestController

public class EquipoController {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	EquipoPersistence pp;
	@RequestMapping(value="/equipo/add",method=RequestMethod.POST)
	public Equipo addEquipo(@RequestParam String nombre, String grupo, String resena, String cod_pais){
		Equipo p=pp.save( new Equipo(nombre, grupo, resena, cod_pais));
		return p;
	}
	@RequestMapping(value="/equipo/delete",method=RequestMethod.POST)
	public void deleteEquipo(@RequestParam Integer id) {
		Equipo p = pp.getOne(id);
		 pp.delete(p);		
	}
	@RequestMapping(value="/equipo/set",method=RequestMethod.POST)
	public Equipo setEquipo(@RequestParam Integer id, String nombre, String grupo, String resena, String cod_pais) {
		Equipo p = pp.save(new Equipo(id, nombre, grupo, resena, cod_pais));
		return p;
	}
	@RequestMapping(value="/equipo/select",method=RequestMethod.POST)
	public Equipo findEquipo(@RequestParam Integer id) {
		Equipo p = pp.findOne(id);
		return p;
	}
	@RequestMapping(value="/equipo/selectAll",method=RequestMethod.POST)
	public List<Equipo> findAllEquipo() {
		List<Equipo> p = pp.findAll();
		return p;
	}
	@RequestMapping(value="/equipo/equipoPorGrupo",method=RequestMethod.POST)
	public ArrayList<Equipo> findEquipo2() {
			ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		     String sql = "SELECT id FROM equipo order by grupo";
		     List<Integer> ids = jdbcTemplate.queryForList(sql, Integer.class );
		     for(Integer i : ids) {
		    	 Equipo p = pp.findOne(i);
		    	 equipos.add(p);
		    	 
		     }
		     
		 
		
		
		return equipos;
	}


}

/**
 * 
 * 
 * 	SELECT cod_pais,grupo,nombre FROM equipo WHERE grupo!="N" order by grupo;
*
*
*
*
*
*
*
*
*/

