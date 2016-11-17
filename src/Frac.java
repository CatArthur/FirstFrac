public class Frac {
    int a;
    int b;

    String toStr(){
        return a+"/"+b;
    }
    Frac (int d,int c){
        a=d;
        b=c;
    }
    Frac sum(Frac v) {
        return new Frac(a * v.b+v.a*b,b*v.b);
    }
    Frac sum(int v) {
        return new Frac(a+v*b,b);
    }
    Frac mult(Frac v) {
        return new Frac(a * v.a,b*v.b);
    }
    Frac mult(int v) {
        return new Frac(a * v,b);
    }
    Frac div(Frac v) {
        return new Frac(a*v.b,b*v.a);
    }
    Frac div(int v) {
        return new Frac(a,v*b);
    }
    Frac inverse() {
        return new Frac(b,a);
    }
    boolean isDenumeratorZero() {
        return b==0;
    }
    boolean isShorten() {
        boolean d=false;
        for (int i = (a>b?b:a); i >1; i--) {
            d=b%i==0&&a%i==0;
            if(d) break;
        }
        return  d;
    }
    Frac shorting() {
        Frac d=new Frac(a,b);
        for (int i = (a>b?b:a); i >1; i--) {
            if(b%i==0&&a%i==0) {
                d= new Frac(a/i,b/i);
                break;
            }
        }
        a*=(b<0?-1:1);
        b*=(b<0?-1:1);
        return d;
    }
    boolean isEqual(Frac v) {
        return a/b==v.a/v.b;
    }
    int compareTo(Frac v) {
        return (a/b==v.a/v.b?0:(a/b>v.a/v.b?1:-1));
    }


}
