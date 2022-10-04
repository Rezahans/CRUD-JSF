
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
public class ControlBean {
    
    private List<MahasiswaBean> mahasiswaList;
    private MahasiswaBean mahasiswa;

    public List<MahasiswaBean> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<MahasiswaBean> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public MahasiswaBean getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(MahasiswaBean mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    @PostConstruct
    
    public void init(){
        mahasiswaList= new ArrayList<MahasiswaBean>();
        mahasiswa = new MahasiswaBean("","");
    }
    public void insert(){
        mahasiswaList.add(mahasiswa);
        mahasiswa =new MahasiswaBean("", "");
        
    }
    public void upadet(){
        mahasiswa = new MahasiswaBean("", "");
    }
    
    public void delete (){
        mahasiswaList.remove(mahasiswa);
        mahasiswa=new MahasiswaBean("","");
    }
    public ControlBean(){
}
    
}
