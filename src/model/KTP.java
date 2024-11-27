package model;

import java.io.File;
import java.util.Date;

public class KTP {

    private String nik;
    private String nama;
    private String tempatLahir;
    private String tanggalLahir;
    private JenisKelamin jenisKelamin;
    private String golonganDarah;
    private String alamat;
    private String rtrw;
    private String kelDesa;
    private String kecamatan;
    private JenisAgama agama;
    private StatusPerkawinan statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String wargaNegaraAsal;
    private File fotoFilePath;
    private File tandaTanganFilePath;
    private String berlakuHingga;
    private String kotaPembuatan;
    private String tanggalPembuatan;

    @Override
    public String toString() {
        return "KTP [nik=" + nik + ", nama=" + nama + ", tempatLahir=" + tempatLahir + ", tanggalLahir=" + tanggalLahir
                + ", jenisKelamin=" + jenisKelamin + ", golDarah=" + golonganDarah + ", alamat=" + alamat + ", rt/rw="
                + rtrw + ", kelDesa=" + kelDesa + ", kecamatan=" + kecamatan + ", agama=" + agama
                + ", statusPerkawinan=" + statusPerkawinan + ", pekerjaan=" + pekerjaan + ", kewarganegaraan="
                + kewarganegaraan + ", wargaNegaraAsal=" + wargaNegaraAsal + ", fotoFilePath=" + fotoFilePath
                + ", tandaTanganFilePath=" + tandaTanganFilePath + ", berlakuHingga=" + berlakuHingga
                + ", kotaPembuatan=" + kotaPembuatan + ", tanggalPembuatan=" + tanggalPembuatan + "]";
    }

    public KTP() {
    }

    public KTP(String nik, String nama, String tempatLahir, String tanggalLahir, JenisKelamin jenisKelamin,
            String golonganDarah, String alamat, String rtrw, String kelDesa, String kecamatan, JenisAgama agama,
            StatusPerkawinan statusPerkawinan, String pekerjaan, String kewarganegaraan, String wargaNegaraAsal,
            File fotoFilePath, File tandaTanganFilePath, String berlakuHingga, String kotaPembuatan,
            String tanggalPembuatan) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golonganDarah = golonganDarah;
        this.alamat = alamat;
        this.rtrw = rtrw;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.wargaNegaraAsal = wargaNegaraAsal;
        this.fotoFilePath = fotoFilePath;
        this.tandaTanganFilePath = tandaTanganFilePath;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.tanggalPembuatan = tanggalPembuatan;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public JenisAgama getAgama() {
        return agama;
    }

    public void setAgama(JenisAgama agama) {
        this.agama = agama;
    }

    public StatusPerkawinan getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(StatusPerkawinan statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getWargaNegaraAsal() {
        return wargaNegaraAsal;
    }

    public void setWargaNegaraAsal(String wargaNegaraAsal) {
        this.wargaNegaraAsal = wargaNegaraAsal;
    }

    public File getFotoFilePath() {
        return fotoFilePath;
    }

    public void setFotoFilePath(File fotoFilePath) {
        this.fotoFilePath = fotoFilePath;
    }

    public File getTandaTanganFilePath() {
        return tandaTanganFilePath;
    }

    public void setTandaTanganFilePath(File tandaTanganFilePath) {
        this.tandaTanganFilePath = tandaTanganFilePath;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public String getTanggalPembuatan() {
        return tanggalPembuatan;
    }

    public void setTanggalPembuatan(String tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }

}