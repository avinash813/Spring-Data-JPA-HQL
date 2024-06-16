package com.sample.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.sample.bo.VaccineInfo;


public interface IVaccineRepo extends JpaRepository<VaccineInfo, Integer> 
{
	
	@Query("FROM VaccineInfo WHERE country=:country")
    public List<VaccineInfo> searchVaccineByCountry(String country);
	
	@Query("FROM VaccineInfo WHERE country IN(:country1, :country2)")
	public List<VaccineInfo> searchVaccineByCountries(String country1, String country2);
	
	@Query("SELECT vaccineName, country FROM VaccineInfo WHERE price BETWEEN :min AND :max")
	public List<String> searchVaccineByPriceRange(Integer min, Integer max);
	
	@Query("SELECT country, price FROM VaccineInfo WHERE vaccineName IN(:vac1, :vac2)")
	public List<Object[]> searchVaccineDetailByVaccineName(String vac1, String vac2);
	
	@Transactional
	@Modifying
	@Query("UPDATE VaccineInfo SET price=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccine(Integer newPrice, String vaccineName);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM VaccineInfo WHERE price BETWEEN :min AND :max")
	public int deleteVaccineByPriceRange(Integer min, Integer max);
	
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO vaccine_info (vaccinename,country,price) Values(?,?,?)", nativeQuery=true)
	public int insertVaccineDetails(String vaccineName, String country, Integer price);
	
	
	@Query(value="SELECT NOW() FROM DUAL", nativeQuery=true)
	public Date getTheSystemDateAndTime();
  
   
}
