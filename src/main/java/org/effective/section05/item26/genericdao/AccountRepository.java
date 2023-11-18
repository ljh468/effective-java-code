package org.effective.section05.item26.genericdao;

public class AccountRepository extends GenericRepository<Account> {

  // 필요없어짐
  //  private Set<Account> accounts;
  //
  //  public AccountRepository() {
  //    this.accounts = new HashSet<>();
  //  }
  //
  //  public Optional<Account> findById(Long id) {
  //    return accounts.stream()
  //                   .filter(a -> a.getId()
  //                                 .equals(id))
  //                   .findAny();
  //  }
  //
  //  public void add(Account account) {
  //    this.accounts.add(account);
  //  }
}

