package busines;

import busines.user.Address;
import busines.user.User;

public class Main {
    public  static void main (String[] agrs){

        User user1 = new User();
        user1.setId(1);
        user1.setName("henrique");
        user1.setPassword("s1");

        Address end1 = new Address();
        end1.setDistrict("goias");
        end1.setNumber(22);
        end1.setStreet("v");

        user1.setAddress(end1);

        if (user1.getAddress()!= null){
            System.out.println("id:" + user1.getId() );
        }
         System.out.println("name:"+user1.getName());
        System.out.println("password:"+user1.getPassword());

    }

}
