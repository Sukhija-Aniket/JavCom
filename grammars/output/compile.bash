#! /bin/bash

arg="$1"
var3="parse"
var1="compile"
var2="clean"

declare -a directories
cd testcases
directories=( $( ls . ) )
cd ../
if [[ "$arg" == "$var1" ]]; then
	javac *.java

	for directory in "${directories[@]}"
	do
		java Main < testcases/"${directory}"/cs502/Main.java
	done


elif [[ "$arg" == "$var2" ]]; then
	echo "removing files"
	find . -name "*.class" -type f
	find . -name "*.class" -type f -delete
	find . -name "*.jj" -type f 
	find . -name "*.jj" -type f -delete
	find . -name "*.jar" -type f
	find . -name "*.jar" -type f -delete
	find . -name "*.iml" -type f 
	find . -name "*.iml" -type f -delete
	find . -name "*.txt" -type f
	find . -name "*.txt" -type f -delete
	find . -name "*.html" -type f 
	find . -name "*.html" -type f -delete
elif [[ "$arg" == "$var3" ]]; then
	javacc "$2"
	java -jar jtb132.jar JT.jj
	javacc JT.out.jj
else
	echo "valid commands are: parse with fileName, compile, clean, diff"
fi
