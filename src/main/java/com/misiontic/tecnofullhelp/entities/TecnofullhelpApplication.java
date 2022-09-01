package com.misiontic.tecnofullhelp.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class TecnofullhelpApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TecnofullhelpApplication.class, args);
		//Instanciar objeto de la clase Empresa
		System.out.println("------------------------------------------------Test Empresa------------------------------------------------");
		Enterprise Empresa1 = new Enterprise(98090909,"Bancolombia", "DIAG 21B # 1 - 33", "3132525622");

		//Valores iniciales
		System.out.println(Empresa1.toString());

		//Leer nombre empresa
		System.out.println("Nombre de la empresa: " + Empresa1.getName());
		//Modificar nombre empresa
		Empresa1.setName("Bancolombia asociados");
		System.out.println("Nombre de la empresa actualizada: " + Empresa1.getName());

		//Leer dirección empresa
		System.out.println("Dirección de la empresa: " + Empresa1.getAddress());
		//Modificar dirección empresa
		Empresa1.setAddress("CRA 12 # 45-45");
		System.out.println("Dirección de la empresa actualizada: " + Empresa1.getAddress());

		//Leer teléfono empresa
		System.out.println("Teléfono de la empresa: " + Empresa1.getPhone());
		//Modificar teléfono empresa
		Empresa1.setPhone("34578945455");
		System.out.println("Teléfono de la empresa actualizado: " + Empresa1.getPhone());

		//Leer NIT empresa
		System.out.println("Nit de la empresa: " + Long.toString(Empresa1.getNit()));
		//Modificar NIT empresa
		Empresa1.setNit(90000009);
		System.out.println("Nit de la empresa actualizado: " + Long.toString(Empresa1.getNit()));

		//Valor final
		System.out.println(Empresa1.toString());

	}

}
