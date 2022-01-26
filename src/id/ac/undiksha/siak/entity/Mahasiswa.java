package id.ac.undiksha.siak.entity;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia {
	
	private String 	nim;
	private String 	angkatan;
	private String	kelas;
	
	public Mahasiswa(String nim, String angkatan, String kelas) {
		super();
		this.nim = nim;
		this.angkatan = angkatan;
		this.kelas = kelas;
	}
	
	public Mahasiswa(
			String nim, 
			String angkatan, 
			String kelas, 
			String noKTP, 
			String namaDepan, 
			String namaBelakang, 
			boolean jenisKelamin, 
			String tglLahir,
			String alamat) 
	{
		super(noKTP, namaDepan, namaBelakang, jenisKelamin, tglLahir, alamat);
		this.nim = nim;
		this.angkatan = angkatan;
		this.kelas = kelas;
	}

	
	public  Prodi  prodi = new Prodi();
	
	public Mahasiswa() {
		
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNim() {
		return this.nim;
	}

	public String getAngkatan() {
		return angkatan;
	}

	public void setAngkatan(String angkatan) {
		this.angkatan = angkatan;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
		this.setNamaDepan("Test");
		
	}
	
	public void printInfo() {
		System.out.println(this.getNim());
		System.out.println(this.getAngkatan());
		System.out.println(this.getKelas());
		super.printInfo();
	}

}

