lexer grammar CData;

// $ANTLR src "test/CDataSectionContents/CData.g" 7
INT: ('0'..'9')+;
// $ANTLR src "test/CDataSectionContents/CData.g" 8
CHAR   : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

// $ANTLR src "test/CDataSectionContents/CData.g" 11
CharUttrykk:CHAR*;