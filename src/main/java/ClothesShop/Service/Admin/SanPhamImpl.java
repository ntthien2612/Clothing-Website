package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.SanPhamDao;
import ClothesShop.Entity.ChiTietSanPham;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.SanPham;
import ClothesShop.Service.Admin.ISanPham;
@Service
public class SanPhamImpl implements ISanPham{
	@Autowired
	SanPhamDao sanphamDao = new SanPhamDao();
//them san pham	
	public int AddSanPham(SanPham sanpham) {
		return sanphamDao.AddSanPham(sanpham);
	}
//hien danh sach san pham ra cho nguoi dung
	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}
//them moi chi tiet san pham	
	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
	}
//kiem tra chi tiet san pham
	public int KiemTraChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.KiemTraChiTiet(chitietsp);
	}
//update so luong chi tiet san pham
	public int UpdateChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.UpdateChiTiet(chitietsp);
		
	}
//hien danh sach san pham
	public List<String[]> GetDataDanhSachSanPham() {
		return sanphamDao.GetDataDanhSachSanPham();
	}
//xoa san pham
	public List<SanPham> GetDataXoaSanPham(int id_xoa) {
		return sanphamDao.GetDataXoaSanPham(id_xoa);
	}
//hien trang sua
	public List<String[]> GetDataSuaSanPham(int id_chinhsua) {
		return sanphamDao.GetDataSuaSanPham(id_chinhsua);
	}
	public int UpdateSanPham(SanPham sanpham) {
		return sanphamDao.UpdateSanPham(sanpham);
	}
	public List<String[]> TimSanPham(String ten_sp) {
		return sanphamDao.TimSanPham(ten_sp);
	}
}
