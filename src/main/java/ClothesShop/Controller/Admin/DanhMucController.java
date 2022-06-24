package ClothesShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Service.Admin.AdminHomeImpl;
import ClothesShop.Service.Admin.DanhMucImpl;
import ClothesShop.Service.User.UserHomeImpl;
@Controller
public class DanhMucController {
	@Autowired
	UserHomeImpl UserService;
	@Autowired
	AdminHomeImpl AdminService;
	@Autowired
	DanhMucImpl danhmucHomeImpl = new DanhMucImpl();
	public ModelAndView _mvShare = new ModelAndView();
//xu ly them danh muc
		@RequestMapping(value = "admin/quanlydanhmucSP", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
		public ModelAndView CreateDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
			int count = danhmucHomeImpl.AddDanhMuc(danhmuc);
			if (count > 0) {// them it nhat dc 1 dong
				_mvShare.addObject("status", "Thêm danh mục thành công !");

			} else {
				_mvShare.addObject("status", "Thêm danh mục thất bại !");
			}
			_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
			return _mvShare;
		}
// trang danh muc
	@RequestMapping(value = "/admin/quanlydanhmucSP", method = RequestMethod.GET)
	public ModelAndView DanhMuc() {
		_mvShare.addObject("danhmuc", new DanhMuc());// tao 1 doi tuong danh muc moi
		_mvShare.addObject("danhsach", danhmucHomeImpl.GetDataHienDanhMuc());//danhsach do ra o var va items ben file jsp
		_mvShare.setViewName("admin/admin_danhmuc");
		return _mvShare;
	}
//xoa danh muc
	@RequestMapping(value = "/admin/xoa", method = RequestMethod.GET, params = "id_xoa")
		public ModelAndView XoaDanhMuc(int id_xoa) {
		_mvShare.addObject(danhmucHomeImpl.GetDataXoaDanhMuc(id_xoa));
		_mvShare.addObject("danhsach", danhmucHomeImpl.GetDataHienDanhMuc());
		_mvShare.setViewName("admin/admin_danhmuc");
		return _mvShare;
		}
//chinh sua danh muc
	//hien giao dien trang chinh sua
	@RequestMapping(value = "/admin/chinhsua", method = RequestMethod.GET, params = "id_chinhsua", produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView SuaDanhMuc(int id_chinhsua) {
		_mvShare.addObject("edit_danhmuc",danhmucHomeImpl.GetDataSuaDanhMuc(id_chinhsua));
		_mvShare.setViewName("admin/chinhsua_danhmuc");
			return _mvShare;
	}
	//xu ly chinh sua
	@RequestMapping(value = "/admin/chinhsuadanhmuc", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView EditDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
		int count = danhmucHomeImpl.ChinhSuaDanhMuc(danhmuc);
		_mvShare.setViewName("redirect:/admin/quanlydanhmucSP");
		return _mvShare;
	}
}
