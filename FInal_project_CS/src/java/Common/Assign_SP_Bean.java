package Common;

public class Assign_SP_Bean {

    int assign_id, book_id, cust_id, sp_id, status;
    String assign_date, service_date;

    public Assign_SP_Bean() {
    }

    public Assign_SP_Bean(int book_id, int cust_id, int sp_id, int status, String assign_date, String service_date) {
        this.book_id = book_id;
        this.cust_id = cust_id;
        this.sp_id = sp_id;
        this.status = status;
        this.assign_date = assign_date;
        this.service_date = service_date;

    }

    public Assign_SP_Bean(int assign_id, int book_id, int cust_id, int sp_id, int status, String assign_date, String service_date) {
        this.assign_id = assign_id;
        this.book_id = book_id;
        this.cust_id = cust_id;
        this.sp_id = sp_id;
        this.status = status;
        this.assign_date = assign_date;
        this.service_date = service_date;
    }

    public String getService_date() {
        return service_date;
    }

    public void setService_date(String service_date) {
        this.service_date = service_date;
    }

    public int getAssign_id() {
        return assign_id;
    }

    public void setAssign_id(int assign_id) {
        this.assign_id = assign_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAssign_date() {
        return assign_date;
    }

    public void setAssign_date(String assign_date) {
        this.assign_date = assign_date;
    }

}
