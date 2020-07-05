package Common;

public class Payment_bean {

    int pay_id;
    int assign_id;
    int cust_id;
    int total_price;
    String pay_date;
    int sp_id;
    String pay_mode;
    String bank_name;
    Long card_no;
    String cardholder_name;
    String exp_date;
    int cvv;

    public Payment_bean() {
    }

    public Payment_bean(int assign_id, int cust_id, int total_price, String pay_date, int sp_id, String pay_mode, String bank_name, Long card_no, String cardholder_name, String exp_date, int cvv) {
        this.assign_id = assign_id;
        this.cust_id = cust_id;
        this.total_price = total_price;
        this.pay_date = pay_date;
        this.sp_id = sp_id;
        this.pay_mode = pay_mode;
        this.bank_name = bank_name;
        this.card_no = card_no;
        this.cardholder_name = cardholder_name;
        this.exp_date = exp_date;
        this.cvv = cvv;
    }

    public Payment_bean(int pay_id, int assign_id, int cust_id, int total_price, String pay_date, int sp_id, String pay_mode, String bank_name, Long card_no, String cardholder_name, String exp_date, int cvv) {
        this.pay_id = pay_id;
        this.assign_id = assign_id;
        this.cust_id = cust_id;
        this.total_price = total_price;
        this.pay_date = pay_date;
        this.sp_id = sp_id;
        this.pay_mode = pay_mode;
        this.bank_name = bank_name;
        this.card_no = card_no;
        this.cardholder_name = cardholder_name;
        this.exp_date = exp_date;
        this.cvv = cvv;
    }

    public int getPay_id() {
        return pay_id;
    }

    public void setPay_id(int pay_id) {
        this.pay_id = pay_id;
    }

    public int getAssign_id() {
        return assign_id;
    }

    public void setAssign_id(int assign_id) {
        this.assign_id = assign_id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public String getPay_mode() {
        return pay_mode;
    }

    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public Long getCard_no() {
        return card_no;
    }

    public void setCard_no(Long card_no) {
        this.card_no = card_no;
    }

    public String getCardholder_name() {
        return cardholder_name;
    }

    public void setCardholder_name(String cardholder_name) {
        this.cardholder_name = cardholder_name;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

}
