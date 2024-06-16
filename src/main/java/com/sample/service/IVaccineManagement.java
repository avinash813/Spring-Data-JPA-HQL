package com.sample.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;


import com.sample.bo.VaccineInfo;


public interface IVaccineManagement 
{
	public List<VaccineInfo> fetchVaccineByCountry(String country);
	 public List<VaccineInfo> fetchVaccineByCountries(String country1, String country2);
	 
	
		public List<String> fetchVaccineByPriceRange(Integer min, Integer max);
		
		
		public List<Object[]> fetchVaccineDetailByVaccineName(String vac1, String vac2);
		
		public int changePriceByVaccine(Integer newPrice, String vaccineName);
		
		public int deleteVaccinesByPrice(Integer min, Integer max);
		
		public int insertVaccines(String vaccineName, String country, Integer price);
		
		public Date getSystemDateAndTime();
	
}
