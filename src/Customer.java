/**
 * Created by jiacontrerasp on 6/18/15.
 */
public class Customer {
    long creditCard;
    private String[] interests;
    String postalAddress;
    User user;


    public void addInterests(String[] interests) {
        this.interests = interests;
    }

    public void removeInterests(String[] interests) {
        this.interests = interests;
    }
}
