grammar Expr;

// lexer

// "ABC" "" "\n" "ABC\nCBA" "猫と犬"
WRAP_STRING: '"' CHAR* '"';

// space is ignored
SPACE: ' ' -> skip;

// 5.00, 120, -1, 1e-5, 2e+500,
NUMBER: '-'? INT FRAC? EXP?;

DATE_TIME : INT DOT INT DOT INT;

KEY_LEVEL_STRING:
  ( DOT
  | AT_MARK
  | ALPHABETS
  | EUROPEAN_LANG_CHARS
  | INT
  | HTPHEN
  | UNDERSCORE
  | Apostrophe
  | SINGLE_QUOTE)+;

ID_LEVEL_STRING:
  ( Semicolon
  | KEY_LEVEL_STRING
  )+;

BRACHET_START: '{';
BRACHET_END: '}';
EQ: '=';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
FALSE: 'false';
TRUE: 'true';
NULL : 'null';
YES : 'yes';
NO : 'no';
Semicolon: ':';
Apostrophe: '’';
SINGLE_QUOTE: '\'';
UNDERSCORE: '_';
HTPHEN: '-';
DOT: '.';
AT_MARK: '@';
ALPHABETS: [a-zA-Z];
EUROPEAN_LANG_CHARS: [À-ÿœšŸŠŒŽž];

COMMENT : '#' [^\n]* '\n';


CHAR: ~[\u{22}\u{5C}\u{0}-\u{1F}]
    | '\\' [bfnrt];
EXP: [eE] ('-'|'+')? [0-9]+;
FRAC: DOT [0-9]+;
INT: '0' | ([1-9] [0-9]*);

// parser

primitive: FALSE
         | TRUE
         | NULL
         | YES
         | NO
         | NUMBER
         | KEY_LEVEL_STRING
         | ID_LEVEL_STRING
         | WRAP_STRING;

name_separator : LT
               | LTE
               | GT
               | GTE
               | EQ;

value : member
      | object;

// キーには数字を使用できる
// 例）1000.0
// キーには日付を使用できる
// 例）1024.20.1
// キーには特定の文字列を使用できる
// 例）abc.1
// 例）bbb-6-czAÿ.10a_1''5
// 例）あいう NG
key: (NUMBER|DATE_TIME|KEY_LEVEL_STRING);

member: key name_separator value
      | object
      | primitive;

object: BRACHET_START (member)? BRACHET_END;
