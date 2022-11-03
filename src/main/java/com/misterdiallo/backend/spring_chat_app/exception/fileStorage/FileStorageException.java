package com.misterdiallo.backend.spring_chat_app.exception.fileStorage;

public class FileStorageException extends RuntimeException {

        public FileStorageException(String message) {
            super(message);
        }

        public FileStorageException(String message, Throwable cause) {
            super(message, cause);
        }

}
