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
		Enterprise Empresa2 = new Enterprise(88888888,"Finanzas S.A.", "CRA 21 # 1 - 35", "3127894545");
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

		//Instanciar objeto de la clase Empresa
		System.out.println("------------------------------------------------Test Empleado------------------------------------------------");

		//Instanciando objeto de tipo Empleado
		Employee Empleado1 = new Employee("Emmanuel Mantilla","emmanuel15@bancolombia.com", Empresa1, Enum_role.Operario);

		//Valores iniciales
		System.out.println(Empleado1.toString());

		//Leer nombre empleado
		System.out.println("Nombre del empleado: " + Empleado1.getName());
		//Modificar nombre empleado
		Empleado1.setName("Emmanuel Mantilla Muñoz");
		System.out.println("Nombre del empleado actualizado: " + Empleado1.getName());

		//Leer correo empleado
		System.out.println("Correo del empleado: " + Empleado1.getEmail());
		//Modificar correo empleado
		Empleado1.setEmail("emmanuel.mantilla15@bancolombia.com");
		System.out.println("Correo del empleado actualizado: " + Empleado1.getEmail());

		//Leer empresa empleado
		System.out.println("Empresa del empleado: " + Empleado1.getEnterprise().getName());
		//Modificar empresa empleado
		Empleado1.setEnterprise(Empresa2);
		System.out.println("Empresa del empleado actualizada: " + Empleado1.getEnterprise().getName());

		//Leer rol empleado
		System.out.println("Rol del empleado: " + Empleado1.getRole());
		//Modificar rol empleado
		Empleado1.setRole(Enum_role.Admin);
		System.out.println("Rol del empleado actualizado: " + Empleado1.getRole());

		//Valor final
		System.out.println(Empleado1.toString());

	}

}
