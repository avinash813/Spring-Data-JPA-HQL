package com.sample.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sample.bo.VaccineInfo;
import com.sample.dao.IVaccineRepo;


@Service
public class VaccineManagementImpl implements IVaccineManagement {

	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineInfo> fetchVaccineByCountry(String country) {
		
		return repo.searchVaccineByCountry(country);
	}

	@Override
	public List<VaccineInfo> fetchVaccineByCountries(String comp1, String comp2) {
		
		return repo.searchVaccineByCountries(comp1, comp2);
	}

	@Override
	public List<String> fetchVaccineByPriceRange(Integer min, Integer max) {
		
		return repo.searchVaccineByPriceRange(min, max);
	}

	@Override
	public List<Object[]> fetchVaccineDetailByVaccineName(String vac1, String vac2) {
		
		return repo.searchVaccineDetailByVaccineName(vac1, vac2);
	}

	@Override
	public int changePriceByVaccine(Integer newPrice, String vaccineName) {
		
		return repo.updatePriceByVaccine(newPrice, vaccineName);
	}

	@Override
	public int deleteVaccinesByPrice(Integer min, Integer max) {
		
		return repo.deleteVaccineByPriceRange(min, max);
	}

	@Override
	public int insertVaccines(String vaccineName, String vaccineCompany, Integer price) {
		
		return repo.insertVaccineDetails(vaccineName, vaccineCompany, price);
	}

	@Override
	public Date getSystemDateAndTime() {
		
		return repo.getTheSystemDateAndTime();
	}




	
	
}
