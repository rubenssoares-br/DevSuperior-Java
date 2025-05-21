package entities;

public class Bill {

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        double cover = 0;
        if (feeding() <= 30) {
            cover = 4;
        } else {
            cover = 0;
        }
        return cover;
    }

    public double feeding() {
        double feeding = beer + barbecue + softDrink;

        return feeding;
    }

    public double ticket() {
        double ticket = 0;

        if (gender == 'F') {
            ticket = 8;
        } else {
            ticket = 10;
        }

        return ticket;
    }

    public double total() {
        double total = feeding() + cover() + ticket();

        return total;
    }

    @Override
    public String
    toString() {
        if (cover() > 0) {
            return "\nREPORT: \n" +
                    String.format("Feeding = R$ %.2f%n", feeding()) +
                    String.format("Cover = R$ %.2f%n", cover()) +
                    String.format("Ticket = R$ %.2f%n", ticket()) +
                    String.format("%nAmount to pay = R$ %.2f%n", total());
        } else {
            return "\nREPORT: \n" +
                    String.format("Feeding = R$ %.2f%n", feeding()) +
                    "Exempt from cover\n" +
                    String.format("Ticket = R$ %.2f%n", ticket()) +
                    String.format("%nAmount to pay = R$ %.2f%n", total());
        }
    }
}
