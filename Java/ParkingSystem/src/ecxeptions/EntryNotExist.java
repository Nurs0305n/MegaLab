package ecxeptions;

public class EntryNotExist extends RuntimeException {
    public EntryNotExist() {
        super("Entry not exist");
    }
}
