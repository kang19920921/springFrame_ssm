package com.kang.pojo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Emp {
	
	private  String   empNo;
    private  String   eName;
    private  String   job;
    private  Integer  mgr ;
    
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private  String     hireDate ;
    
    private  Double   sal  ;
    private  Double   comm;
    private  Integer  deptno ;
    
    
   
    
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hireDate=" + hireDate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	

	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
    
    
    

	

}
