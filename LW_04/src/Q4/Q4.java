package Q4;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Owner bikeOwner = new Owner("Sanju", "0771234567");
        Bicycle myBike = new Bicycle(bikeOwner);

        System.out.println("Bicycle Owner: " + myBike.getOwner().getOwnerName());
        System.out.println("Phone Number: " + myBike.getOwner().getPhoneNo());
    }
}