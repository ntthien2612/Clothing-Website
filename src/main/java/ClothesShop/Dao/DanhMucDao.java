package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.MapperChiTietSanPham;
import ClothesShop.Entity.MapperDanhMuc;

@Repository
public class DanhMucDao extends BaseDao {

//hien danh muc
	public List<DanhMuc> GetDataDanhMuc() {
		try {
			List<DanhMuc> list = new ArrayList<DanhMuc>();
			String sql = "select * from danhmuc";
			list = _jdbcTemplate.query(sql, new MapperDanhMuc());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public List<DanhMuc> GetDataHienDanhMuc() {
		try {
			List<DanhMuc> list = new ArrayList<DanhMuc>();
			String sql = "select * from danhmuc";
			list = _jdbcTemplate.query(sql, new MapperDanhMuc());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//them danh muc
	public int AddDanhMuc(DanhMuc danhmuc) {
		{
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO danhmuc ");
			sql.append("( ");
			sql.append("	ten_dm ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	'" + danhmuc.getTen_dm() + "' ");
			sql.append(")");

			int insert = _jdbcTemplate.update(sql.toString());
			return insert;// tra ve ket qua cap nhat duoc bao nhieu dong
		}
	}

//xoa danh muc
	public List<DanhMuc> GetDataXoaDanhMuc(int id_xoa) {
		try {
			List<DanhMuc> list_sp = new ArrayList<DanhMuc>();
			String sql_sp = "delete from danhmuc where id_dm=" + id_xoa;
			int delete = _jdbcTemplate.update(sql_sp.toString());
			return list_sp;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//hien trang chinh sua
	public List<DanhMuc> GetDataSuaDanhMuc(int id_chinhsua) {
		try {
			List<DanhMuc> list = new ArrayList<DanhMuc>();
			String sql = "select * from danhmuc where id_dm=" + id_chinhsua;
			list = _jdbcTemplate.query(sql, new MapperDanhMuc());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//sua danh muc
	public int ChinhSuaDanhMuc(DanhMuc danhmuc) {
		try {
			String sql = "update danhmuc set ten_dm=" + "'" + danhmuc.getTen_dm() + "'" + " where id_dm="
					+ danhmuc.getId_dm();
			int update = _jdbcTemplate.update(sql.toString());
			return update;
		} catch (EmptyResultDataAccessException e) {
			return 0;
		}
	}
	
	public int Count(String tendm) {
		int count = 0;
		String sql = "SELECT COUNT(*) FROM danhmuc where ten_dm='" + tendm + "'";
		count = _jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
}
