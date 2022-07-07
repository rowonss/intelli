package JAVA_Basic2.basic_23_인터페이스의장점예제;

interface repairable {
}

class groundunit extends unit {
    groundunit(int attpoint, int hp) {
        super(attpoint, hp);
    }

}

class airunit extends unit {
    airunit(int attpoint, int hp) {
        super(attpoint, hp);
    }
}

class unit {
    int attpoint;
    int hp;
    unit(int attpoint, int hp) {
        this.hp = hp;
    }
}

class tank extends groundunit implements repairable{
    tank(){
        super(20, 150);
    }
}

class marine extends groundunit{
    marine(){
        super(10,50);
    }
}

class scv extends groundunit implements  repairable{
    scv(){
        super(5, 50);
    }

    void repair(repairable unit){
        unit u = (unit) unit;
        u.hp += 10;
    }
}
