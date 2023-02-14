package exams
open class exam( _name:String, _objects:String,_data:String,_estimation:Int) {
    var name:String=_name
    var objects:String=_objects
    var data:String=_data
    var estimation:Int=_estimation
    open fun Nameandestimation(){
        when{
            (estimation>2&&estimation<5)-> println("Оценка студента ${name} = ${estimation}")
            (estimation<=2)-> println("Оценка студента ${name} плохая")
            (estimation>5)-> println("Такой оценки нет")
        }
    }
    open fun date(){
        println("Предмет '${objects}' числа ${data}")
    }
    open fun traintime(){
        println("Студент ${name} сдает экзамен ${objects}")
    }
    open fun info(){
        when{
            (objects=="Математика")-> println("Нельзя иметь калькулятор")
            (objects=="Литература")-> println("Нельзя иметь художественную литературу")
            (objects=="Русский")-> println("Нельзя использовать словарь")
        }
    }
}

