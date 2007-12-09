# Makefile for generating lexer and parser (requires gnu binutils and, obviously, make)



parser:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -o ./tmp -Xconversiontimeout 80000000 etc/XQFT.g
	mv ./tmp/etc/XQFTParser.java ./src/no/ntnu/xqft/parse/XQFTParser.java
	mv ./tmp/etc/XQFTLexer.java ./src/no/ntnu/xqft/parse/XQFTLexer.java

ant:
	ant

jar:
	jar cvfm xqft-ntnu.jar ./etc/default-manifest *

all: parser ant jar

PITargetTest:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -Xgrtree test/PITarget/PITargetGr.g
	javac -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar test/PITarget/*.java
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar:test/PITarget PITargetGrParser test/PITarget/fail.txt

ContentCharsTest:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -Xgrtree test/ContentChars/ContentCharsGr.g
	javac -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar test/ContentChars/*.java
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar:test/ContentChars ContentCharsGrParser test/ContentChars/fail.txt

CDataSection:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool test/CDataSectionContents/CData.g

TestLexing:
	java -Xmx512M  -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -Xconversiontimeout 80000000 test/testlexing/FuckAss.g

DirComment:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool test/DirCommentContents/DirComment.g

clean:
	find .|grep ~$$|xargs rm -v
	ant clean
