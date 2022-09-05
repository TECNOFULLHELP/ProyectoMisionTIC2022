package com.misiontic.tecnofullhelp;

import com.misiontic.tecnofullhelp.entities.Employee;
import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.entities.Enum_role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TecnofullhelpApplication {

	public static void main(String[] args) {
        SpringApplication.run(TecnofullhelpApplication.class, args);
		//tarea 5
		Enterprise empresa1= new Enterprise(90909090, "Bancolombia", "Diag 21", "3132291055", LocalDate.now(),  LocalDate.now());
		Employee empleado1 = new Employee("William Mantilla", "william.mantilla14@gmail.com", empresa1, Enum_role.Operario);

		System.out.println("Lista Empresas");
		System.out.println(empresa1.toString());
		System.out.println("Lista Empleados");
		System.out.println(empleado1.toString());



	}

}
