package edu.hust.k54.persistence;

// Generated Nov 6, 2012 9:41:46 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Xuatthan generated by hbm2java
 */
public class Xuatthan implements java.io.Serializable {

	private Integer idxuatthan;
	private String ten;
	private String mota;
	private Set soyeulyliches = new HashSet(0);

	public Xuatthan() {
	}

	public Xuatthan(String ten, String mota, Set soyeulyliches) {
		this.ten = ten;
		this.mota = mota;
		this.soyeulyliches = soyeulyliches;
	}

	public Integer getIdxuatthan() {
		return this.idxuatthan;
	}

	public void setIdxuatthan(Integer idxuatthan) {
		this.idxuatthan = idxuatthan;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Set getSoyeulyliches() {
		return this.soyeulyliches;
	}

	public void setSoyeulyliches(Set soyeulyliches) {
		this.soyeulyliches = soyeulyliches;
	}

}
