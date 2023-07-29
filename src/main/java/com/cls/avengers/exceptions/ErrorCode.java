package com.cls.avengers.exceptions;

/**
 * ErrorCode enums, use for creating exception with error code
 */
public enum ErrorCode {

    /** Bad request */
    BAD_REQUEST,

    /** Conflict */
    CONFLICT,

    /** Customer already exists */
    CUSTOMER_ALREADY_EXISTS,

    /** Invalid model */
    INVALID_MODEL,

    /** Item already exists */
    ITEM_ALREADY_EXISTS,

    /** Not found */
    NOT_FOUND,

    /** Order already exists */
    ORDER_ALREADY_EXISTS,

    /** Order item already exists */
    ORDER_ITEM_ALREADY_EXISTS,

    /** Staff already exists */
    STAFF_ALREADY_EXISTS,

    /** Store already exists */
    STORE_ALREADY_EXISTS;
}
