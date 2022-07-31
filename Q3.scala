

object name {

    def main(args:Array[String]):Unit = {
         println("\n")
            println(formatName("Benny"  , toUpper))
            println(formatName("Niroshan".slice(0,2),toUpper) +formatName("Niroshan" .slice(1,8),toLower) )
            println(formatName("Saman"  ,toLower));
            println(formatName("K",toUpper) + formatName("umar"  ,toLower) + formatName("a"  ,toUpper))
             println("\n")
    }

    def toUpper(word:String):String={
     //map collection of key/value pairs
      return word.map(character =>character.toUpper)
    }

     def toLower(word:String):String={
         return word.map(ch =>ch.toLower)
     }

     def formatName(word:String , function:String=>String ):String={
          function(word)
      }

}



