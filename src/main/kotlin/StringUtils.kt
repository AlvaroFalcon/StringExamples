class StringUtils{
    companion object {
        fun countUppercase(text : String): Int{
            var count = 0
            for(char in text){
                if (char.isUpperCase()){
                    count++
                }
            }
            return count
        }
    }
}