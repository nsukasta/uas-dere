package id.ac.undiksha.siak.entity;

public class Manusia {
	
	private String 	noKTP;
	private String 	namaDepan, namaBelakang;
	private boolean jenisKelamin; // 0 = Perempuan - 1 = Laki-Laki
	private String 	tglLahir;
	private String 	alamat;
	
	public Manusia() { //Polimorphism
		this.noKTP 			= "(Belum ada nomer KTP)";
		this.namaDepan 		= "(Belum ada nama depan)";
		this.namaBelakang 	= "(Belum ada nama belakang)";
		this.tglLahir 		= "(Belum ada tgl lahir)";
		this.alamat			= "(Belum ada alamat)";
	}
	
		
	public Manusia(String noKTP, String namaDepan, String namaBelakang, boolean jenisKelamin, String tglLahir,
			String alamat) {
		super();
		this.noKTP			= noKTP;
		this.namaDepan		= namaDepan;
		this.namaBelakang 	= namaBelakang;
		this.jenisKelamin 	= jenisKelamin;
		this.tglLahir 		= tglLahir;
		this.alamat 		= alamat;
	}

	public Manusia(String namaDepan, String namaBelakang) {
		this.namaDepan = namaDepan;
		this.namaBelakang = namaBelakang;
		
	
		
	}
	
	public String getNamaDepan() {
		return namaDepan;
	}

	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}

	public String getNamaBelakang() {
		return namaBelakang;
	}
	
	public String getNamaLengkap() {
		return this.getNamaDepan() + " " + this.getNamaBelakang();
	}

	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}

	public String getJenisKelamin() {
		
		if (this.isJenisKelamin()) {
			return "Laki-Laki";
		} 
		
		else {
			return "Perempuan";
		}
	}
	
	public boolean getJenisKelamin(boolean returnBoolean) {
		return this.jenisKelamin;
		
	}
	
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
		public String getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(String tglLahir) {
		this.tglLahir = tglLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoKTP() {
		return noKTP;
	}

	public void setNoKTP(String noKTP) {
		this.noKTP = noKTP;
	}
	
	public void printInfo() {
		System.out.println(this.getNoKTP());
		System.out.println(this.getNamaLengkap());
		System.out.println(this.getJenisKelamin());
		System.out.println(this.getTglLahir());
		System.out.println(this.getAlamat());
		
	}

	
}
