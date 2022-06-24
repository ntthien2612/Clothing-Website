package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.GioHang;
import ClothesShop.Service.User.GioHangImpl;

@Controller
public class GioHangController{
	@Autowired
	GioHangImpl giohangImpl;
	public ModelAndView _mvShare = new ModelAndView();
	@RequestMapping(value = "themgiohang", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateDanhMuc(@ModelAttribute("giohang") GioHang giohang) {
		int count = giohangImpl.ThemGioHang(giohang);
		if (count > 0) {// them it nhat dc 1 dong
			_mvShare.addObject("status", "Thêm giỏ hàng thành công !");

		} else {
			_mvShare.addObject("status", "Thêm giỏ hàng thất bại !");
		}
		_mvShare.setViewName("redirect:/");
		return _mvShare;
	}
	//trang gio hang
		@RequestMapping(value = "/giohang", method = RequestMethod.GET, params = "id_kh")
		public ModelAndView GioHang(int id_kh) {
			ModelAndView giohang = new ModelAndView("user/giohang");
			giohang.addObject("giohang", giohangImpl.HienGioHang(id_kh));
			return giohang;
		}
	//cong so luong
		@RequestMapping(value = "/cong", method = RequestMethod.GET, params = "idsp")
		public ModelAndView CongGioHang(int idsp, int idkh) {
			_mvShare.addObject("giohang", giohangImpl.CongGioHang(idsp, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
	//tru so luong
		@RequestMapping(value = "/tru", method = RequestMethod.GET, params = "idsp")
		public ModelAndView TruGioHang(int idsp, int idkh) {
			_mvShare.addObject("giohang", giohangImpl.TruGioHang(idsp, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
	//xoa san pham
		@RequestMapping(value = "/xoagiohang", method = RequestMethod.GET, params = "id")
		public ModelAndView XoaGioHang(int id, int idkh) {
			_mvShare.addObject(giohangImpl.XoaGioHang(id, idkh));
			_mvShare.setViewName("redirect:/giohang?id_kh="+idkh);
			return _mvShare;
		}
}
