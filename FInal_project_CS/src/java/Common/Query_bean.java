package Common;

public class Query_bean {

    private int q_id, cust_id;
    private String email, msg, date, name;

    public Query_bean() {
    }

    public Query_bean(int cust_id, String email, String msg, String date, String name) {
        this.cust_id = cust_id;
        this.email = email;
        this.msg = msg;
        this.date = date;
        this.name = name;
    }

    public Query_bean(int q_id, int cust_id, String email, String msg, String date, String name) {
        this.q_id = q_id;
        this.cust_id = cust_id;
        this.email = email;
        this.msg = msg;
        this.date = date;
        this.name = name;
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
