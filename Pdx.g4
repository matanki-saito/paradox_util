grammar Pdx;

// lexer
COMMENT: '#' ~('\n'|'\r')* ('\r\n' | '\r' | '\n' | EOF) -> skip;

// "ABC" "" "\n" "ABC\nCBA" "猫と犬"
WRAP_STRING: '"' CHAR* '"';

// space is ignored
SPACE: (' '|'\t'|'\r'|'\n'|'\r\n') -> skip;

// 5.00, 120, -1, 1e-5, 2e+500,
NUMBER: '-'? INT FRAC? EXP?;

DATE_TIME : INT DOT INT DOT INT;

FALSE: 'false';
TRUE: 'true';
NULL : 'null';
YES : 'yes';
NO : 'no';

KEY_LEVEL_STRING:
  ( DOT
  | AT_MARK
  | ALPHABETS
  | EUROPEAN_LANG_CHARS
  | INT
  | Semicolon
  | HTPHEN
  | UNDERSCORE
  | Apostrophe
  | SINGLE_QUOTE)+;

BRACHET_START: '{';
BRACHET_END: '}';
EQ: '=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';

Semicolon: ':';
Apostrophe: '’';
SINGLE_QUOTE: '\'';
UNDERSCORE: '_';
HTPHEN: '-';
DOT: '.';
AT_MARK: '@';
ALPHABETS: [a-zA-Z];
EUROPEAN_LANG_CHARS: [À-ÿœšŸŠŒŽž];

CHAR: ~[\u{22}\u{5C}\u{0}-\u{1F}]
    | '\\' [bfnrt];
EXP: [eE] ('-'|'+')? [0-9]+;
FRAC: DOT [0-9]+;
INT: '0' | ([1-9] [0-9]*);

// parser
primitive
: FALSE
| TRUE
| NULL
| YES
| NO
| NUMBER
| KEY_LEVEL_STRING
| WRAP_STRING;

nameSeparator
: LT
| LTE
| GT
| GTE
| EQ;

value
: element
| array;

// キーには数字を使用できる
// 例）1000.0
// キーには日付を使用できる
// 例）1024.20.1
// キーには特定の文字列を使用できる
// 例）abc.1
// 例）bbb-6-czAÿ.10a_1''5
// 例）あいう NG
key
: (NUMBER|DATE_TIME|KEY_LEVEL_STRING);

root
: elements+=element*;

element
: keyValue
| array
| primitive;

keyValue
: key nameSeparator value;

array
: BRACHET_START elements+=element* BRACHET_END;

