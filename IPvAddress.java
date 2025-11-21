// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

 

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"

public class IPvAddress{
    public static void main(String[] args){
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}