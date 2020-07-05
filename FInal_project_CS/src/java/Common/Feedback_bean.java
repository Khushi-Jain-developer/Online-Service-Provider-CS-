package Common;

public class Feedback_bean {

    int f_id;
    String feedback;
    int service_id;
    int customer_id;
    String date;

    public Feedback_bean(String feedback, int service_id, int customer_id, String date) {
        this.feedback = feedback;
        this.service_id = service_id;
        this.customer_id = customer_id;
        this.date = date;
    }

    public Feedback_bean(int f_id, String feedback, int service_id, int customer_id, String date) {
        this.f_id = f_id;
        this.feedback = feedback;
        this.service_id = service_id;
        this.customer_id = customer_id;
        this.date = date;
    }

    public Feedback_bean() {
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

}
