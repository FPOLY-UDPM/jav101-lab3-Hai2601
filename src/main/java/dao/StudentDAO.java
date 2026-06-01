package dao;

import model.Student;
import java.sql.*;
import java.util.*;

public class StudentDAO {

    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();

        String sql = "SELECT id, masv, Ho + ' ' + TenLot + ' ' + Ten AS hoten FROM SINHVIEN";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                list.add(new Student(
                        rs.getInt("id"),
                        rs.getString("masv"),
                        rs.getString("hoten")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}