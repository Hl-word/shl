package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "p_person")
public class Person implements Serializable {
    @Id
    private Integer id;

    @Column(name = "p_name")
    private String pName;

    private String gender;

    @Column(name = "company_id")
    private Integer companyId;

    private Date joindata;
    @Transient
    private String start;
    @Transient
    private String end;

    @Transient
    private Company company;
    
    
    
    public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public static void setSerialVersionUID(long serialVersionUID) {
		Person.serialVersionUID = serialVersionUID;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	private static long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * @return joindata
     */
    public Date getJoindata() {
        return joindata;
    }

    /**
     * @param joindata
     */
    public void setJoindata(Date joindata) {
        this.joindata = joindata;
    }

    @Override
	public String toString() {
		return "Person [id=" + id + ", pName=" + pName + ", gender=" + gender + ", companyId=" + companyId
				+ ", joindata=" + joindata + ", start=" + start + ", end=" + end + ", company=" + company + "]";
	}
}