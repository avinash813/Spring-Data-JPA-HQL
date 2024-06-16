package com.sample;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringDataJpaFindersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFindersApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	     
//		service.fetchVaccineByCountry("India").forEach(v->System.out.println(v));
//		System.out.println("*********************************************");
//		
//		service.fetchVaccineByCountries("USA", "Russia").forEach(c->System.out.println(c));
//		
//		System.out.println("************************************************");
//		
//		service.fetchVaccineByPriceRange(454, 54345).forEach(c->System.out.println(c));
//		
//		System.out.println("************************************************");
//		List<Object[]> vaccineDetails = service.fetchVaccineDetailByVaccineName("sputnik", "covaxin");
//		for(Object[] obj:vaccineDetails)
//		{
//			for(Object vaccine: obj)
//			{
//				System.out.print(vaccine + " -> ");
//			}
//			System.out.println();
//			
//		}
		
//		service.fetchVaccineDetailByVaccineName("sputnik", "covaxin").forEach(c->System.out.println(c));
		
//		System.out.println(service.changePriceByVaccine(23454, "CovidShild"));
//		System.out.println("No of record deleted : "+ service.deleteVaccinesByPrice(6352, 34524));
//		
//		System.out.println(service.insertVaccines("Covid shield", "Uuu", 34544));
		Date date = service.getSystemDateAndTime();
		System.out.println("Current date and Time of System "+ date);
		
		
		
		context.close();
	}

}
