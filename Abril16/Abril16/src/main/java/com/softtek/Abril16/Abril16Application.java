package com.softtek.Abril16;

import com.softtek.Abril16.ejercicio1.modelo.Saludo;
import com.softtek.Abril16.ejercicio2.modelo.Conductor;
import com.softtek.Abril16.ejercicio3.modelo.Coche;
import com.softtek.Abril16.ejercicio3.modelo.SeguroCoche;
import com.softtek.Abril16.ejercicio4.modelo.Secretario;
import com.softtek.Abril16.ejercicio5.modelo.Cliente;
import com.softtek.Abril16.ejercicio5.persistencia.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {

	@Autowired
	private Saludo saludo;

	//@Autowired
	//private Conductor conductor;

	@Autowired
	private SeguroCoche seguroCoche;

	@Autowired
	private Coche coche;

	@Autowired
	private Secretario secretario;

	@Autowired
	private ClienteDAO clienteDAO;
	@Autowired
	private Cliente cliente;

	public static void main(String[] args) {
		SpringApplication.run(Abril16Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.saludar());
		//System.out.println(conductor.conducir());
		System.out.println(seguroCoche.reparar(coche));
		System.out.println(secretario.getTareas());
		System.out.println(secretario.getInforme());
		System.out.println(clienteDAO.insertar(cliente));
	}
}
