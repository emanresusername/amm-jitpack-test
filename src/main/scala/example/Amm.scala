package example

object Amm extends App {
  ammonite.Main.main(Array("--no-home-predef", "--predef-code", """
interp.repositories() ++= Seq(
    coursier.maven.MavenRepository("https://jitpack.io")
)
@
interp.load.ivy(
"com.github.nullpunkt" % "excel-to-json" % "e5f3129"
)
@
import net.nullpunkt.exceljson.convert.ExcelToJsonConverter
"""))
}
