import java.util.List;

class person
{
String name;
String CNIC;
String phone_number;
String DOB;
String Email;
String Address;


}
class customer extends person
{
String customer_ID;
int loyalty_points;
char Gender;

boolean Login(String email, String password) {return true;}

boolean register(person new_person) {return true;}

void add_items_to_cart(product p[]) {}

void purchase_items(product p[]) {}

int use_loyalty_points(loyalty_card c) {return 1;}

void enter_item_details(product p){}

}

class registered_user extends customer
{

}

class anonymous_user extends customer
{
    boolean rifd_proof_wallet;

    void get_customized_offer(discount d){}
    void browse_site(product p[]){}
}

class new_user extends customer
{
    boolean rifd_proof_wallet;

    boolean show_card_to_saleagent(sale_agent s,loyalty_card c){return true;}
    void get_award_points(loyalty_card c){}
}

class employee extends person
{
String employee_ID;
int work_hours;
int overtime_hours;
int Salary;

}

class sale_agent extends employee
{
int staff_type;
String designation;
boolean status;

boolean mark_attendance(employee e){return true;}
}

class manager extends employee
{
int store_ID;
String location;
}

class store_admin extends employee
{
int store_ID;
String location;

    void ManageUser(customer c,outlet o){}
    void AssignRoles(customer c,outlet o){}
    boolean deactivate_user(registered_user u,outlet o){return true;}
    void relocate_user(customer c,outlet o){}
    boolean create_outlet(outlet o){return true;}
    boolean update_outlet(outlet o){return true;}
    boolean delete_outlet(outlet o){return true;}
    boolean block_outlet(outlet o){return true;}

}

class store_manager extends manager
{
String report_type;

    boolean create_discount_policy(discount d,outlet o){return true;}
    boolean update_discount_policy(discount d,outlet o){return true;}
    void run_performance_reports(outlet o, online_store m){}
    void view_best_selling(product p[],outlet o){}
    void view_user_performance_report(customer c[],outlet o){}
}

class inventory_manager extends manager
{
product store_inventory[];
product stock_at_outlet[];
int budget;

void manage_store_inventory(product p[],outlet o){}
void Allocate_inventory(product p[],outlet o){}
boolean change_policy(){return true;}
void reserve_stock(product p[],outlet o){}
}

class floor_manager extends manager
{
String report;
int workshift;
product item_returned;

    void behave_saleagent(sale_agent s,outlet o){}
    void track_attendance(employee e){}
    void saleagent_perf_report(sale_agent s){}
    boolean return_item(product p,outlet o){return true;}
    void manage_workshift(employee e,int w){}
    void view_manage_saleagent(sale_agent s, outlet o){}

}

class online_store
{
String url;
String phone_num;
String title;
String username;
String password;

void sellproduct(product p, customer c){}
void offer_Apperals(product p){}
void offer_discount(discount d, product p, customer c){}
void offer_loyalty_point(loyalty_card c, customer a){}
void issue_loyalty_card(loyalty_card c,customer a){}

}

class outlet
{
String city;
String branch_ID;
String phone_num;
boolean cardscanner;
boolean thumbprintscanner;

    void sellproduct(product p,  customer c){}
    void offer_Apperals(product p){}
    void offer_discount(discount d, product p, customer c){}
    void offer_loyalty_point(loyalty_card c, customer a){}
    void issue_loyalty_card(loyalty_card c,customer a){}
    void mark_attendance(employee e){}

}

class city
{
String name;
String district;

void viewCityname(){}
void view_outlets(outlet o){}
}


class product
{
String name;
String ID;
int price;
String barcode;

void view_detail(){}
void view_discount(discount d){}
}

class discount
{
int discount_val;

void show_offer(){}
String show_discount_last_date(){return null;}
}

class Staff_attendance
{
boolean status;

void mark_attendance(employee e){}
boolean checkin(employee e){return true;}
boolean checkout(employee e){return false;}
boolean request_leave(employee e){return true;}
}

class card
{
int pin;
String number;
int cvc;
String date_of_expiry;
String name;

}

class loyalty_card extends card
{
String card_type;
int loyalty_point;
discount disc;

void check_card_type(){}
void award_loyalty_point(int points){}

}

class credit_card extends card
{
int balance;
int tax;
discount disc;

int cash_withdraw(int amount){return 1;}
int cash_deposit(int amount){return 1;}
int apply_tax(int amount,int tax){return 1;}
}

class gold_card extends loyalty_card
{
    void award_loyalty_point(){}
}

class silver_card extends loyalty_card
{
    void award_loyalty_point(){}
}

class platinum_card extends loyalty_card
{
    void award_loyalty_point(){}
}


class SDAdelv5project
{
    public static void main(String args[])
    {
        System.out.println(" ********************************************************* ");
        System.out.println(" **      Welcome to S&J Boutique Management System      ** ");
        System.out.println(" ********************************************************* ");
        System.out.println(" To enter your credentials please follow the menu provided for user ease ");
        System.out.println(" Press N to enter your name: ");
        System.out.println(" Press P to enter your cell number:");
        System.out.println(" Press D to enter your date of birth: ");
        System.out.println(" Press E to enter your email: ");
        System.out.println(" Press A to enter your address: ");
        
    }  
}