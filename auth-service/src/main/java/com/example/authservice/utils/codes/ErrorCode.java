package com.example.authservice.utils.codes;

public enum ErrorCode {
    SYSTEM_ERROR,
    AUTH_ERROR,
    ACCESS_DENIED,
    UNIQUE_RESOURCE_CONFLICT,
    RESOURCE_NOT_FOUND,
    INVALID_ARGUMENT,
    INVALID_TOKEN,
    INVALID_RESET_CODE,
    INVALID_PASSWORD_FORMAT,
    INVALID_EMAIL_FORMAT,
    INVALID_USERNAME_FORMAT,
    EXPIRED_RESET_CODE,
    EXPIRED_TOKEN,
    EMPTY_CODE,
    FILE_NOT_FOUND,
    TOO_LARGE_FILE_SIZE,
    REQUIRED_PARAMS_NOT_FOUND,
    ALREADY_EXISTS,
    ALREADY_REQUESTED,
    NOT_ALLOWED,
    PASSWORDS_MISMATCH
}