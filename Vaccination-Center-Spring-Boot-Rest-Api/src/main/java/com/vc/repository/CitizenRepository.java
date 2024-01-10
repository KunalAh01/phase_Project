package com.vc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vc.entity.Citizens;

@Repository
public interface CitizenRepository extends JpaRepository<Citizens, Integer> {

	@Query("select  c.cname,c.age,c.city,c.phonenumber,vc.hcname,vc.vcname,vc.vdate from Citizens c, VaccinationCenter vc where c.cname=:cname and vc.cid=c.cid")
	public List<Object[]> findCitizensAndTheirCenter(@Param("cname") String cname);
	
	@Query("select c.cname,c.age,c.city,c.phonenumber from Citizens c, VaccinationCenter vc where vc.hcname=:hcname and vc.cid=c.cid")
	public List<Object[]> findCitizenAndVaccinationCenterByHcName(@Param("hcname") String hcname);
}
