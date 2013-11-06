/* Generated By:JavaCC: Do not edit this line. Proj6Constants.java */
package project6;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface Proj6Constants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IGNORE = 1;
  /** RegularExpression Id. */
  int ASSIGNMENT_STATEMENT = 11;
  /** RegularExpression Id. */
  int EXPRESSION = 12;
  /** RegularExpression Id. */
  int MULT_COMMENT = 13;
  /** RegularExpression Id. */
  int MATH_SYMBOL = 14;
  /** RegularExpression Id. */
  int RESERVED = 15;
  /** RegularExpression Id. */
  int STRING = 16;
  /** RegularExpression Id. */
  int INTEGER = 17;
  /** RegularExpression Id. */
  int REAL = 18;
  /** RegularExpression Id. */
  int CHAR = 19;
  /** RegularExpression Id. */
  int IDENTIFIER = 20;
  /** RegularExpression Id. */
  int UPPER = 21;
  /** RegularExpression Id. */
  int DIGITS = 22;
  /** RegularExpression Id. */
  int LOWER = 23;
  /** RegularExpression Id. */
  int LETTER = 24;
  /** RegularExpression Id. */
  int DIGIT = 25;
  /** RegularExpression Id. */
  int DECIMAL = 26;
  /** RegularExpression Id. */
  int OCTAL = 27;
  /** RegularExpression Id. */
  int HEXIDECIMAL = 28;
  /** RegularExpression Id. */
  int NODEC = 29;
  /** RegularExpression Id. */
  int NOEXP = 30;
  /** RegularExpression Id. */
  int BOTH = 31;
  /** RegularExpression Id. */
  int SPEC_CYDILLA = 32;
  /** RegularExpression Id. */
  int SPEC_EXCLAMATION = 33;
  /** RegularExpression Id. */
  int SPEC_AT = 34;
  /** RegularExpression Id. */
  int SPEC_PERCENT = 35;
  /** RegularExpression Id. */
  int SPEC_CARROT = 36;
  /** RegularExpression Id. */
  int SPEC_AMPERSAND = 37;
  /** RegularExpression Id. */
  int SPEC_MINUS = 38;
  /** RegularExpression Id. */
  int SPEC_PLUS = 39;
  /** RegularExpression Id. */
  int SPEC_BAR = 40;
  /** RegularExpression Id. */
  int SPEC_SLASH = 41;
  /** RegularExpression Id. */
  int SPEC_COLON = 42;
  /** RegularExpression Id. */
  int SPEC_SEMICOLON = 43;
  /** RegularExpression Id. */
  int SPEC_ASTERIX = 44;
  /** RegularExpression Id. */
  int SPEC_QUESTION = 45;
  /** RegularExpression Id. */
  int SPEC_LESSTHAN = 46;
  /** RegularExpression Id. */
  int SPEC_GREATERTHAN = 47;
  /** RegularExpression Id. */
  int SPEC_DOT = 48;
  /** RegularExpression Id. */
  int SPEC_COMMA = 49;
  /** RegularExpression Id. */
  int SPEC_SQUOTE = 50;
  /** RegularExpression Id. */
  int SPEC_LPAREN = 51;
  /** RegularExpression Id. */
  int SPEC_RPAREN = 52;
  /** RegularExpression Id. */
  int SPEC_LBRACKET = 53;
  /** RegularExpression Id. */
  int SPEC_RBRACKET = 54;
  /** RegularExpression Id. */
  int SPEC_lCURLY = 55;
  /** RegularExpression Id. */
  int SPEC_RCURLY = 56;
  /** RegularExpression Id. */
  int SPEC_DOUBLEPLUS = 57;
  /** RegularExpression Id. */
  int SPEC_DOUBLEMINUS = 58;
  /** RegularExpression Id. */
  int SPEC_SHIFTLEFT = 59;
  /** RegularExpression Id. */
  int SPEC_SHIFTRIGHT = 60;
  /** RegularExpression Id. */
  int SPEC_lOE = 61;
  /** RegularExpression Id. */
  int SPEC_GOE = 62;
  /** RegularExpression Id. */
  int SPEC_PLUSEQUALS = 63;
  /** RegularExpression Id. */
  int SPEC_MINUSEQUALS = 64;
  /** RegularExpression Id. */
  int SPEC_MULTEQUALS = 65;
  /** RegularExpression Id. */
  int SPEC_DIVIDEEQUALS = 66;
  /** RegularExpression Id. */
  int SPEC_EQUALEQUALS = 67;
  /** RegularExpression Id. */
  int SPEC_BAREQUALS = 68;
  /** RegularExpression Id. */
  int SPEC_PERCENTEQUALS = 69;
  /** RegularExpression Id. */
  int SPEC_AMPERSANDEQUALS = 70;
  /** RegularExpression Id. */
  int SPEC_CARROTEQUALS = 71;
  /** RegularExpression Id. */
  int SPEC_OREQUALS = 72;
  /** RegularExpression Id. */
  int SPEC_ANDEQUALS = 73;
  /** RegularExpression Id. */
  int SPEC_NOTEQUAL = 74;
  /** RegularExpression Id. */
  int SPEC_SHIFTLEFTEQUALS = 75;
  /** RegularExpression Id. */
  int SPEC_SHIFTRIGHTEQUALS = 76;
  /** RegularExpression Id. */
  int SPEC_QUOTE = 77;
  /** RegularExpression Id. */
  int SPEC_EQUALS = 78;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int PREPROCESSOR_OUTPUT = 1;
  /** Lexical state. */
  int INSIDE_COMMENT = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<IGNORE>",
    "\"#\"",
    "<token of kind 3>",
    "\"\\n\"",
    "\"\\\\\\n\"",
    "\"\\\\\\r\\n\"",
    "<token of kind 7>",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 10>",
    "<ASSIGNMENT_STATEMENT>",
    "<EXPRESSION>",
    "<MULT_COMMENT>",
    "<MATH_SYMBOL>",
    "<RESERVED>",
    "<STRING>",
    "<INTEGER>",
    "<REAL>",
    "<CHAR>",
    "<IDENTIFIER>",
    "<UPPER>",
    "<DIGITS>",
    "<LOWER>",
    "<LETTER>",
    "<DIGIT>",
    "<DECIMAL>",
    "<OCTAL>",
    "<HEXIDECIMAL>",
    "<NODEC>",
    "<NOEXP>",
    "<BOTH>",
    "\"~\"",
    "\"!\"",
    "\"@\"",
    "\"%\"",
    "\"^\"",
    "\"&\"",
    "\"-\"",
    "\"+\"",
    "\"|\"",
    "\"/\"",
    "\":\"",
    "\";\"",
    "\"*\"",
    "\"?\"",
    "\"<\"",
    "\">\"",
    "\".\"",
    "\",\"",
    "\"\\\'\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"{\"",
    "\"}\"",
    "\"++\"",
    "\"--\"",
    "\"<<\"",
    "\" >>\"",
    "\"<=\"",
    "\">=\"",
    "\"+=\"",
    "\"-=\"",
    "\"*=\"",
    "\"/=\"",
    "\"==\"",
    "\"|=\"",
    "\"%=\"",
    "\"&=\"",
    "\"^=\"",
    "\"||\"",
    "\"&&\"",
    "\"!=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"\\\"\"",
    "\"=\"",
  };

}
