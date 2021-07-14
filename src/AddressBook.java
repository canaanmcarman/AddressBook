import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AddressBook {
    private String name, address, city, state, zip, phoneNumber, email;

    public AddressBook() {
        this.name = "";
        this.address = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.phoneNumber = "";
        this.email = "";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return this.state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getZip() {
        return this.zip;
    }
    public void setPhone(String phoneNumber) {
        if (isPhoneNumberValid(phoneNumber) == true) {
            this.phoneNumber = phoneNumber;
        }else {
            this.phoneNumber = "invalid phone number";
        }
    }
    public String getPhone() {
        return this.phoneNumber;
    }
    public void setEmail(String email) {
        if (isEmailValid(email) == true) {
            this.email = email;
        } else {
            this.email = "invalid email";
        }
    }
    public String getEmail() {
        return this.email;
    }



    private boolean isEmailValid(String email) {
        boolean isValid = false;
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }
    private boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}
