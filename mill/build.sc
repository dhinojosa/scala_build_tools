// build.sc
import mill._, scalalib._

object foo extends ScalaModule {
  def scalaVersion = "2.12.6"
  def scalacOptions = Seq("-deprecation", "-feature")
  object test extends Tests { 
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.0.5",
      ivy"com.lihaoyi::utest:0.6.0"
    )
    def testFrameworks = Seq("org.scalatest.tools.Framework")
    //def testFrameworks = Seq("utest.runner.Framework")
  }
}
