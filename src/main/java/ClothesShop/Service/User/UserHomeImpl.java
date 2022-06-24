package ClothesShop.Service.User;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Dao.GioHangDao;
import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Entity.SanPham;
@Service
public class UserHomeImpl implements UserIHome{
	@Autowired
	private SanPhamDao sanphamDao;
	@Autowired
	private DanhMucDao danhmucDao;
	@Autowired
	private GioHangDao giohangDao;
	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}
	public List<DanhMuc> GetDataDanhMuc() {
		return danhmucDao.GetDataDanhMuc();
	}
	public List<SanPham> GetDataChiTiet(int id) {
		return sanphamDao.GetDataChiTiet(id);
	}
	public List<ChiTietSanPham> GetDataSizeChiTiet(int id) {
		return sanphamDao.GetDataSizeChiTiet(id);
	}
//	public List<SanPham> GetDataSanPhamTimKiem(String ten_sp) {
//		return sanphamDao.GetDataSanPhamTimKiem(ten_sp);
//	}
//	public List<GioHang>  GetGioHang() {
//		return giohangDao.GetGioHang();
//	}
//	
	
}
