class LogicalOperators {

    public static void main(String[] args) {

        // '&&' Operator 
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 > 3) && (8 < 5));

        // '||' Operator 
        System.out.println((5 < 3) || (8 > 5));
        System.out.println((5 > 3) || (8 < 5));
        System.out.println((5 < 3) || (8 < 5));

        // '!' Operator
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));

    }

}
