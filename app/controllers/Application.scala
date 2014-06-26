package controllers

import play.api.Play.current
import play.api._
import play.api.mvc._
import anorm._
import anorm.SqlParser._
import play.api.db._
import java.sql.{Array =>_, _}
import com.lucidchart.open.relate.{SQL => RelateSQL}
import com.lucidchart.open.relate.Query._


object Application extends Controller {
	

 def testInt() = Action {
	Test.testInt()
	Ok(views.html.index("Testing is DOne"))
 }
 def test1() = Action {
	//
	//Test.test2()

	changeType("ins_10","text")
	//doesn't compile
	//Ok(views.html.test1(Test.test8()))
	Ok(views.html.index("Testing is DOne"))
	
	}

	def changeType(table:String,type1:String) = {
		val count = DB.withConnection { implicit connection =>
		RelateSQL("SELECT count(*) AS cnt FROM information_schema.columns WHERE table_name = '"+table+"'")
		.asSingle(com.lucidchart.open.relate.RowParser.int("cnt"))
		}
		println(count)
		var i = 1
		while (i <= count)
		{
			DB.withConnection { implicit connection =>
			RelateSQL("ALTER TABLE `"+table+"` MODIFY `col" + i.toString + "` " + type1).executeUpdate()
			}
		 i += 1
		}
	}


  def time[A](name: String)(callback: => A):Long = {
	val start = System.currentTimeMillis
	val ret = callback
	val end = System.currentTimeMillis
	println(name + " took " + (end - start) + "ms")
	(end - start)
  }

  
}

