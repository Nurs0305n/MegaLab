package db;

import models.Entry;

public interface EntryRepo extends DbHelper {

    EntryRepo INSTANCE = new db.impl.EntryRepo();
    Entry goOut(Entry entry);
}
