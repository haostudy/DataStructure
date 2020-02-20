package Test.MatchBracket;

import java.util.Stack;

public class BracketMatch {
    public boolean matching(String expression){
        if (expression==null || expression==""){
            System.out.println("表达式为空或没有输入表达式");
        }
        Stack<Character> stack = new Stack<Character>();

        for (int index = 0; index <expression.length() ; index++){
            switch (expression.charAt(index)){
                case '(':
                    stack.push(expression.charAt(index));
                    break;
                case '{':
                    stack.push(expression.charAt(index));
                    break;
                case '[':
                    stack.push(expression.charAt(index));
                    break;
                case ')':
                    if (stack.empty() || stack.peek()!='('){
                        return false;
                    }else stack.pop();
                    break;
                case '}':
                    if (stack.empty() || stack.peek()!='{'){
                        return false;
                    }else stack.pop();
                    break;
                case ']':
                    if (stack.empty() || stack.peek()!='['){
                        return false;
                    }else stack.pop();
                    break;
            }
        }
        if (stack.empty())return true;
        return false;

    }

    public static void main(String[] args) {
        String expression = "{}{[()]}";
        BracketMatch bracketMatch = new BracketMatch();
        System.out.println(bracketMatch.matching(expression));
    }
}
