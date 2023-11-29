public class Rational {

    private int num;
    private int denom;
    public Rational (int num, int denom)
    {
        this.num =num ;
        this.denom = denom;
    }
    public int getnum(){
        return num;
        }

    public int getdenom(){
        return denom;
    }

    public String toString(){
        return num + "/" + denom;
    }

    public void multi(Rational autrefraction){
        this.num = num*autrefraction.getnum();
        this.denom = denom*autrefraction.getdenom();
    }  
}

