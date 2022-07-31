

object rate{
    def main(args:Array[String]):Unit={
            
          def  interestInYear(depositAmount:Int):Unit={
             if(depositAmount>0  &&  depositAmount<=20000){
                 println(s" Interest amount per year : Rs. ${depositAmount*0.02} ");
              
             }else if(depositAmount>20000 && depositAmount<= 200000){
                    println(s" Interest amount per year : Rs. ${depositAmount*0.04} ");
             }else if(depositAmount>200000 && depositAmount<=2000000){
                       println(s" Interest amount per year : Rs. ${depositAmount*0.035} ");
             }else if(depositAmount>2000000){
                    println(s" Interest amount per year : Rs. ${depositAmount*0.06} ");
             }

              
               
          }

              interestInYear(250000);
    }
}




