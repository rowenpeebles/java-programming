// Passing 'this' as an Argument

class Example5 {

    int x;
    int y;

    ThisExample(int x, int y) {
        
        this.x = x;
        this.y = y;
        
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        add(this);

        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

    }

    void add(ThisExample o) {

        o.x += 2;
        o.y += 2;

    }

}

class Example5 {

    public static void main(String[] args) {

        Thisexample obj = new ThisExample(1, -2);

    }

}
