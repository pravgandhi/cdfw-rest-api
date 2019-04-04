package com.sbb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class CSUserLaborClassMappingEntityPK implements Serializable{

	@Id
	@Column(name="USER_ID")
	private int userId;
	
	@Id
	@Column(name="LABOR_CLASS_ID")
    private int laborClassId;
	
	@Id
	@Column(name="REGION_ID")
	private int regionId;
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getLaborClassId() {
		return laborClassId;
	}
	public void setLaborClassId(int laborClassId) {
		this.laborClassId = laborClassId;
	}
	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + laborClassId;
		result = prime * result + regionId;
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CSUserLaborClassMappingEntityPK other = (CSUserLaborClassMappingEntityPK) obj;
		if (laborClassId != other.laborClassId)
			return false;
		if (regionId != other.regionId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
}