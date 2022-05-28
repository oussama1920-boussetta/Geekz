
package geekz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import geekz.Promotion;

public class reservationMain {

  static String url = "jdbc:mysql://localhost:3306/reservation";
  static String username = "root";
  static  String password = "";
 static Connection con ;
    public static void main(String[] args)  {
        
        try{
            
con=DriverManager.getConnection(url, username, password);
            System.out.println("connect toBD");
   
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
      Promotion Promotion = null;
        
      
        
        reservation R1=new reservation("05/02/2022", 3, 100,Promotion);
         reservation R2=new reservation( "11/12/2022", 2, 100, Promotion);
 /* try {
     
    String req = "INSERT INTO `reservation`(`DateReservation`, `nombredeParticipant`, `prix`,`prmotion`) " + " VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(req);
            ps.setString(1, R2.getDateReservation());
            ps.setInt(2, R2.getNombredeParticipant());
            ps.setInt(3, R2.getPrix());
          
            ps.executeUpdate();
            System.out.println("Reservation ajoutée avec succes");

  }
    catch (SQLException ex) {
}*/
 
        System.out.println(reservation.resTotalPrix(R2));
       
    } 


   
}
