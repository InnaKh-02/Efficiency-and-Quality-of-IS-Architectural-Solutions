package org.example;

public class StorageManager {
    private static StorageManager instance;
    private Storage storage;
    private StorageManager(String storageType){
        this.storage = StorageFactory.getStorage(storageType);
    }
    public static synchronized StorageManager getInstance(String storageType){
        if(instance == null){
            return new StorageManager(storageType);
        }
        return instance;
    }
    public void saveFile(String fileName, String data) {
        storage.saveFile(fileName, data);
    }

    public String readFile(String fileName) {
        return storage.readFile(fileName);
    }
}
