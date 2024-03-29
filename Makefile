# Makefile for generating lexer and parser (requires gnu binutils and, obviously, make)

all: parser compile jar

compile:
	javac -sourcepath ./src -cp lib/args.jar:lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar:lib/junit.jar -d bin `find src -name *java`


parser:
	java -Xmx800M -cp lib/antlr.jar:lib/antlr2.jar:lib/stringtemplate.jar org.antlr.Tool -o ./tmp -Xconversiontimeout 80000000 etc/XQFT.g
	mv ./tmp/etc/XQFTParser.java ./src/no/ntnu/xqft/parse/XQFTParser.java
	mv ./tmp/etc/XQFTLexer.java ./src/no/ntnu/xqft/parse/XQFTLexer.java

dotgraphs:
	for i in `ls doc/graph_queries|grep \.xq$$|sed -e 's/\.xq$$//'`; do java -Xmx1024M -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.Dot doc/graph_queries/$$i.xq|dot -Tpdf -odoc/img/graphs/$$i.pdf; done;

jar:
	cd bin && jar cvfm ntnu-xqft.jar ../etc/default-manifest *
	mv ./bin/ntnu-xqft.jar ./

madsJar:
	cd bin && jar cvfm parserOgLexer.jar ../etc/default-manifest no/ntnu/xqft/parse/XQFT*
	mv ./bin/parserOgLexer.jar ./

delParserAndLexerSource:
	rm ./src/no/ntnu/xqft/parse/XQFTLexer.java
	rm ./src/no/ntnu/xqft/parse/XQFTParser.java

testsuite:
	java -Xmx1024M -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.test.XQueryTestSuite

testsuitegui:
	java -Xmx1024M -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.test.gui.GUIedTest  

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

ManualWalkerTest:
	java -Xmx1024M -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.test.ManualWalker

Mein:
	java -Xmx1024M -cp bin:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.test.Mein

xqft:
	java -Xmx1024M -cp bin:lib/args.jar:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.XQFT

tdgraphs:
	find doc/td_src|grep \.xq$$|xargs java -Xmx1024M -cp bin:lib/args.jar:lib/antlr.jar:lib/stringtemplate.jar no.ntnu.xqft.XQFT -d -p -o doc/img/graphs

pfgraphs:
	for i in `ls doc/td_src|grep \.xq$$|sed -e 's/\.xq$$//'`; do echo $$i && pf -A -D -l -s16 doc/td_src/$$i.xq|sed -e 's/box/plaintext/'|sed -e 's/filled/solid/'|dot -Tpdf -odoc/img/graphs/$${i}_pathfinder.pdf; done;   


clean:
	find .|grep ~$$|xargs rm -v
	ant clean


