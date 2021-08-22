# Fundamentals of Functional Programming (using Scala)

## How to Install

### Coursier way
* install coursier
  * follow instructions
    * use brew to install coursier
  * use jenv to install the correct java jvm
  * `$ cs setup --jvm adopt:11`
    * It'll ask to install things. Dont do it. They never work right. Besides, you are using brew. Pathing is funky when you use brew.
    * `export PATH="$PATH:$HOME/Library/Application Support/Coursier/bin"`
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
```scala
@main def run(): Unit = {
  ....
}
```
And use intellij to run cuz Scala is sortah like java is its construct and IntelliJ was 10x easier to setup than VSCode for java.

Everytime I do a chapter I will write some notes.

## What is this for?

The Notes will house the basic concepts to tick off 4 months from now when I forget all this stuff.

Each commit will be the next chapter hopefully. with notes in between.
* Initial repos setup
* Chapter 1 roundup
* Chapter 2 roundup
  
This is best used if you have these commands in your `.gitconfig` file.
```bash
prev = checkout HEAD^1
next = "!sh -c 'git log --reverse --pretty=%H master | awk \"/$(git rev-parse HEAD)/{getline;print}\" | xargs git checkout'"
```
It helps go backwards and forwards throughout a git history timeline. Or you can use git history extension.

I'd also use a markdown extension to read the notes. And probably plantuml.

## What this repos is lacking

* Its lacking Gradle auto build support.
* Its using coursier and not scala native.

(Markdown All in One is good reliable markdown preview);