package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.AdminDao;
import ClothesShop.Dao.DanhMucDao;
import ClothesShop.Entity.Admin;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminIHome;

@Service
public class AdminHomeImpl implements AdminIHome {
	@Autowired
	private DanhMucDao danhmucDao;
	@Autowired
	private AdminDao adminDao;
	public List<DanhMuc> GetDataDanhMuc() {
		return danhmucDao.GetDataDanhMuc();
	}
	//danh sach admin
	public List<Admin> GetDataDanhSachAdmin() {
		return adminDao.GetDataDanhSachAdmin();
	}
	public List<Admin> GetDataTimKiemAdmin(String tenad) {
		return adminDao.GetDataTimKiemAdmin(tenad);
	}

}
