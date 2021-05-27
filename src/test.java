import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import  org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class test {



    public  static  void  main(String[] args) throws Exception
    {
        String inputFile = "t.expr";

        FileInputStream is = new FileInputStream(inputFile);// Read the input from is inputFile

        ANTLRInputStream input = new ANTLRInputStream(is);    //ANTLR_input to read from is file

        CLexer lexer = new CLexer(input);   // Converting this input into lexemes

        CommonTokenStream tokens = new CommonTokenStream(lexer); //Getting tokens from lexemes

        CParser parser = new CParser(tokens);  // Make parser use these tokens

        ParseTree tree= parser.arrayint(); // begin parsing at int rule (traverse tree from parser)
        //choosing arrayint to make the grammar starts from it

        //System.out.println(tree.toStringTree(parser));  // print LISP-style tree


        ParseTreeWalker parseTreeWalker = new ParseTreeWalker(); //traverse over this tree
        parseTreeWalker.walk(new UnicodeTranslator(), tree);

    }
}
