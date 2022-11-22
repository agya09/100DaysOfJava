class Bank {
    int interest() {
        return 0;
    }
}

class Siddartha extends Bank {
    int interest() {
        return 9;
    }
}

class NIC extends Bank {
    int interest() {
        return 11;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Siddartha sid = new Siddartha();
        NIC nic = new NIC();
        System.out.println("Interest in Siddartha Bank is: " + sid.interest());
        System.out.println("Interest in NIC Bank is:  " + nic.interest());
    }

}
