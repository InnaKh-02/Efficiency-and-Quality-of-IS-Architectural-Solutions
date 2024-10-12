package org.example;

public class StorageFactory {
    public static Storage getStorage (String storageType){
        switch(storageType.toLowerCase()){
            case "local":
                return new LocalStorage();
            case "amazon_s3":
                return new AmazonS3Storage();
            default:
                throw new IllegalArgumentException("Illegal storage type");
        }
    }
}
