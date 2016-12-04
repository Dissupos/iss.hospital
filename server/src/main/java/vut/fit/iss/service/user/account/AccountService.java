package vut.fit.iss.service.user.account;

import org.springframework.transaction.annotation.Transactional;
import vut.fit.iss.domain.user.account.Account;

import java.util.Collection;
import java.util.Optional;

public interface AccountService {

    @Transactional(readOnly = true)
    Optional<Account> getUserByUserName(String userName);

    @Transactional(readOnly = true)
    Optional<Account> getUserByID(Long id);

    @Transactional(readOnly = true)
    Collection<Account> getAllAccounts();

    @Transactional
    Account persist(Account account);

    @Transactional(readOnly = true)
    Account getOrCreate(String login, String password);
}
