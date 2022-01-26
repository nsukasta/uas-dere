package id.ac.undiksha.siak.main;

import id.ac.undiksha.siak.entity.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa mhs1 = new Mahasiswa("1915101036", "2019", "B", "12345", "Kadek Suka", "Astawa", true, "16-05-2000", "Singaraja");
		mhs1.printInfo();
		
		Manusia mn3 = new Manusia();
		mn3.printInfo();
		
		/*
		System.out.println(mhs1.getNim());
		System.out.println(mhs1.getNamaLengkap());
		System.out.println(mhs1.getJenisKelamin());
		System.out.println(mhs1.getAlamat());
		System.out.println(mhs1.getTglLahir());
		System.out.println(mhs1.getNoKTP());
		
		Pegawai pgw1 = new Pegawai();
		
		pgw1.setNamaDepan("Nama");
		pgw1.setNip("32143265475");
		
		Dosen ds1  = new Dosen();
		
		ds1.setNidn("1214");
		ds1.setNip("132214325646");
		ds1.setNamaDepan("namaDepan");
		
		ds1.prodi.setNamaProdi("Ilmu Komputer");
		
		System.out.println(ds1.prodi.getNamaProdi());
		
		Manusia mn1 = new Manusia("Suka", "Astawa");
		mn1.printInfo();
		
		
		//Mahasiswa mhs2 =  new Mahasiswa("1234567890", "2019", "B");
		
		/*System.out.println(mhs2.getNim());
		System.out.println(mhs2.getNamaLengkap());
		System.out.println(mhs2.getJenisKelamin());
		System.out.println(mhs2.getAlamat());
		System.out.println(mhs2.getTglLahir());
		System.out.println(mhs2.getNoKTP());*/
				
		
	}

}
