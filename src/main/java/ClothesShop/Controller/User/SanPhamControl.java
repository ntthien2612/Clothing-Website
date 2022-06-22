package ClothesShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Service.User.UserHomeImpl;
@Controller
public class SanPhamControl {
	@Autowired
	UserHomeImpl HomeService;
	//trang san pham
		@RequestMapping(value = "/sanpham")
		public ModelAndView Product() {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham());
			return sp;
		}
		
		
		@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "id" )
		public ModelAndView Product(int id) {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham(id));
				
			return sp;
		}
		
		@RequestMapping(value = "/sanpham", method = RequestMethod.GET, params = "noidung", produces="application/x-www-form-urlencoded;charset=UTF-8" )
		public ModelAndView Product(String noidung) {
			ModelAndView sp = new ModelAndView("user/sanpham");
			sp.addObject("sanpham", HomeService.GetDataSanPham(noidung));
				
			return sp;
		}
}
