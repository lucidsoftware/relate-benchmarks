package controllers

import play.api.Play.current
import play.api.db._
import com.lucidchart.open.relate._
import com.lucidchart.open.relate.interp._

object RelateInterpTests {

  def select1_int(nums: Seq[Int]) = {
    DB.withConnection { implicit connection =>
      sql"SELECT `col14` FROM  `sel_50` WHERE `col44` IN ($nums) "
        .asList(RowParser { row =>
          row.int("col14")
        })
    }
  }

  def select2_int(nums : Seq[Int]) = {
    DB.withConnection { implicit connection =>
      sql"SELECT `col45`,`col46`,`col47`,`col48`,`col49`,`col50`,`col1`,`col2`,`col3`,`col4`,`col5` FROM `sel_50` WHERE  `col18` IN ($nums)  "
        .asList( RowParser {row =>
          row.int("col45")
          row.int("col46")
          row.int("col47")
          row.int("col48")
          row.int("col49")
          row.int("col50")
          row.int("col1")
          row.int("col2")
          row.int("col3")
          row.int("col4")
          row.int("col5")
        })
    }
  }

  def select3_int(nums: Seq[Int]) = {
    DB.withConnection { implicit connection =>
      sql"SELECT `col1`,`col2`,`col3`,`col4`,`col5`,`col6`,`col7`,`col8`,`col9`,`col10`,`col11`,`col12`,`col13`,`col14`,`col15`,`col16`,`col17`,`col18`,`col19`,`col20`,`col21`,`col22`,`col23`,`col24`,`col25` FROM `sel_50` WHERE  `col18` IN ($nums) "
        .asList( RowParser {row =>
          row.int("col1")
          row.int("col2")
          row.int("col3")
          row.int("col4")
          row.int("col5")
          row.int("col6")
          row.int("col7")
          row.int("col8")
          row.int("col9")
          row.int("col10")
          row.int("col11")
          row.int("col12")
          row.int("col13")
          row.int("col14")
          row.int("col15")
          row.int("col16")
          row.int("col17")
          row.int("col18")
          row.int("col19")
          row.int("col20")
          row.int("col21")
          row.int("col22")
          row.int("col23")
          row.int("col24")
          row.int("col25")
        })
    }
  }

  def insert1_int(rows: Seq[Int]) = {
    DB.withConnection { connection =>
      rows.foreach { row =>
        sql"INSERT INTO `ins_10` VALUES ($row,$row,$row,$row,$row,$row,$row,$row,$row,$row)"
          .executeUpdate()(connection)
      }
    }
  }

  def insert2_int(rows: Seq[Int]) = {
    DB.withConnection { connection =>
      rows.foreach { row =>
        sql"INSERT INTO `ins_50` VALUES ($row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row)"
          .executeUpdate()(connection)
      }
    }
  }

  def insert3_int(rows: Seq[Int]) = {
    DB.withConnection { connection =>
      rows.foreach { row =>
        sql"INSERT INTO `ins_100` VALUES ($row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row,$row)"
          .executeUpdate()(connection)
      }
    }
  }

  def update1_int(nums: Seq[Int]) = {
    DB.withConnection { connection =>
      sql"UPDATE `sel_50` SET `col13`=16 ,`col33`=19 where `col22` IN ($nums)"
        .executeUpdate()(connection)
    }
  }

  def update2_int(nums: Seq[Int]) = {
    DB.withConnection { connection =>  
      sql"UPDATE `sel_50` SET `col1`=16 ,`col43`=19, `col45`=14, `col32`=45, `col26`=254,`col3`=34, `col5`=235, `col12`=5, `col29`=234, `col17`=34 where `col12` IN  ($nums)"
        .executeUpdate()(connection)
    }
  }  

  def update3_int(nums: Seq[Int]) = {
    DB.withConnection { connection => 
      sql"UPDATE `sel_50` SET `col1`=16 ,`col43`=19, `col45`=14, `col32`=45, `col26`=254,`col3`=34, `col5`=235, `col12`=5, `col29`=234,`col17`=34 ,`col18`=423, `col19`=341, `col27`=3243, `col28`=2315, `col25`=1234, `col33` = 34126, `col34` = 23425 ,`col35`=342 ,`col1`=234, `col49`=3576 where `col12` IN  ($nums)"
        .executeUpdate()(connection)
    }
  }

}  
