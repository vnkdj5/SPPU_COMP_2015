<?php

$conn=new mysqli("localhost:3306","vaibhav","","tnp_db");
 if(! $conn ) {
            die('Could not connect: ' . mysql_error());
         }
         echo 'Connected successfully';

         $sql="select * from student";
         $result=mysqli_query($conn,$sql);

         foreach ($result as $row) {
         	echo $row["student_name"].$row["student_rollno"].$row["student_class"];
         }

?>