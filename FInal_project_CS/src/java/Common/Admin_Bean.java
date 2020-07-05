package Common;

public class Admin_Bean {

    private int admin_id;
    private String admin_nm;
    private String email;
    private String password;
    private int dob;
    private long phn_no;
    private String gender;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_nm() {
        return admin_nm;
    }

    public void setAdmin_nm(String admin_nm) {
        this.admin_nm = admin_nm;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public long getPhn_no() {
        return phn_no;
    }

    public void setPhn_no(long phn_no) {
        this.phn_no = phn_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
