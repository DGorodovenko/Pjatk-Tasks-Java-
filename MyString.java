package horodovenko;

public
    class MyString {

    private String str;

    public MyString(){
        this.str = new String();
    }

    public MyString(String str){
        this.str = str;
    }

    public int getLength(){
        return str.length();
    }

    public char getChar(int n){
        if( n < 0 || n >= str.length())
            throw new IllegalArgumentException();

        return str.charAt(n);
    }

    public void append(String s){
        str += s;
    }

    public void append(int rep, String s){
        for (int i=0; i < rep; i++)
            append(s);
    }

    public void prepend(String s){
        str = s + str;
    }

    public void insert(int pos, String s){
        if( pos < 0 || pos >= str.length())
            throw new IllegalArgumentException();

        String tmp1 = str.substring( 0, pos);
        String tmp2 = str.substring( pos);
        str = tmp1 + s + tmp2;
    }

    public void reset(String s){
        str = s;
    }

    @Override
    public String toString() {
        return str;
    }
}
