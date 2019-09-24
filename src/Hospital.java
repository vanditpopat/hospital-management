
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Hospital {
    private String HUSER,HPASS;

    public Hospital() {
    }

    public Hospital(String HUSER, String HPASS) {
        this.HUSER = HUSER;
        this.HPASS = HPASS;
    }

    public String getHUSER() {
        return HUSER;
    }

    public void setHUSER(String HUSER) {
        this.HUSER = HUSER;
    }

    public String getHPASS() {
        return HPASS;
    }

    public void setHPASS(String HPASS) {
        this.HPASS = HPASS;
    }
       
}

