package arraysdemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Student {
//    comment made here while testing git. lol
    private String sId;
    private String sName;
    private String address;
    //comment again
    //comment added on remote to showcase fetch
    //added another comment to make remote get ahead twice
    //added yet another comment to test pull. Auto merge with local

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Student(String sId, String sName){
        this.sId = sId;
        this.sName = sName;
    }
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
}
