grammar js;

// ==========================
// PROGRAMA
// ==========================
programa : statement* EOF ;

// ==========================
// STATEMENTS
// ==========================
statement
    : block
    | variableStatement
    | functionDeclaration
    | classDeclaration
    | ifStatement
    | iterationStatement
    | returnStatement
    | breakStatement
    | continueStatement
    | expressionStatement
    | importStatement
    | exportStatement
    | ';'
    ;

// --------------------------
block : '{' statement* '}' ;

// ==========================
// DECLARAÇÕES
// ==========================
variableStatement
    : ('let' | 'const' | 'var') variableDeclaration (',' variableDeclaration)* ';'
    ;

variableDeclaration
    : ID ('=' expression)?
    ;

functionDeclaration
    : 'function' ID '(' parameterList? ')' block
    ;

classDeclaration
    : 'class' ID ('extends' ID)? '{' classElement* '}'
    ;

classElement
    : methodDefinition
    ;

methodDefinition
    : ID '(' parameterList? ')' block
    ;

// ==========================
// IMPORT / EXPORT
// ==========================
importStatement
    : 'import' ID 'from' STRING ';'
    ;

exportStatement
    : 'export' (functionDeclaration | variableStatement | classDeclaration)
    ;

// ==========================
// CONTROLO DE FLUXO
// ==========================
ifStatement
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

iterationStatement
    : 'while' '(' expression ')' statement
    | 'for' '(' (variableStatement | expression? ';') expression? ';' expression? ')' statement
    ;

returnStatement
    : 'return' expression? ';'
    ;

breakStatement
    : 'break' ';'
    ;

continueStatement
    : 'continue' ';'
    ;

// ==========================
// EXPRESSÕES
// ==========================
expressionStatement
    : expression ';'
    ;

expression
    : assignmentExpression
    ;

assignmentExpression
    : leftHandSideExpression '=' assignmentExpression
    | logicalOrExpression
    ;

// --------------------------
logicalOrExpression
    : logicalAndExpression ( '||' logicalAndExpression )*
    ;

logicalAndExpression
    : equalityExpression ( '&&' equalityExpression )*
    ;

equalityExpression
    : relationalExpression ( ('==' | '!=' | '===' | '!==') relationalExpression )*
    ;

relationalExpression
    : additiveExpression ( ('<' | '>' | '<=' | '>=') additiveExpression )*
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/' | '%') unaryExpression)*
    ;

unaryExpression
    : ('!' | '-' | '+') unaryExpression
    | postfixExpression
    ;

postfixExpression
    : leftHandSideExpression ('++' | '--')?
    ;

// ==========================
// MEMBER / CALL
// ==========================
leftHandSideExpression
    : primaryExpression ( memberAccess | callExpression )*
    ;

memberAccess
    : '.' ID
    | '[' expression ']'
    ;

callExpression
    : '(' argumentList? ')'
    ;

// ==========================
// PRIMÁRIOS
// ==========================
primaryExpression
    : ID
    | literal
    | arrayLiteral
    | objectLiteral
    | '(' expression ')'
    | arrowFunction
    ;

arrowFunction
    : '(' parameterList? ')' '=>' (expression | block)
    | ID '=>' (expression | block)
    ;

// ==========================
// LITERAIS
// ==========================
literal
    : NUMBER
    | STRING
    | BOOLEAN
    | 'null'
    | 'undefined'
    ;

// Arrays
arrayLiteral
    : '[' (expression (',' expression)*)? ']'
    ;

// Objetos
objectLiteral
    : '{' (property (',' property)*)? '}'
    ;

property
    : ID ':' expression
    ;

// ==========================
// ARGUMENTOS / PARAMETROS
// ==========================
argumentList
    : assignmentExpression (',' assignmentExpression)*
    ;

parameterList
    : ID (',' ID)*
    ;

// ==========================
// TOKENS
// ==========================
BOOLEAN : 'true' | 'false' ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

ID : [a-zA-Z_$][a-zA-Z0-9_$]* ;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;