# Makefile for generating lexer and parser (requires gnu binutils and, obviously, make)

lexer:
	java -jar lib/JFlex.jar -d src/no/ntnu/xqft/lex etc/xqft.lex
	

parser:
	java -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool etc/xqft.g
#	java -jar lib/java-cup-11a.jar -parser XQFTParser -symbols XQFTSymbols etc/xqft.y
#	mv XQFTParser.java src/no/ntnu/xqft/parse
#	mv XQFTSymbols.java src/no/ntnu/xqft/parse

ant:
	ant

jar:
	jar cvfm xqft-ntnu.jar ./etc/default-manifest *

all: parser ant jar

test:
	java -cp bin/:lib/java-cup-11a.jar no.ntnu.xqft.test.XQFTParserTest

clean:
	find .|grep ~$$|xargs rm -v
	ant clean
