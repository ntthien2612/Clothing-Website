package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.MapperDanhMuc;
import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Entity.Users;
@Repository
public class GioHangDao extends BaseDao{
//them san pham gio hang
	public int ThemGioHang(GioHang giohang) {
		{
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT ");
			sql.append("INTO giohang ");
			sql.append("( ");
			sql.append("	id_kh, ");
			sql.append("	id_sp, ");
			sql.append("	size, ");
			sql.append("	soluong_them ");
			sql.append(") ");
			sql.append("VALUES ");
			sql.append("( ");
			sql.append("	"+giohang.getId_kh()+", ");
			sql.append("	"+giohang.getId_sp()+", ");
			sql.append("	'"+giohang.getSize()+"', ");
			sql.append("	"+giohang.getSoluong_them()+" ");
			sql.append(")");
			
			int insert = _jdbcTemplate.update(sql.toString());
			return insert;
		}
	}
//hien thi gio hang
	public List<GioHang> HienGioHang(int id_kh) {
		List<GioHang> list = new ArrayList<GioHang>();
		String sql = "select * from giohang where id_kh="+id_kh;
		list = _jdbcTemplate.query(sql, new MapperGioHang());
		return list;
	}
//cong so luong sp gio hang
	public int CongGioHang(int idsp, int idkh) {
		String sql = "update giohang set soluong_them=soluong_them+1 where id="+idsp;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//tru so luong sp gio hang
	public int TruGioHang(int idsp, int idkh) {
		String sql = "update giohang set soluong_them=soluong_them-1 where id="+idsp;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//xoa sp gio hang
	public int XoaGioHang(int id, int idkh) {
		String sql = "delete from giohang where id="+id;
		int list = _jdbcTemplate.update(sql.toString());
		return list;
	}
//dem so luong sp gio hang	
	public int Count(int id_kh) {
		int count=0;
		String sql = "SELECT COUNT(*) FROM giohang where id_kh="+id_kh;
		count = _jdbcTemplate.queryForObject(sql,Integer.class);
		return count;
	}
}
