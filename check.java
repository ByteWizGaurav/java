class A {
    int x, y;
    A(){
        x = 23;
        y = 34;
    } 
    A(A obj){
        x = obj.x;
        y = obj.y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
class check {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(obj);
        obj.display();
        obj1.display();
    }
    
}


// 1,2,3,4,5,6,7,8
// 16