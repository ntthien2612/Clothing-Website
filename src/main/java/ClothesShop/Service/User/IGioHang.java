package ClothesShop.Service.User;

import java.util.List;

import ClothesShop.Entity.GioHang;

public interface IGioHang {
	public int ThemGioHang(GioHang giohang);
	public List<GioHang> HienGioHang(int id_kh);
	public int CongGioHang(int idsp, int idkh);
	public int TruGioHang(int idsp, int idkh);
	public int XoaGioHang(int id, int idkh);
}
