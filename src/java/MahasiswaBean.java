
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF
 */
@ManagedBean
@SessionScoped
public class MahasiswaBean {
    public String scode, nama;

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
        public MahasiswaBean(String scode, String nama){
            this.scode = scode;
            this.nama = nama;
        }
            
}
