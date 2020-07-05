package CRUD;

import Common.Ans_Bean;
import Common.Assign_SP_Bean;
import Common.Booking_service_bean;
import Common.Category_bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Common.DB_Connection;
import Common.Feedback_bean;
import Common.Payment_bean;
import Common.Query_bean;
import Common.Ques_Bean;
import Common.Service_Bean;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class insert_values {

    Category_bean obj_cat_Bean = new Category_bean();

    //let's create a function to insert values in category table
    public static void insert_values_of(String Category_name, String Category_id, String Category_desc, String Category_img) {
        Connection con = DB_Connection.get_connection();
        try {
            String query = "insert into category(cat_id,cat_nm,cat_desc,cat_image) values (?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1, Category_id);
            ps.setString(2, Category_name);
            ps.setString(3, Category_desc);
            ps.setString(4, Category_img);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
         // end of a function(insert values in category table) 

    // let's create a function to insert values in service table
    public static void insert_services(String ser_nm, String sub_serv, String price, String pincode, String date_tm, String category, int spid) {
        try {
            String query = "insert into service(ser_nm,sub_serv,price,pincode,date_tm,category, sp_id) values (?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setString(1, ser_nm);
            pst.setString(2, sub_serv);
            pst.setString(3, price);
            pst.setString(4, pincode);
            pst.setString(5, date_tm);
            pst.setString(6, category);
            pst.setInt(7, spid);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in service table) 

    // let's create a function to insert values in service-provider registration table
    public static void insert_SP_Reg_Details(String name, String email, String address, String pwd, String DOB, Double phn_no, String city, String country, String cat_id, String gender, String nationality) {
        try {
            String query = "insert into sp_reg(name,email,address,pwd,DOB,phn_no,city,country,cat_id,gender,nationality)values (?,?,?,?,?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, address);
            pst.setString(4, pwd);
            pst.setString(5, DOB);
            pst.setDouble(6, phn_no);
            pst.setString(7, city);
            pst.setString(8, country);
            pst.setString(9, cat_id);
            pst.setString(10, gender);
            pst.setString(11, nationality);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in sp-registration table) 

    // let's create a function to insert values in customer-registration table
    public static void insert_Cust_Reg_Details(String name, String email, String address, String pwd, String DOB, Long phn_no, String gender) {
        try {
            String query = "insert into customer_reg(name,email,address,pwd,DOB,phn_no,gender)values (?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, address);
            pst.setString(4, pwd);
            pst.setString(5, DOB);
            pst.setLong(6, phn_no);
            pst.setString(7, gender);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in customer-registration table) 

    // let's create a function to insert values in question(asked by different vendors related to provide their services) table
    public static void insert_Ques_SP_Details(String question, String option_1, Integer price_1, String option_2, Integer price_2, String option_3, Integer price_3, String option_4, Integer price_4, Integer cat_id, Integer service_id, Integer sp_id) {
        try {
            String query = "insert into question(question, option_1,price_1, option_2,price_2, option_3,price_3, option_4,price_4, cat_id, service_id, sp_id) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setString(1, question);
            pst.setString(2, option_1);
            pst.setInt(3, price_1);
            pst.setString(4, option_2);
            pst.setInt(5, price_2);
            pst.setString(6, option_3);
            pst.setInt(7, price_3);
            pst.setString(8, option_4);
            pst.setInt(9, price_4);
            pst.setInt(10, cat_id);
            pst.setInt(11, service_id);
            pst.setInt(12, sp_id);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in question table) 

    // let's create a function to insert values in answer(given by customer related to their required booking service) table
    public static void insert_Answer(Ans_Bean ab) {
        try {
            String query = "insert into answer(answer_option, service_id,q_id,cust_id, option_price) values (?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setString(1, ab.getAnswer_option());
            pst.setInt(2, ab.getService_id());
            pst.setInt(3, ab.getQ_id());
            pst.setInt(4, ab.getCust_id());
            pst.setInt(5, ab.getOption_price());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in answer table) 

    // let's create a function to insert values in booking-service(booked by customer) table
    public static void insert_booking_details(Booking_service_bean bsb) {
        try {
            String query = "insert into booking_service"
                    + "(cust_id,service_id,total_price,booking_date,service_date,service_place,service_time,contact_no) values "
                    + "(?,?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setInt(1, bsb.getCust_id());
            pst.setInt(2, bsb.getService_id());
            pst.setInt(3, bsb.getTotal_price());
            pst.setString(4, bsb.getBooking_date());
            pst.setString(5, bsb.getService_date());
            pst.setString(6, bsb.getService_place());
            pst.setString(7, bsb.getService_time());
            pst.setLong(8, bsb.getContact_no());
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in booking-service table) 

    // let's create a function to insert values in query(questions asked by a customer related to a website or any other issue ) table
    public static void Insert_Query(Query_bean qb) {
        Connection con = DB_Connection.get_connection();
        try {
            String query = "insert into Query_cust(cust_nm,email,message,date)values(?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setString(1, qb.getName());
            pst.setString(2, qb.getEmail());
            pst.setString(3, qb.getMsg());
            pst.setString(4, qb.getDate());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in query table) 

    // let's create a function to insert values in assign-service (to different service provider on the basis of services they provided) table
    public static void assignSP(Assign_SP_Bean assign) {
        try {
            String query = "insert into assign_sp(book_id, cust_id, sp_id, status,assign_date,service_date) values (?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setInt(1, assign.getBook_id());
            pst.setInt(2, assign.getCust_id());
            pst.setInt(3, assign.getSp_id());
            pst.setInt(4, assign.getStatus());
            pst.setString(5, assign.getAssign_date());
            pst.setString(6, assign.getService_date());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in assign-sp table) 

    // let's create a function to insert values in payment(paid by customer to recieve the service) table
    public static void insert_Pay_Details(Payment_bean pb) {
        try {
            String query = "insert into payment(pay_id,assign_id,cust_id,total_price,pay_date,sp_id,pay_mode,bank_name,card_no,cardholder_name,exp_date,cvv) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection co = DB_Connection.get_connection();
            PreparedStatement pst = co.prepareStatement(query);
            pst.setInt(1, pb.getPay_id());
            pst.setInt(2, pb.getAssign_id());
            pst.setInt(3, pb.getCust_id());
            pst.setInt(4, pb.getTotal_price());
            pst.setString(5, pb.getPay_date());
            pst.setInt(6, pb.getSp_id());
            pst.setString(7, pb.getPay_mode());
            pst.setString(8, pb.getBank_name());
            pst.setLong(9, pb.getCard_no());
            pst.setString(10, pb.getCardholder_name());
            pst.setString(11, pb.getExp_date());
            pst.setInt(12, pb.getCvv());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }// end of a function(insert values in payment table) 

    // let's create a function to insert values in feedback(a form about the experience of recieving services) table
    public static void insert_feedback(Feedback_bean fb) {
        Connection con = DB_Connection.get_connection();
        try {
            String query = "insert into feedback(cust_id,service_id,feedback,date) values (?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
            ps.setInt(1, fb.getCustomer_id());
            ps.setInt(2, fb.getService_id());
            ps.setString(3, fb.getFeedback());
            ps.setString(4, fb.getDate());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// end of a function(insert values in feedback table) 
