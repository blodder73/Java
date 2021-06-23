package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        BankAccount elmiraAccount = new BankAccount(67890, 333, "Elmira", "elmira@gmail.com", "+31 6 123456");
        System.out.println(elmiraAccount.getAccountNumber());
        System.out.println(elmiraAccount.getName());
        System.out.println(elmiraAccount.getBalance());
        System.out.println(elmiraAccount.getEmail());
        System.out.println(elmiraAccount.getPhone());

        BankAccount newAccount = new BankAccount();
        System.out.println(newAccount.getAccountNumber());
        System.out.println(newAccount.getName());
        System.out.println(newAccount.getBalance());
        System.out.println(newAccount.getEmail());
        System.out.println(newAccount.getPhone());

        account.setName("Buddy Lodder");
        account.setAccountNumber(12345);
        account.setBalance(2000);
        account.setEmail("b.lodder@outlook.com");
        account.setPhone("+31 6 41508488");

        System.out.println(account.getAccountNumber());
        System.out.println(account.getName());
        System.out.println(account.getBalance());
        System.out.println(account.getEmail());
        System.out.println(account.getPhone());

        account.depositFunds(500);
        System.out.println(account.getBalance());
        account.withdrawFunds(2500.01);
        System.out.println(account.getBalance());
        account.withdrawFunds(500.01);
        System.out.println(account.getBalance());

        BankAccount marcoAccount = new BankAccount("Marco", "marco@gmail.com", "+31 6 74678489");
        System.out.println(marcoAccount.getAccountNumber() + " " + marcoAccount.getBalance());

        VipCustomer buddyVipCustomer = new VipCustomer();
        System.out.println(buddyVipCustomer.getCreditLimit());

        VipCustomer defaultVip = new VipCustomer("Henk", "appje@gamil.com");
        System.out.println(defaultVip.getName() + " " + defaultVip.getEmailAddress() + " " + defaultVip.getCreditLimit() );

        VipCustomer dairVip = new VipCustomer("Dair", 11.50, "dair@vkontakte.ru");
        System.out.println(dairVip.getName() + " " + dairVip.getEmailAddress() + " " + dairVip.getCreditLimit());
    }
}
