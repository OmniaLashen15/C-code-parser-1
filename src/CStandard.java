
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.FileInputStream;
import  org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class CStandard extends CBaseVisitor<String> {
    @Override
    public String visitGlobalORlocal(CParser.GlobalORlocalContext ctx) {

        String val = String.valueOf(ctx.GlobalOrLocal().toString());
        if (ctx.GlobalOrLocal().toString().equals("global")) {
            System.out.println("global");
        } else {
            System.out.println("local");
        }
        return val;

    }

    @Override
    public String visitStructORunion(CParser.StructORunionContext ctx) {
        String val = String.valueOf(ctx.structOrUnion().toString());
        if (ctx.structOrUnion().toString().equals("struct") && ctx.structOrUnion().toString().equals("([A-Z][a-z0-9]*_)+s")) {
            System.out.println("right struct");
        }
        else if (ctx.structOrUnion().toString().equals("union") && ctx.structOrUnion().toString().equals("([A-Z][a-z0-9]*_)+u")) {
            System.out.println("right union");
        }
        else {
            System.out.println("Please write the right formate");
        }
        return val;
    }
}