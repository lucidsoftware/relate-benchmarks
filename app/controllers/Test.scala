package controllers
import java.sql.{Array =>_, _}


object Test { 

	def testInt() = {
		val numsList = List( (1 to 100), (1 to 10000), (1 to 10000) )

		val rownumsList = List(  (1 to 1000 ) , (1 to 5000), (1 to 10000) )

		numsList.foreach { nums => 

			(1 to 10).foreach { t =>
				Application.time("Relate: Select 1 column from "+nums.size.toString+" records") { RelateTests.select1_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Select 1 column from "+nums.size.toString+" records") { RelateInterpTests.select1_int(nums) }
      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Select 1 column from "+nums.size.toString+" records") { AnormTests.select1_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Select 1 column from "+nums.size.toString+" records") { JDBCTests.select1_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("Relate: Select 10 columns from "+nums.size.toString+" records") { RelateTests.select2_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Select 10 columns from "+nums.size.toString+" records") { RelateInterpTests.select2_int(nums) }
      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Select 10 columns from "+nums.size.toString+" records") { AnormTests.select2_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Select 10 columns from "+nums.size.toString+" records") { JDBCTests.select2_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("Relate: Select 25 columns from "+nums.size.toString+" records") { RelateTests.select3_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Select 25 columns from "+nums.size.toString+" records") { RelateInterpTests.select3_int(nums) }

      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Select 25 columns from "+nums.size.toString+" records") { AnormTests.select3_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Select 25 columns from "+nums.size.toString+" records") { JDBCTests.select3_int(nums) }
				
			}

		}

		

		rownumsList.foreach { nums =>

			(1 to 10).foreach { t =>
				Application.time("Relate: Insert 10 columns , "+nums.size.toString +" records") { RelateTests.insert1_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Insert 10 columns , "+nums.size.toString +" records") { RelateInterpTests.insert1_int(nums) }

      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Insert 10 columns , "+nums.size.toString +" records") { AnormTests.insert1_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Insert 10 columns , "+nums.size.toString +" records") { JDBCTests.insert1_int(nums) }
				
			}


			(1 to 10).foreach { t =>
				Application.time("Relate: Insert 50 columns , "+nums.size.toString +" records") { RelateTests.insert2_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Insert 50 columns , "+nums.size.toString +" records") { RelateInterpTests.insert2_int(nums) }

      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Insert 50 columns , "+nums.size.toString +" records") { AnormTests.insert2_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Insert 50 columns , "+nums.size.toString +" records") { JDBCTests.insert2_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("Relate: Insert 50 columns , "+nums.size.toString+" records") { RelateTests.insert3_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Insert 50 columns , "+nums.size.toString+" records") { RelateInterpTests.insert3_int(nums) }

      }

			 (1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Insert 50 columns , "+nums.size.toString+" records") { AnormTests.insert3_int(nums) }
				
			}

			 (1 to 10).foreach { t =>
				Application.time("JDBC: Insert 50 columns , "+nums.size.toString+" records") { JDBCTests.insert3_int(nums) }
				
			}



		}

		numsList.foreach { nums =>

			(1 to 10).foreach { t =>
				Application.time("Relate: Update 2 columns , "+nums.size.toString +" records") { RelateTests.update1_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Update 2 columns , "+nums.size.toString +" records") { RelateInterpTests.update1_int(nums) }

      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Update 2 columns , "+nums.size.toString +" records") { AnormTests.update1_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Update 2 columns , "+nums.size.toString +" records") { JDBCTests.update1_int(nums) }
				
			}

			(1 to 10).foreach { t=>
				Application.time("Relate: Update 10 columns , "+nums.size.toString +" records") { RelateTests.update2_int(nums) }
				
			}

      (1 to 10).foreach { t=>
        Application.time("Relate (interp): Update 10 columns , "+nums.size.toString +" records") { RelateInterpTests.update2_int(nums) }

      }

			(1 to 10).foreach { t=>
				Application.time("Anorm 2.1.1: Update 10 columns , "+nums.size.toString +" records") { AnormTests.update2_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t=>
				Application.time("JDBC: Update 10 columns , "+nums.size.toString +" records") { JDBCTests.update2_int(nums) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("Relate: Update 20 columns , "+nums.size.toString+" records") { RelateTests.update3_int(nums) }
				
			}

      (1 to 10).foreach { t =>
        Application.time("Relate (interp): Update 20 columns , "+nums.size.toString+" records") { RelateInterpTests.update3_int(nums) }

      }

			(1 to 10).foreach { t =>
				Application.time("Anorm 2.1.1: Update 20 columns , "+nums.size.toString+" records") { AnormTests.update3_int(nums.mkString(",")) }
				
			}

			(1 to 10).foreach { t =>
				Application.time("JDBC: Update 20 columns , "+nums.size.toString+" records") { JDBCTests.update3_int(nums) }
				
			}


		}
	//def testDouble = {
	//	val doubleResults1 = (1 to 10).map ( trial => (trial,
	//		Application.time("Relate") { RelateTests.select1_double() } ,
	//		Application.time("Anorm") { AnormTests.select1_double() },
	//		Application.time("JDBC") { JDBCTests.select1("double") } )).toList
	//
	//
	//	}


}
}