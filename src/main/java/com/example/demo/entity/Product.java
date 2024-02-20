package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
		
		@Id
		int pid;
		String pname;
		String ptxno;
		String pdetails;
		boolean pstatus;
		public Product(int pid, String pname, String ptxno, String pdetails, boolean pstatus) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.ptxno = ptxno;
			this.pdetails = pdetails;
			this.pstatus = pstatus;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPtxnno() {
			return ptxno;
		}
		public void setPtxnno(String ptxnno) {
			this.ptxno = ptxnno;
		}
		public String getPdetails() {
			return pdetails;
		}
		public void setPdetails(String pdetails) {
			this.pdetails = pdetails;
		}
		public boolean isPstatus() {
			return pstatus;
		}
		public void setPstatus(boolean pstatus) {
			this.pstatus = pstatus;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", ptxnno=" + ptxno + ", pdetails=" + pdetails
					+ ", pstatus=" + pstatus + "]";
		}
		
}
