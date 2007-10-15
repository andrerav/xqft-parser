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
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool test/PITarget/PITargetGrammar.g

clean:
	find .|grep ~$$|xargs rm -v
	ant clean
