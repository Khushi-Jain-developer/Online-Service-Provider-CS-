package Common;

public class Category_bean {

    private String Category_name;
    private String Category_id;
    private String Category_desc;
    private String Category_img;

    public Category_bean() {
    }

    public Category_bean(String Category_name, String Category_id, String Category_desc, String Category_img) {
        this.Category_name = Category_name;
        this.Category_id = Category_id;
        this.Category_desc = Category_desc;
        this.Category_img = Category_img;
    }

    public String getCategory_name() {
        return Category_name;
    }

    public void setCategory_name(String category_name) {
        Category_name = category_name;
    }

    public String getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(String category_id) {
        Category_id = category_id;
    }

    public String getCategory_desc() {
        return Category_desc;
    }

    public void setCategory_desc(String category_desc) {
        Category_desc = category_desc;
    }

    public String getCategory_img() {
        return Category_img;
    }

    public void setCategory_img(String category_img) {
        Category_img = category_img;
    }
}
