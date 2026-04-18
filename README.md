compiles into java script 

java -jar antlr-4.9.2-complete.jar -visitor js.g4


javac --release 25 -cp .:antlr-4.9.2-complete.jar *.java

java -cp .:antlr-4.9.2-complete.jar JSInterpreter my.js

