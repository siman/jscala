JScala
======

Scala macro that produces JavaScript from Scala code. Let it be type safe!


Supported Features:
===================
* Variable definitions, basic unary and binary operations
* Named and anonymous functions
* Scala Arrays/Seq as JavaScript Array literals
* Scala Map and anonymous classes as JavaScript object
* if, while, for..in and for statements
* Scala if as an expression (e.g. val a = if (true) 1 else 2)
* Scala match as JavaScript switch
* Basic Scala class definition to JavaScript object definition translation
* Global JavaScript functions (parseInt etc)
* Basic Browser objects (window, history, location etc)
* Basic HTML DOM objects (Document, Element, Attribute, Node, NodeList etc)
* Raw JavaScript inclusion
* Values and function call injections from your Scala code
* Generated JavaScript eval using Java ScriptEngine
* Pretty printing and compression using YUI compressor

Examples
========

This Scala code has no meaning but shows basic ideas:

```scala
val replacement = "text"
val js = javascript {
  window.setTimeout(() => {
    val r = new RegExp("d.*", inject(replacement))
    class Point(val x: Int, val y: Int)
    val point = new Point(1, 2)
    def func(i: String) = r.exec(i)
    val list = document.getElementById("myList2")
    val map = collection.mutable.Map[String, String]()
    for (idx <- 0 until list.attributes.length) {
      val attr = list.attributes.item(idx).as[Attribute]
      val text = if (attr.textContent.length > 0) attr.textContent else "default"
      map(attr.name) = func(text)
    }
    val obj = new {
      val field = 1
      def func2(i: Int) = "string"
    }
    val links = Array("https://github.com/nau/jscala", "https://github.com/lampepfl/scala-js")
    for (link <- links) {
      include("var raw = 'JavaScript'")
      console.log(link + obj.func2(obj.field) + point.x)
    }
    window.location.href = links(0).replace("jscala", "jscala/blob/master/README.md")
  }, 1000)
}
println(js.asString)
```

It will print

```javascript
window.setTimeout((function () {
    var r = new RegExp("d.*", "text");
    function Point(x, y) {
      this.x = x;
      this.y = y
    };
    var point = new Point(1, 2);
    function func(i) {
      return r.exec(i);
    };
    var list = document.getElementById("myList2");
    var map = {};
    for (var idx = 0; idx < list.attributes.length; idx++) {
      var attr = list.attributes.item(idx);
      var text;
      if (attr.textContent.length() > 0) {
        text = attr.textContent;
      } else {
        text = "default";
      };
      map[attr.name] = func(text);
    };
    var obj = {
      field: 1,
      func2: (function (i) {
        return "string";
      })
    };
    var links = ["https://github.com/nau/jscala", "https://github.com/lampepfl/scala-js"];
    for (link in links) {
      var raw = 'JavaScript';
      console.log((link + obj.func2(obj.field)) + point.x);
    };
    window.location.href = links[0].replace("jscala", "jscala/blob/master/README.md");
  }), 1000)
```
      
How To Use
==========

In your build.sbt add

    scalaVersion := "2.10.2"

    libraryDependencies += "org.jscala" %% "jscala-macros" % "0.2"

    libraryDependencies += "com.yahoo.platform.yui" % "yuicompressor" % "2.4.7"
    
If you want to try the latest snapshot:

    scalaVersion := "2.10.2"

    resolvers += Resolver.sonatypeRepo("snapshots")

    libraryDependencies += "org.jscala" %% "jscala-macros" % "0.3-SNAPSHOT"

    libraryDependencies += "com.yahoo.platform.yui" % "yuicompressor" % "2.4.7"

In your code

```scala
import org.jscala._
val js = javascript { ... }
println(js.asString)
println(js.compress)
println(js.eval())
```
    
That's it!

How To Build And Play Some Tetris
=================================

Make sure you have at least -Xmx750Mb for your sbt. 
Don't know why but it takes up to 700Mb to compile _jscala-macros_ project.

In sbt shell run `tetris` task. 
It will compile and generate _tetris.js_ file in _jscala-examples/javascript-tetris_ and open Tetris game in your browser.
Tetris is fully written in Scala and translates to JavaScript mostly literally. 

Tetris sources are here: [jscala-examples/src/main/scala/org/jscalaexample/Tetris.scala](https://github.com/nau/jscala/blob/master/jscala-examples/src/main/scala/org/jscalaexample/Tetris.scala)

Planned Features
================

* Traits support
* JavaScript frameworks support: jQuery, Angular.js etc
* Web frameworks support: Play, Lift

Feedback
========

Any feedback is very welcome!

You can use [JScala mailing list](https://groups.google.com/forum/#!forum/jscala-user) if you have any questions.

Or simply ask me on Twitter: [@atlanter](https://twitter.com/atlanter)
