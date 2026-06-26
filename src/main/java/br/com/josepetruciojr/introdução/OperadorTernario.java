package br.com.josepetruciojr.introdução;

public class OperadorTernario {

    public static void main(String[] args) {

        double salary = 3000;
        String giveDonation = "Yes, send the donation";
        String notGiveDonation = "Don't send the donation";
        String result;
        //Type - variable = condition ?(if) true :(else) false
        String resultTernary = salary > 5000 ? giveDonation : notGiveDonation;

        if(salary > 5000){
            result = giveDonation;
        }
        else{
            result = notGiveDonation;
        }

        System.out.println("Can I send the donation?");
        System.out.println(result);
        System.out.println(resultTernary);
    }
}
