# Fundaments

# How to Install

## Coursier way
* install coursier
  * follow instructions
    * use brew to install coursier
  * cs setup --jvm adopt:11
    * use jenv
    * dont install things in your path. You are using brew, cs too dumb to know 
      shit.
    * export PATH="$PATH:$HOME/Library/Application Support/Coursier/bin"
      * put this in your zshprofile or bash profile
      * cs will put it in your .profile which does jackshit.

* use Intellij
  * command , to go to plugins and install scala.
  * install cucumber later, not important now.

* Steps
  * Run sbt on terminal
    * `$ sbt`
    `* compile, test, run

Or just go to the root in src/main/scala and do a 
@main def run(): Unit = {
  ....
}
And use intellij to run cuz Scala is sortah like java is its construct and IntelliJ was 10x easier to setup than VSCode for java.

Everytime I do a chapter I will write some notes.


