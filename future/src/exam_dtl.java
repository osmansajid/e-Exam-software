
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAZ
 */
public class exam_dtl {
    String exm_nme;
    String info;
    String instructor;
    ArrayList<ques> op;

    public exam_dtl(String exm_nme, String info,String instructor) {
       this.exm_nme = exm_nme;
       this.info = info;
       this.instructor=instructor;
       op=new ArrayList<>();
    }
    
}
