package controller;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.*;

public class DBController {
    
    static DatabaseHandler conn = new DatabaseHandler();

    public static KTP getKTP(String nik) {

        KTP ktp = new KTP();
        try {
            conn.connect();
            String query = "SELECT * FROM ktp WHERE NIK='" + nik + "'";
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                do {
                    ktp.setNik(rs.getString("NIK"));
                    ktp.setNama(rs.getString("nama"));
                    ktp.setTempatLahir(rs.getString("tempat_lahir"));
                    ktp.setTanggalLahir(rs.getString("tanggal_lahir"));
                    ktp.setJenisKelamin(JenisKelamin.valueOf(rs.getString("jenis_kelamin")));
                    ktp.setGolonganDarah(rs.getString("gol_darah"));
                    ktp.setAlamat(rs.getString("alamat"));
                    ktp.setRtrw(rs.getString("rtrw"));
                    ktp.setKelDesa(rs.getString("keldesa"));
                    ktp.setKecamatan(rs.getString("kecamatan"));
                    ktp.setAgama(JenisAgama.valueOf(rs.getString("agama")));
                    ktp.setStatusPerkawinan(StatusPerkawinan.valueOf(rs.getString("status_perkawinan")));
                    ktp.setPekerjaan(rs.getString("pekerjaan"));
                    ktp.setKewarganegaraan(rs.getString("kewarganegaraan"));
                    ktp.setWargaNegaraAsal(rs.getString("negara_asal"));
                    ktp.setFotoFilePath(new File(rs.getString("photo_path")));
                    ktp.setTandaTanganFilePath(new File(rs.getString("signature_path")));
                    ktp.setBerlakuHingga(rs.getString("berlaku_hingga"));
                    ktp.setKotaPembuatan(rs.getString("kota_pembuatan"));
                    ktp.setTanggalPembuatan(rs.getString("tanggal_pembuatan"));
                } while (rs.next());
            }
            else {
                return null;
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        conn.disconnect();
        return ktp;
    }

    public static boolean insertNewUser(KTP ktp) {

        String query = "INSERT INTO ktp (nik, nama, tempat_lahir, tanggal_lahir, jenis_kelamin, gol_darah, alamat, rtrw, keldesa, kecamatan, agama, status_perkawinan, pekerjaan, kewarganegaraan, negara_asal, photo_path, signature_path, berlaku_hingga, kota_pembuatan, tanggal_pembuatan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn.connect();
            PreparedStatement stmt = conn.con.prepareStatement(query);
            
            stmt.setString(1, ktp.getNik());
            stmt.setString(2, ktp.getNama());
            stmt.setString(3, ktp.getTempatLahir());
            stmt.setString(4, ktp.getTanggalLahir());
            stmt.setString(5, ktp.getJenisKelamin().name());
            stmt.setString(6, ktp.getGolonganDarah());
            stmt.setString(7, ktp.getAlamat());
            stmt.setString(8, ktp.getRtrw());
            stmt.setString(9, ktp.getKelDesa());
            stmt.setString(10, ktp.getKecamatan());
            stmt.setString(11, ktp.getAgama().name());
            stmt.setString(12, ktp.getStatusPerkawinan().name());
            stmt.setString(13, ktp.getPekerjaan());
            stmt.setString(14, ktp.getKewarganegaraan());
            stmt.setString(15, ktp.getWargaNegaraAsal());
            stmt.setString(16, ktp.getFotoFilePath().getPath());
            stmt.setString(17, ktp.getTandaTanganFilePath().getPath());
            stmt.setString(18, ktp.getBerlakuHingga());
            stmt.setString(19, ktp.getKotaPembuatan());
            stmt.setString(20, ktp.getTanggalPembuatan());

            stmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
        finally {
            conn.disconnect();
        }
    }

    public static boolean updateData(KTP ktp) {

        String query = "UPDATE ktp SET nama=?, tempat_lahir=?, tanggal_lahir=?, jenis_kelamin=?, gol_darah=?, alamat=?, rtrw=?, keldesa=?, kecamatan=?, agama=?, status_perkawinan=?, pekerjaan=?, kewarganegaraan=?, negara_asal=?, photo_path=?, signature_path=?, berlaku_hingga=?, kota_pembuatan=?, tanggal_pembuatan=? WHERE NIK=?";

        try {
            conn.connect();
            PreparedStatement stmt = conn.con.prepareStatement(query);
            
            stmt.setString(1, ktp.getNama());
            stmt.setString(2, ktp.getTempatLahir());
            stmt.setString(3, ktp.getTanggalLahir());
            stmt.setString(4, ktp.getJenisKelamin().name());
            stmt.setString(5, ktp.getGolonganDarah());
            stmt.setString(6, ktp.getAlamat());
            stmt.setString(7, ktp.getRtrw());
            stmt.setString(8, ktp.getKelDesa());
            stmt.setString(9, ktp.getKecamatan());
            stmt.setString(10, ktp.getAgama().name());
            stmt.setString(11, ktp.getStatusPerkawinan().name());
            stmt.setString(12, ktp.getPekerjaan());
            stmt.setString(13, ktp.getKewarganegaraan());
            stmt.setString(14, ktp.getWargaNegaraAsal());
            stmt.setString(15, ktp.getFotoFilePath().getPath());
            stmt.setString(16, ktp.getTandaTanganFilePath().getPath());
            stmt.setString(17, ktp.getBerlakuHingga());
            stmt.setString(18, ktp.getKotaPembuatan());
            stmt.setString(19, ktp.getTanggalPembuatan());
            stmt.setString(20, ktp.getNik());

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
        finally {
            conn.disconnect();
        }
    }

    public static boolean deleteData(String nik) {

        String query = "DELETE FROM ktp WHERE NIK=?";

        try {
            conn.connect();
            PreparedStatement stmt = conn.con.prepareStatement(query);
            
            stmt.setString(1, nik);

            int rowsDeleted = stmt.executeUpdate();
            return rowsDeleted > 0;
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
        finally {
            conn.disconnect();
        }
    }
}