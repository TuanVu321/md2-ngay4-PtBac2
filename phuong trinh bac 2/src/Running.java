public class Running {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.getter();
        double delta = quadraticEquation.getDiscriminant();
        if(delta>0){
            System.out.println("Phuong trinh co 2 nghiem la: "+quadraticEquation.getRoot1()+"va "+ quadraticEquation.getRoot2());
        }else{
            if(delta==0){
                System.out.println("Phuong trinh co nghiem la: "+ quadraticEquation.getRoot1());
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }

    }
}
