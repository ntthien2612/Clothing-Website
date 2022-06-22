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
	
	public int AddSanPham(SanPham sanpham) {
		return sanphamDao.AddSanPham(sanpham);
	}

	public List<SanPham> GetDataSanPham() {
		return sanphamDao.GetDataSanPham();
	}

	public List<ChiTietSanPham>KiemTraChiTiet(int id_sp, int soluong, String size) {
		return sanphamDao.KiemTraChiTiet(id_sp, soluong, size);
	}

	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
	}

	public int KiemTraChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.KiemTraChiTiet(chitietsp);
	}

	public int UpdateChiTiet(ChiTietSanPham chitietsp) {
		return sanphamDao.UpdateChiTiet(chitietsp);
		
	}

//	public int ThemSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.ThemSanPhamChiTiet(chitietsp);
//	}
//
//	public int UpdateSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.UpdateSanPhamChiTiet(chitietsp);
//	}
//
//	public int ThemMoiSanPhamChiTiet(ChiTietSanPham chitietsp) {
//		return sanphamDao.ThemMoiSanPhamChiTiet(chitietsp);
//	}
}
