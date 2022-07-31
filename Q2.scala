import scala.io.StdIn.readInt



object patternMatch{

    def main(args:Array[String]):Unit={
        print("Enter a Number: ")
            var number = readInt();
           println(pattern(number));
    }

    def pattern(num:Int):String =  num match{

         case num if num<=0 => "Negative/Zero"
         case num if num>0 && num%2==0 =>"Even"
         case num if num>0 && num%2 != 0 => "Odd"
    }
}