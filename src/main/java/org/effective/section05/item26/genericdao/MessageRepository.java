package org.effective.section05.item26.genericdao;

public class MessageRepository extends GenericRepository<Message> {

  // 필요없어짐
//  private Set<Message> messages;
  //
  //  public MessageRepository() {
  //    this.messages = new HashSet<>();
  //  }
  //
  //  public Optional<Message> findById(Long id) {
  //    return messages.stream()
  //                   .filter(a -> a.getId()
  //                                 .equals(id))
  //                   .findAny();
  //  }
  //
  //  public void add(Message message) {
//    this.messages.add(message);
//  }
}
