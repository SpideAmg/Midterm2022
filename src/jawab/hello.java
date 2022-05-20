package jawab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class hello {



        public static void main(String[] args) throws Exception {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "amg123");

            Statement stmt=con.createStatement();

        /*ALTER TABLE `student`.`student`
        ADD COLUMN `StudentName` VARCHAR(45) NULL AFTER `StudentID`,
        CHANGE COLUMN `Student` `StudentID` INT NOT NULL ; */


            //String s ="INSERT INTO 'student'.'students' ('stID' , 'stNAME') VALUES ('1' , 'khikhi');";
            String s ="INSERT INTO `student`.`students` (`stID`, `stNAME` ,`stDOB`) VALUES ('1', 'khikhi' , '1990');";


            stmt.execute(s);

            con.close();

            System.out.print("Query executed");

        }

    }


