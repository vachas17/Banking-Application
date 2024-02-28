package net.javaguides.bankingapp.mapper;

import net.javaguides.bankingapp.dto.AccountDto;
import net.javaguides.bankingapp.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
         Account account= new Account(
                 accountDto.getId(),
                 accountDto.getAccountHolderName(),
                 accountDto.getBalance()
         );
         return account;
    }
    public static AccountDto mapToaccountDto(Account account){
        AccountDto accountDto= new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
