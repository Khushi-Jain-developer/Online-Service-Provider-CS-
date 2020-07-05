package CRUD;

import Common.Admin_Bean;
import Common.Assign_SP_Bean;
import Common.Booking_service_bean;
import Common.Category_bean;
import Common.Customer_bean;
import Common.DB_Connection;
import Common.Feedback_bean;
import Common.Payment_bean;
import Common.Query_bean;
import Common.Ques_Bean;
import Common.SP_bean;
import Common.Service_Bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Read_values {

    // let's create a function to read values of all given fields from category table
    public static List<Category_bean> fetchAllCategory() {
        List<Category_bean> al = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from category");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category_bean ub = new Category_bean();
                ub.setCategory_id(rs.getString(1));
                ub.setCategory_name(rs.getString(2));
                ub.setCategory_desc(rs.getString(3));
                ub.setCategory_img(rs.getString(4));
                al.add(ub);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
// let's create a function to read values of all given fields from payment table

    public static List<Payment_bean> fetchAllPayment() {
        List<Payment_bean> al = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from payment");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Payment_bean ub = new Payment_bean();

                ub.setAssign_id(rs.getInt(1));
                ub.setCust_id(rs.getInt(2));
                ub.setTotal_price(rs.getInt(3));
                ub.setPay_date(rs.getString(4));
                ub.setSp_id(rs.getInt(5));
                ub.setPay_mode(rs.getString(6));
                ub.setBank_name(rs.getString(7));
                ub.setCard_no(rs.getLong(8));
                ub.setCardholder_name(rs.getString(9));
                ub.setExp_date(rs.getString(10));
                ub.setCvv(rs.getInt(11));
                ub.setPay_id(rs.getInt(12));
                al.add(ub);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
// let's create a function to read values of all given fields from feedback table

    public static List<Feedback_bean> fetchAllFeedback_Customer() {
        List<Feedback_bean> al = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from feedback");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Feedback_bean ub = new Feedback_bean();
                ub.setF_id(rs.getInt(1));
                ub.setCustomer_id(rs.getInt(2));
                ub.setService_id(rs.getInt(3));
                ub.setFeedback(rs.getString(4));
                ub.setDate(rs.getString(5));

                al.add(ub);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function

    // let's create a function to read values of all given fields from category table on bais of category-ID(taken in string format)
    public static Category_bean fetchAllCategoryByCategoryId(String catId) {
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        Category_bean ub = new Category_bean();
        try {
            PreparedStatement ps = con.prepareStatement("select * from category where cat_id=?");
            ps.setString(1, catId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ub.setCategory_id(rs.getString(1));
                ub.setCategory_name(rs.getString(2));
                ub.setCategory_desc(rs.getString(3));
                ub.setCategory_img(rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ub;
    }//end of a function

    // let's create a function to read values of all given fields from category table on bais of category-ID(taken in integer format) 
    public static Category_bean ReadAllCategoryByCategoryId(int catId) {
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        Category_bean ub = new Category_bean();
        try {
            PreparedStatement ps = con.prepareStatement("select * from category where cat_id=?");
            ps.setInt(1, catId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ub.setCategory_id(rs.getString(1));
                ub.setCategory_name(rs.getString(2));
                ub.setCategory_desc(rs.getString(3));
                ub.setCategory_img(rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ub;
    }//end of a function
// let's create a function to read values of all given fields from question table on bais of SP-ID

    public static List<Ques_Bean> fetchAllQuestions(int sp_id) {
        DB_Connection db = new DB_Connection();
        List<Ques_Bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from question where sp_id=?");
            ps.setInt(1, sp_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ques_Bean qb = new Ques_Bean();
                qb.setQuestion_Id(rs.getInt("q_id"));
                qb.setQuestion(rs.getString("question"));
                qb.setOption_1(rs.getString("option_1"));
                qb.setOption_2(rs.getString("option_2"));
                qb.setOption_3(rs.getString("option_3"));
                qb.setOption_4(rs.getString("option_4"));
                qb.setPrice_1(rs.getInt("price_1"));
                qb.setPrice_2(rs.getInt("price_2"));
                qb.setPrice_3(rs.getInt("price_3"));
                qb.setPrice_4(rs.getInt("price_4"));
                qb.setCat_id(rs.getInt("cat_id"));
                qb.setService_id(rs.getInt("service_id"));
                qb.setSp_id(rs.getInt("sp_id"));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
    // let's create a function to read values of all given fields from question table on bais of service-ID

    public static List<Ques_Bean> fetchAllQuestion(int service_id) {
        DB_Connection db = new DB_Connection();
        List<Ques_Bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from question where service_id=?");
            ps.setInt(1, service_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ques_Bean qb = new Ques_Bean();
                qb.setQuestion_Id(rs.getInt("q_id"));
                qb.setQuestion(rs.getString("question"));
                qb.setOption_1(rs.getString("option_1"));
                qb.setOption_2(rs.getString("option_2"));
                qb.setOption_3(rs.getString("option_3"));
                qb.setOption_4(rs.getString("option_4"));
                qb.setPrice_1(rs.getInt("price_1"));
                qb.setPrice_2(rs.getInt("price_2"));
                qb.setPrice_3(rs.getInt("price_3"));
                qb.setPrice_4(rs.getInt("price_4"));
                qb.setCat_id(rs.getInt("cat_id"));
                qb.setService_id(rs.getInt("service_id"));
                qb.setSp_id(rs.getInt("sp_id"));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
// let's create a function to read values of all given fields from question table 

    public static List<Ques_Bean> fetchAllQuestions() {
        DB_Connection db = new DB_Connection();
        List<Ques_Bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from question");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ques_Bean qb = new Ques_Bean();
                qb.setQuestion_Id(rs.getInt("q_id"));
                qb.setQuestion(rs.getString("question"));
                qb.setOption_1(rs.getString("option_1"));
                qb.setOption_2(rs.getString("option_2"));
                qb.setOption_3(rs.getString("option_3"));
                qb.setOption_4(rs.getString("option_4"));
                qb.setPrice_1(rs.getInt("price_1"));
                qb.setPrice_2(rs.getInt("price_2"));
                qb.setPrice_3(rs.getInt("price_3"));
                qb.setPrice_4(rs.getInt("price_4"));
                qb.setCat_id(rs.getInt("cat_id"));
                qb.setService_id(rs.getInt("service_id"));
                qb.setSp_id(rs.getInt("sp_id"));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
// let's create a function to read values of all given fields from category table for SP-REG(to choose category)

    public static List<Category_bean> fetchAllCategory_sp_reg() {
        DB_Connection db = new DB_Connection();
        List<Category_bean> a2 = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from category");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String desc = rs.getString(3);
                String image = rs.getString(4);
                Category_bean ub = new Category_bean(id, name, desc, image);
                a2.add(ub);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return a2;
    }//end of a function
// let's create a function to read values of all given fields from SP-registration table on bais of category-ID

    public static List<SP_bean> fetchAllSP_ByCat_Id(int cat_id) {
        DB_Connection db = new DB_Connection();
        List<SP_bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from sp_reg where cat_id=?");
            ps.setInt(1, cat_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SP_bean qb = new SP_bean();
                qb.setAddress(rs.getString("address"));
                qb.setCity(rs.getString("city"));
                qb.setCountry(rs.getString("country"));
                qb.setDob(rs.getString("dob"));
                qb.setE_mail(rs.getString("email"));
                qb.setGender(rs.getString("gender"));
                qb.setName(rs.getString("name"));
                qb.setNationality(rs.getString("nationality"));
                qb.setPassword(rs.getString("pwd"));
                qb.setPhn_no(rs.getString("phn_no"));
                qb.setSp_id(rs.getInt(("sp_id")));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }//end of a function
// let's create a function to read values of all given fields from category table on bais of category-ID for admin -panel

    public Category_bean get_value_of_adminCategory(String cat_id) {
        Category_bean obj_cat_Bean = new Category_bean();
        try {
            String qry = "select * from category where cat_id=?";
            Connection con1 = DB_Connection.get_connection();
            PreparedStatement ps = con1.prepareStatement(qry);
            ps.setString(1, cat_id);
            ResultSet rs2 = ps.executeQuery();
            rs2 = ps.executeQuery();
            while (rs2.next()) {
                obj_cat_Bean.setCategory_desc(rs2.getString("cat_desc"));
                obj_cat_Bean.setCategory_id(rs2.getString("cat_id"));
                obj_cat_Bean.setCategory_img(rs2.getString("cat_image"));
                obj_cat_Bean.setCategory_name(rs2.getString("cat_nm"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return obj_cat_Bean;
    }//end of a function
// let's create a function to read values of all given fields from Admin-registration table on bais of Email and password

    public static Admin_Bean get_value_of_adminLogin(String email, String pwd) {
        Admin_Bean ad = new Admin_Bean();
        try {
            String qry = "select * from admin_reg where email=?and pwd=?";
            Connection con1 = DB_Connection.get_connection();

            PreparedStatement ps = con1.prepareStatement(qry);
            ps.setString(1, email);
            ps.setString(2, pwd);
            ResultSet rs3 = ps.executeQuery();

            while (rs3.next()) {
                ad.setEmail(rs3.getString("email"));
                ad.setPassword(rs3.getString("pwd"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }//end of a function
// let's create a function to read values of all given fields from SP-registration table on bais of Email and Password

    public static SP_bean get_value_of_spLogin(String email, String pwd) {
        SP_bean ad = new SP_bean();
        try {
            String qry = "select * from sp_reg where email=? and pwd=?";
            Connection con1 = DB_Connection.get_connection();

            PreparedStatement ps = con1.prepareStatement(qry);
            ps.setString(1, email);
            ps.setString(2, pwd);
            ResultSet rs3 = ps.executeQuery();

            while (rs3.next()) {
                ad.setSp_id(rs3.getInt("sp_id"));
                ad.setName(rs3.getString("name"));
                ad.setE_mail(rs3.getString("email"));
                ad.setPassword(rs3.getString("address"));
                //set other fields of Sp_login_bean
                ad.setCity(rs3.getString("pwd"));
                ad.setDob(rs3.getString("dob"));
                ad.setCity(rs3.getString("city"));
                ad.setCountry(rs3.getString("country"));
                ad.setGender(rs3.getString("gender"));
                ad.setNationality(rs3.getString("nationality"));
                ad.setSp_id(rs3.getInt("sp_id"));
                ad.setPhn_no(rs3.getString("phn_no"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }//end of a function
// let's create a function to read values of all given fields from customer-login table on bais of Email and Password

    public static Customer_bean get_value_of_custLogin(String name, String pwd) {
        Customer_bean ad = new Customer_bean();
        try {
            String qry = "select * from customer_reg where email=? and pwd=?";
            Connection con1 = DB_Connection.get_connection();

            PreparedStatement ps = con1.prepareStatement(qry);
            ps.setString(1, name);
            ps.setString(2, pwd);
            ResultSet rs3 = ps.executeQuery();

            while (rs3.next()) {
                ad.setCust_id(rs3.getInt("cust_id"));
                ad.setName(rs3.getString("name"));
                ad.setEmail(rs3.getString("email"));
                ad.setPassword(rs3.getString("pwd"));
                //set other fields of Sp_login_bean
                ad.setGender(rs3.getString("gender"));
                ad.setAddress(rs3.getString("address"));
                ad.setContact(rs3.getLong("phn_no"));
                ad.setDob(rs3.getString("dob"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }//end of a function
// let's create a function to read values of all given fields from customer-registration table on bais of customer-ID

    public static Customer_bean get_value_of_cust(int cust_id) {
        Customer_bean ad = new Customer_bean();
        try {
            String qry = "select * from customer_reg where cust_id = ?";
            Connection con1 = DB_Connection.get_connection();

            PreparedStatement ps = con1.prepareStatement(qry);
            ps.setInt(1, cust_id);
            ResultSet rs3 = ps.executeQuery();

            while (rs3.next()) {

                ad.setName(rs3.getString("name"));
                ad.setEmail(rs3.getString("email"));
                ad.setPassword(rs3.getString("pwd"));
                ad.setGender(rs3.getString("gender"));
                ad.setAddress(rs3.getString("address"));
                ad.setContact(rs3.getLong("phn_no"));
                ad.setDob(rs3.getString("dob"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }//end of a function
// let's create a function to read values of all given fields from service-provider registration table

    public static List<SP_bean> get_value_of_SP_Reg_Details() {
        List<SP_bean> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from sp_reg");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                SP_bean sb1 = new SP_bean();
                sb1.setE_mail(rs.getString("email"));
                sb1.setPassword(rs.getString("pwd"));
                sb1.setName(rs.getString("name"));
                sb1.setPhn_no(rs.getString("phn_no"));
                sb1.setAddress(rs.getString("address"));
                sb1.setCity(rs.getString("city"));
                sb1.setCountry(rs.getString("country"));
                sb1.setCat_id(rs.getInt("cat_id"));
                sb1.setGender(rs.getString("gender"));
                sb1.setDob(rs.getString("DOB"));
                sb1.setNationality(rs.getString("nationality"));
                sl.add(sb1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }//end of a function
// let's create a function to read values of all given fields from service table

    public static List<Service_Bean> get_value_of_SP_Services() {
        List<Service_Bean> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Service");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Service_Bean sb = new Service_Bean();
                sb.setService_id(rs.getString("service_id"));
                sb.setService_name(rs.getString("ser_nm"));
                sb.setSub_service_name(rs.getString("sub_serv"));
                sb.setPrice(rs.getString("price"));
                sb.setPincode(rs.getString("pincode"));
                sb.setDate_time(rs.getString("date_tm"));
                sb.setCategory(rs.getString("category"));
                sb.setSp_id(rs.getInt("sp_id"));

                sl.add(sb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }//end of a function
// let's create a function to read values of service name only(different one) from service table(no duplicacy only 3 limit) 

    public static List<Service_Bean> get_name_of_all_services() {
        List<Service_Bean> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select distinct ser_nm from Service");
            ResultSet rs = ps.executeQuery();
            int x = 1;
            while (rs.next()) {
                Service_Bean sb = new Service_Bean();
                sb.setService_name(rs.getString("ser_nm"));
                sl.add(sb);
                x++;
                if (x == 4) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }//end of a function
// let's create a function to read values of all given fields from service table on the basis of service name 

    public static List<String> get_name_of_all_services_by_ser_name(String ser_name) {
        List<String> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Service where ser_nm = ?");
            ps.setString(1, ser_name);
            ResultSet rs = ps.executeQuery();
            int x = 1;
            while (rs.next()) {
                sl.add(rs.getString(3));
                x++;
                if (x == 4) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }//end of a function
// let's create a function to read values of all given fields from service table on bais of service-ID

    public static Service_Bean get_value_of_Services_by_serviceId(int service_id) {
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        Service_Bean sb = new Service_Bean();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Service where service_id=?");
            ps.setInt(1, service_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sb.setService_name(rs.getString("ser_nm"));
                sb.setSub_service_name(rs.getString("sub_serv"));
                sb.setPrice(rs.getString("price"));
                //sb.setDate_time_requested(rs.getString("date"));
                sb.setPincode(rs.getString("pincode"));
                sb.setDate_time(rs.getString("date_tm"));
                // sb.setStatus(rs.getString("status"));
                sb.setCategory(rs.getString("category"));
                sb.setSp_id(rs.getInt("sp_id"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sb;
    }        //end of a function

// let's create a function to read values of all given fields from service table on bais of service provider-ID
    public static List<Service_Bean> get_value_of_SP_Services_by_SP_id(int spId) {
        List<Service_Bean> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Service where sp_id=?");
            ps.setInt(1, spId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Service_Bean sb = new Service_Bean();
                sb.setService_id(rs.getString("service_id"));
                sb.setService_name(rs.getString("ser_nm"));
                sb.setSub_service_name(rs.getString("sub_serv"));
                sb.setPrice(rs.getString("price"));
                sb.setPincode(rs.getString("pincode"));
                sb.setDate_time(rs.getString("date_tm"));
                sb.setCategory(rs.getString("category"));

                sl.add(sb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }// end of a function(retrieve values from service table) 
// let's create a function to read values of all given fields from service table on bais of category

    public static List<Service_Bean> get_value_of_SP_Services(int cat_id) {
        List<Service_Bean> sl = new ArrayList<>();
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Service where category=?");
            ps.setInt(1, cat_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Service_Bean sb = new Service_Bean();
                sb.setService_id(rs.getString("service_id"));
                sb.setService_name(rs.getString("ser_nm"));
                sb.setSub_service_name(rs.getString("sub_serv"));
                sb.setPrice(rs.getString("price"));
                sb.setPincode(rs.getString("pincode"));
                sb.setDate_time(rs.getString("date_tm"));
                sb.setCategory(rs.getString("category"));
                sl.add(sb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }// end of a function(retrieve values from service table) 
// let's create a function to read values of all given fields from question table on bais of Question-ID

    public static Ques_Bean get_ques_by_id(int ques_id) {
        Ques_Bean qb = new Ques_Bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from question where q_id=?");
            ps.setInt(1, ques_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                qb.setCat_id(rs.getInt("cat_id"));
                qb.setOption_1(rs.getString("option_1"));
                qb.setOption_2(rs.getString("option_2"));
                qb.setOption_3(rs.getString("option_3"));
                qb.setOption_4(rs.getString("option_4"));
                qb.setPrice_1(rs.getInt("price_1"));
                qb.setPrice_2(rs.getInt("price_2"));
                qb.setPrice_3(rs.getInt("price_3"));
                qb.setPrice_4(rs.getInt("price_4"));
                qb.setQuestion(rs.getString("question"));
                qb.setQuestion_Id(ques_id);
                qb.setService_id(rs.getInt("service_id"));
                qb.setSp_id(rs.getInt("sp_id"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return qb;
    }// end of a function(retrieve values from question table) 
// let's create a function to read values of all given fields from booking-Service table

    public static List<Booking_service_bean> get_value_of_Booking_services() {
        List<Booking_service_bean> sl = new ArrayList<>();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from booking_service");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Booking_service_bean sb = new Booking_service_bean();
                sb.setBooking_id(rs.getInt("booking_id"));
                sb.setCust_id(rs.getInt("cust_id"));
                sb.setService_id(rs.getInt("service_id"));
                sb.setTotal_price(rs.getInt("total_price"));
                sb.setBooking_date(rs.getString("booking_date"));
                sb.setService_date(rs.getString("service_date"));
                sb.setService_place(rs.getString("service_place"));
                sb.setService_time(rs.getString("service_time"));
                sb.setContact_no(rs.getLong("contact_no"));
                sl.add(sb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sl;
    }// end of a function(retrieve values from booking-service table) 
// let's create a function to read values of all given fields from assign-SP table on bais of SP-ID

    public static List<Assign_SP_Bean> get_AllAssignSP_BySpId(int sp_id) {
        List<Assign_SP_Bean> al = new ArrayList<>();
        Assign_SP_Bean qb = new Assign_SP_Bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from assign_sp where sp_id=?");
            ps.setInt(1, sp_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                qb.setAssign_id(rs.getInt("assign_id"));
                qb.setBook_id(rs.getInt("book_id"));
                qb.setCust_id(rs.getInt("cust_id"));
                qb.setSp_id(rs.getInt("sp_id"));
                qb.setStatus(rs.getInt("status"));
                qb.setAssign_date(rs.getString("assign_date"));
                qb.setService_date(rs.getString("service_date"));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }// end of a function(retrieve values from assign-sp table) 
// let's create a function to read values of all given fields from assign-SP table on bais of customer-ID

    public static List<Assign_SP_Bean> fetchAllCustBookings_ByCustomerId(int cust_id) {
        DB_Connection db = new DB_Connection();
        List<Assign_SP_Bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from  assign_sp where cust_id=?");
            ps.setInt(1, cust_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Assign_SP_Bean ab = new Assign_SP_Bean();
                ab.setAssign_id(rs.getInt("assign_id"));
                ab.setBook_id(rs.getInt("book_id"));
                ab.setCust_id(rs.getInt("cust_id"));
                ab.setSp_id(rs.getInt("sp_id"));
                ab.setStatus(rs.getInt("status"));
                ab.setAssign_date(rs.getString("assign_date"));
                ab.setService_date(rs.getString("service_date"));
                al.add(ab);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }// end of a function(retrieve values from assign-sp table) 
// let's create a function to read values of all given fields from assign-SP table on bais of assign-ID

    public static Assign_SP_Bean get_AllPaymentDetails_ByAssignId(int assign_id) {

        Assign_SP_Bean qb = new Assign_SP_Bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from assign_sp where assign_id=?");
            ps.setInt(1, assign_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                qb.setAssign_id(rs.getInt("assign_id"));
                qb.setBook_id(rs.getInt("book_id"));
                qb.setCust_id(rs.getInt("cust_id"));
                qb.setSp_id(rs.getInt("sp_id"));
                qb.setStatus(rs.getInt("status"));
                qb.setAssign_date(rs.getString("assign_date"));
                qb.setService_date(rs.getString("service_date"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return qb;
    }// end of a function(retrieve values from assign-SP table) 
// let's create a function to read values of all given fields from assign-SP table on bais of booking-ID

    public static Assign_SP_Bean checkBookingAssignedOrNot(int book_id) {
        Assign_SP_Bean as = new Assign_SP_Bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from assign_sp where book_id=?");
            ps.setInt(1, book_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                as.setSp_id(rs.getInt("sp_id"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return as;
    }// end of a function(retrieve values from assign-sp table) 
// let's create a function to read values of all given fields from booking-Service table on bais of booking-ID

    public static Booking_service_bean get_totalPrice_ByBookId(int booking_id) {

        Booking_service_bean bb = new Booking_service_bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from booking_service where booking_id=?");
            ps.setInt(1, booking_id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                bb.setBooking_id(rs.getInt("booking_id"));
                bb.setCust_id(rs.getInt("cust_id"));
                bb.setService_id(rs.getInt("service_id"));
                bb.setTotal_price(rs.getInt("total_price"));
                bb.setBooking_date(rs.getString("booking_date"));
                bb.setService_date(rs.getString("service_date"));
                bb.setService_place(rs.getString("service_place"));
                bb.setService_time(rs.getString("service_time"));
                bb.setContact_no(rs.getLong("contact_no"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bb;
    }// end of a function(retrieve values from booking-service table) 
// let's create a function to read values of all given fields from booking-service table on basis of booking-id

    public static Booking_service_bean get_totalPrice_ByBooking_ServiceDate(String service_date) {

        Booking_service_bean bb = new Booking_service_bean();
        Connection con = DB_Connection.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from booking_service where booking_id=?");
            ps.setString(1, service_date);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                bb.setBooking_id(rs.getInt("booking_id"));
                bb.setCust_id(rs.getInt("cust_id"));
                bb.setService_id(rs.getInt("service_id"));
                bb.setTotal_price(rs.getInt("total_price"));
                bb.setBooking_date(rs.getString("booking_date"));
                bb.setService_date(rs.getString("service_date"));
                bb.setService_place(rs.getString("service_place"));
                bb.setService_time(rs.getString("service_time"));
                bb.setContact_no(rs.getLong("contact_no"));
                bb.setPincode(rs.getInt("pincode"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bb;
    }// end of a function(retrieve values from booking-service table) 
// let's create a function to read values of all given fields from feedback table

    public static List<Feedback_bean> getValueOfFeedback() {
        DB_Connection db = new DB_Connection();
        List<Feedback_bean> al = new ArrayList<>();
        Connection con = db.get_connection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from  feedback");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Feedback_bean fb = new Feedback_bean();
                fb.setF_id(rs.getInt("f_id"));
                fb.setCustomer_id(rs.getInt("cust_id"));
                fb.setService_id(rs.getInt("service_id"));
                fb.setFeedback(rs.getString("feedback"));
                fb.setDate(rs.getString("date"));
                al.add(fb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }// end of a function(retrieve values from feedback table) 
// let's create a function to read values of all given fields from sp-reg table on bais of SP-ID

    public static SP_bean getValue_SP_BySP_Id(int sp_id) {
        DB_Connection db = new DB_Connection();
        Connection con = db.get_connection();
        SP_bean spp = new SP_bean();
        try {
            PreparedStatement ps = con.prepareStatement("select * from sp_reg where sp_id = ?");
            ps.setInt(1, sp_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                spp.setName(rs.getString("name"));
                spp.setE_mail(rs.getString("email"));
                spp.setAddress(rs.getString("address"));
                spp.setPassword(rs.getString("pwd"));
                spp.setDob(rs.getString("dob"));
                spp.setCity(rs.getString("city"));
                spp.setCountry(rs.getString("country"));
                spp.setCat_id(rs.getInt("cat_id"));
                spp.setGender(rs.getString("gender"));
                spp.setNationality(rs.getString("nationality"));
                spp.setSp_id(rs.getInt("sp_id"));
                spp.setPhn_no(rs.getString("phn_no"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return spp;
    }// end of a function(retrieve values from sp-reg table) 

// let's create a function to read values of all given fields from customer-reg table
    public static List<Customer_bean> getValueOfCustomer() {
        DB_Connection db = new DB_Connection();
        List<Customer_bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from  customer_reg");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer_bean cb = new Customer_bean();
                cb.setCust_id(rs.getInt("cust_id"));
                cb.setName(rs.getString("name"));
                cb.setEmail(rs.getString("email"));
                cb.setAddress(rs.getString("address"));
                cb.setPassword(rs.getString("pwd"));
                cb.setDob(rs.getString("dob"));
                cb.setContact(rs.getLong("phn_no"));
                cb.setGender(rs.getString("gender"));
                al.add(cb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }// end of a function(retrieve values from customer-reg table) 
// let's create a function to read values of all given fields from admin-reg table

    public static List<Admin_Bean> getValueOfAdmin() {
        DB_Connection db = new DB_Connection();
        List<Admin_Bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from  admin_reg");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Admin_Bean fb = new Admin_Bean();
                fb.setAdmin_id(rs.getInt("admin_id"));
                fb.setAdmin_nm(rs.getString("name"));
                fb.setEmail(rs.getString("email"));
                fb.setPassword(rs.getString("pwd"));
                fb.setDob(rs.getInt("dob"));
                fb.setPhn_no(rs.getLong("phn_no"));
                fb.setGender(rs.getString("gender"));
                al.add(fb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }// end of a function(retrieve values from admin-registration table) 
// let's create a function to read values of all given fields from query-customer table

    public static List<Query_bean> getValueOfQuery() {
        DB_Connection db = new DB_Connection();
        List<Query_bean> al = new ArrayList<>();
        Connection con = db.get_connection();

        try {
            PreparedStatement ps = con.prepareStatement("select * from query_cust");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Query_bean qb = new Query_bean();
                qb.setQ_id(rs.getInt("q_id"));
                qb.setName(rs.getString("cust_nm"));
                qb.setEmail(rs.getString("email"));
                qb.setDate(rs.getString("date"));
                qb.setMsg(rs.getString("message"));
                al.add(qb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
    }
}
// end of a function(retrieve values from query-customer table) 
