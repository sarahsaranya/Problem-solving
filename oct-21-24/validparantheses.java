import java.util.*;

class validparantheses {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            Stack<Character> st = new Stack<Character>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) {
                        System.out.println("false");
                        return;
                    }
                    char u = st.peek();
                    if ((c == ']' && u == '[') || (c == '}' && u == '{') || (c == ')' && u == '(')) {
                        st.pop();
                    } else {
                        System.out.println("false");
                        return;
                    }

                }
            }
            if (st.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
