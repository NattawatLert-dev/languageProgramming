import java.util.Stack;

public class A01stacks {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remoe from the top

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("BorderIands");
        stack.push("FFVII");

        String myFavGame = stack.pop();
        System.out.println(stack.peek()); // Top of Stack

        System.out.println(stack.search("BorderIands"));
        System.out.println(stack);
        System.out.println(myFavGame);

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

    }
}
