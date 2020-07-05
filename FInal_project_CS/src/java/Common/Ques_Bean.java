package Common;

public class Ques_Bean {

    private int question_Id;
    private String question;
    private String option_1;
    private String option_2;
    private String option_3;
    private String option_4;
    private Integer price_1;
    private Integer price_2;
    private Integer price_3;
    private Integer price_4;
    private Integer cat_id;
    private Integer service_id;
    private Integer sp_id;

    public Integer getQuestion_Id() {
        return question_Id;
    }

    public Integer getPrice_1() {
        return price_1;
    }

    public void setPrice_1(Integer price_1) {
        this.price_1 = price_1;
    }

    public Integer getPrice_2() {
        return price_2;
    }

    public void setPrice_2(Integer price_2) {
        this.price_2 = price_2;
    }

    public Integer getPrice_3() {
        return price_3;
    }

    public void setPrice_3(Integer price_3) {
        this.price_3 = price_3;
    }

    public Integer getPrice_4() {
        return price_4;
    }

    public void setPrice_4(Integer price_4) {
        this.price_4 = price_4;
    }

    public void setQuestion_Id(Integer question_Id) {
        this.question_Id = question_Id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption_1() {
        return option_1;
    }

    public void setOption_1(String option_1) {
        this.option_1 = option_1;
    }

    public String getOption_2() {
        return option_2;
    }

    public void setOption_2(String option_2) {
        this.option_2 = option_2;
    }

    public String getOption_3() {
        return option_3;
    }

    public void setOption_3(String option_3) {
        this.option_3 = option_3;
    }

    public String getOption_4() {
        return option_4;
    }

    public void setOption_4(String option_4) {
        this.option_4 = option_4;
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }

    public Integer getSp_id() {
        return sp_id;
    }

    public void setSp_id(Integer sp_id) {
        this.sp_id = sp_id;
    }
}
