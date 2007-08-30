# Makefile for generating lexer and parser (requires gnu binutils and, obviously, make)

lexers:
	jflex -d src/no/ntnu/xqft/lex etc/xqft.lex

parsers:
	java -jar lib/java-cup-11a.jar -parser XQFTParser -symbols XQFTSymbols etc/xqft.cup
	mv XQFTParser.java src/no/ntnu/xqft/parse
	mv XQFTSymbols.java src/no/ntnu/xqft/parse

ant:
	ant

jar:
	jar cvfm xqft-ntnu.jar ./etc/default-manifest *

all: lexers parsers ant jar

test:
	java -cp bin/:lib/java-cup-11a.jar no.ntnu.xqft.test.XQFTParserTest

clean:
	find .|grep ~$$|xargs rm -v
	ant clean
