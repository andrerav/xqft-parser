package nrEn;

import java.util.ArrayList;

public class State {

    public static int DEFAULT = 0;                      //anywhere but XML
    public static int IN_TAG = 1;                       // < HERE
    public static int IN_QUOT_ATTRIBUTE = 2;            // <tagname attribute="HERE
    public static int IN_APOS_ATTRIBUTE = 3;            // <tagname attribute='HERE
    public static int IN_ELEMENT = 4;                   // <tagname> HERE
    
    private ArrayList<Integer> stack;
    
    public State()
    {
        stack = new ArrayList<Integer>();
    }
    
    public int pop()
    {
        return stack.remove(0);
    }
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    public void pushState(int state)
    {
        stack.add(0, state);
    }
    
}
