# Makefile for generating lexer and parser (requires gnu binutils and, obviously, make)

lexer:
	java -jar lib/JFlex.jar -d src/no/ntnu/xqft/lex etc/xqft.lex
	
simplecalc:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -o src etc/SimpleCalc.g

parser:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool etc/xqft.g

ant:
	ant

jar:
	jar cvfm xqft-ntnu.jar ./etc/default-manifest *

all: parser ant jar

test:
	java -cp bin/:lib/java-cup-11a.jar no.ntnu.xqft.test.XQFTParserTest

tests: PITargetTest

PITargetTest:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -Xgrtree test/PITarget/PITargetGr.g
	javac -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar test/PITarget/*.java
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar:test/PITarget PITargetGrParser test/PITarget/fail.txt

CDataSection:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool test/CDataSectionContents/CData.g
DirComment:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool test/DirCommentContents/DirComment.g

clean:
	find .|grep ~$$|xargs rm -v
	ant clean
