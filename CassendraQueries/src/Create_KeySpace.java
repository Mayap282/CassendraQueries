

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Create_KeySpace {

   public static void main(String args[]){

      
      Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
      
      System.out.println("Cluster Created.....");
      //Creating Session object
      Session session = cluster.connect("demo");
      System.out.println("Session Created.....");
      String q = "insert into emp(emp_id, emp_name,emp_salary) values (1002, 'DIR',50000);";
      session.execute(q);
      System.out.println("Insert Successful.....");
   }
}
