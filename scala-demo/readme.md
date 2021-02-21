执行命令:
    $ java -jar some.jar
    $ java -cp some.jar fn.scala.fastStudy.ch01.Hello
    $ java -cp ".\scala-pom-1.0-SNAPSHOT.jar;..\..\scala-library-2.12.13.jar" fn.scala.pom.Hi
    $ java -cp ".\scala-demo_2.12-0.1.jar;..\..\..\scala-library-2.12.13.jar" fn.scala.fast.ch01.Hello

注意：
    需要 scala-library-2.12.13.jar 文件，执行时指定该文件的位置。

参考：
    java命令行运行jar里的main类
    一般运行包含manifest的jar包，可以使用

    $ java -jar <jar-file-name>.jar
    如果jar里没有 manifest，则可以使用

    $ java -cp foo.jar full.package.name.ClassName
    当main类依赖多个jar时，可以把多个jar打包到一个目录，然后用-Djava.ext.dirs指定该目录，引用依赖的多个jar。

    $ java -Djava.ext.dirs=<多个jar包的目录> com.test.HelloWordMain
    如果用-cp则需要写每一个jar，很麻烦。


