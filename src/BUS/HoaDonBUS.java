package BUS;

import DAO.CTHoaDonDAO;
import DAO.HoaDonDAO;
import DAO.CTSanPhamDAO;
import DAO.CTBaoHanhDAO;
import DTO.CTHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.CTSanPhamDTO;
import DTO.CTBaoHanhDTO;
import DTO.KhachHangDTO;
import helper.Formatter;
import java.util.ArrayList;

/**
 * Class xử lý logic liên quan đến hóa đơn
 * 
 * @author Windows
 */
public class HoaDonBUS {
    private KhachHangBUS khBUS = new KhachHangBUS();
    private NhanVienBUS nvBUS = new NhanVienBUS();
    private HoaDonDAO hdDAO = new HoaDonDAO();
    private CTBaoHanhDAO ctbhDAO = new CTBaoHanhDAO();
    private CTHoaDonDAO cthdDAO = new CTHoaDonDAO();
    private CTSanPhamDAO ctspDAO = new CTSanPhamDAO();
    public ArrayList<HoaDonDTO> hoaDonList;

    public HoaDonBUS() {
        this.hoaDonList = hdDAO.selectAll(); // Load tất cả hóa đơn từ cơ sở dữ liệu
    }
    
    public ArrayList<HoaDonDTO> getAll() { 
        return this.hoaDonList;
    }
    
    public long getTotalMoney() {
        long result = 0;
        for (HoaDonDTO i : hoaDonList) {
            result += i.getTongTien();
        }
        return result;
    }
    
    public HoaDonDTO getByID(int id) {
        for (HoaDonDTO i : hoaDonList) {
            if (i.getId() == id)
                return i;
        }
        return null;
    }
    
    public boolean addNewHd(HoaDonDTO hd) {
        if (hdDAO.insert(hd) != 0) {
            hoaDonList.add(hd);
            return true;
        }
        return false;
    }
    
    public boolean addNewHDWithCTHDList(HoaDonDTO hd, ArrayList<CTHoaDonDTO> cthdList, ArrayList<CTSanPhamDTO> ctsp, ArrayList<CTBaoHanhDTO> ctbh) {
        if (hdDAO.insert(hd) != 0) {
            hoaDonList.add(hd);
            ctspDAO.setTrangThaiTo0(ctsp);
            cthdDAO.insert(cthdList);
            ctbhDAO.insert(ctbh);
            return true;
        }
        return false;
    }
    
    public boolean delete(HoaDonDTO hd) {
        if (ctbhDAO.deleteByHDId(hd.getId()) != 0 && 
            cthdDAO.deleteByHDId(hd.getId()) != 0 && 
            ctspDAO.deleteByHDId(hd.getId()) != 0 && 
            hdDAO.delete(hd.getId()) != 0) {
                hoaDonList.remove(hd);
                return true;
        }
        return false;
    }
    
    public int getAutoIncrement() {
        return hdDAO.getAutoIncrement();
    }
    
    public ArrayList<HoaDonDTO> search(String text, String type) {
        ArrayList<HoaDonDTO> result = new ArrayList<>();
        text = text.toLowerCase();
        
        for (HoaDonDTO i : hoaDonList) {
            boolean matches = false;
            switch (type) {
                case "Tất cả":
                    matches = Integer.toString(i.getId()).toLowerCase().contains(text) ||
                              khBUS.getNameById(i.getIdKhachHang()).toLowerCase().contains(text) ||
                              nvBUS.getNameByID(i.getIdNhanVien()).toLowerCase().contains(text) ||
                              Formatter.FormatVND(i.getTongTien()).contains(text) ||
                              Formatter.FormatDateTime(i.getNgayXuat()).contains(text);
                    break;
                case "Mã":
                    matches = Integer.toString(i.getId()).toLowerCase().contains(text);
                    break;
                case "Khách hàng":
                    matches = khBUS.getNameById(i.getIdKhachHang()).toLowerCase().contains(text);
                    break;
                case "Nhân viên":
                    matches = nvBUS.getNameByID(i.getIdNhanVien()).toLowerCase().contains(text);
                    break;
                case "Khuyến mãi":
                    // Thêm kiểm tra cho khuyến mãi tại đây
                    break;
                case "Tổng tiền":
                    matches = Formatter.FormatVND(i.getTongTien()).contains(text);
                    break;
                case "Ngày xuất":
                    matches = Formatter.FormatDateTime(i.getNgayXuat()).contains(text);
                    break;
                default:
                    throw new AssertionError();
            }
            if (matches) {
                result.add(i);
            }
        }
        return result;
    }

    public ArrayList<HoaDonDTO> searchByTotalAmount(int start, int end) {
        ArrayList<HoaDonDTO> result = new ArrayList<>();
    
        for (HoaDonDTO hoaDon : hoaDonList) {
         //   System.out.print("hell");
            if (hoaDon.getTongTien() >= start && hoaDon.getTongTien() <= end) {
                result.add(hoaDon);
            }
        }
    
        return result;
    }
    
    
    

}
