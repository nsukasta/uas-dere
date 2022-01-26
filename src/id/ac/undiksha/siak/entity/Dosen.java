package id.ac.undiksha.siak.entity;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Dosen extends Pegawai {

	private String nidn;
	private String bidangIlmu;
	private String jabatanFungsional;
	
	public  Prodi  prodi = new Prodi();
	
	
	public String getNidn() {
		return nidn;
	}
	public void setNidn(String nidn) {
		this.nidn = nidn;
	}
	public String getBidangIlmu() {
		return bidangIlmu;
	}
	public void setBidangIlmu(String bidangIlmu) {
		this.bidangIlmu = bidangIlmu;
	}
	public String getJabatanFungsional() {
		return jabatanFungsional;
	}
	public void setJabatanFungsional(String jabatanFungsional) {
		this.jabatanFungsional = jabatanFungsional;
	}


}
