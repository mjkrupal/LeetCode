bool isValid(char* s) {
    int f=1;
    int size = strlen(s);
    char st[size];
    int top = -1;
    for (int i = 0; i < size; i++) {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
            st[++top] = s[i];
        } else if ((top!=-1)&& ((s[i] == ')' && st[top] == '(') ||
                   (s[i] == '}' && st[top] == '{') ||
                   (s[i] == ']' && st[top] == '['))) {
            top--;
        } else  {
            f=0;
            break;
        }
    }
    if (top != -1)
        f=0;
        return f;
}