import exams.*
class mathematics(var hint:Boolean,var accessories:String,name:String, objects:String,data:String,
                  estimation:Int):exam(name,objects,data,estimation)
{
    override fun Nameandestimation() {
        when{
            (hint==true&&estimation>3&&estimation<5)-> println("Оценка студента ${name} = ${estimation}")
            (hint==false&&estimation>3&&estimation<5)-> println("Оценка студента ${name} очень хорошая")
            (estimation<=2)-> println("Оценка студента ${name} плохая")
            (estimation>5)-> println("Такой оценки нет")
        }
    }
    override fun date() {
        println("Предмет '${objects}' числа ${data}")
    }
    override fun traintime() {
        when{
            (accessories=="Линейка"||accessories=="Ручка"||accessories=="Циркуль")->println("Студент ${name} сдает экзамен ${objects} и имеет ${accessories} предмета для сдачи экзамена")
            else-> println("Такой предмет нельзя на экзамен")
        }
    }

}
