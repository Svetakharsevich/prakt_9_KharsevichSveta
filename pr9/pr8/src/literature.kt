import exams.*
class literature(var essays:Boolean, name:String, objects:String,data:String, estimation:Int)
    :exam(name,objects,data,estimation)
{
    override fun Nameandestimation() {
      when{
          (essays==true)-> println("Пишем сочинение")
          (essays==false)-> println("Не пишем сочинение")
          else -> println("Сочинений не может быть так много")
      }
    }
    override fun date() {
        println("Предмет '${objects}' числа ${data}")
    }
    fun information(){
        when{
            (estimation>2&&estimation<=5)-> println("Оценка студента ${name} = ${estimation}")
            (estimation<=2)-> println("Оценка студента ${name} плохая")
            (estimation>5)-> println("Такой оценки нет")
        }
    }


}
