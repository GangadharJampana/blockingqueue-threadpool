Requirements for running this program Java and Maven.

For testing this program we will need a json file. Please refer to the cycle.json file in resources folder.

steps for running this program without specifying json file path in args. cycle.json will take as default

1)cd to your project root folder in command line.
2)mvn compile
3)mvn exec:java -Dexec.mainClass=Main


command for running this program by passing json file path to args

3)mvn exec:java -Dexec.mainClass=Main -Dexec.args="filepath"
