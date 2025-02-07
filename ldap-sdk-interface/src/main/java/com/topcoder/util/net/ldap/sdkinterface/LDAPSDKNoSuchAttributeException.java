/*
 * TCS LDAP SDK Interface 1.0
 *
 * LDAPSDKNoSuchAttributeException.java
 *
 * Copyright (c) 2004, TopCoder Inc. All rights reserved.
 */
package com.topcoder.util.net.ldap.sdkinterface;

/**
 * <p>This exception is thrown when an attribute was not found.</p>
 * <p>It encapsulates the following LDAP result codes: </p>
 * <ul type="disc">
 *     <li>(16) NO_SUCH_ATTRIBUTE: The specified attribute could not be found.</li>
 * </ul>
 *
 * @author  cucu
 * @author  isv
 * @version 1.0 05/18/2004
 */
public class LDAPSDKNoSuchAttributeException extends LDAPSDKException {

    /**
     * Constructs new <code>LDAPSDKNoSuchAttributeException</code> with specified message and error code.
     *
     * @param message the error message.
     * @param code result code from the LDAP specification.
     */
    public LDAPSDKNoSuchAttributeException(String message, int code) {
        super(message, code);
    }

    /**
     * Constructs new <code>LDAPSDKNoSuchAttributeException</code> with specified message, error code and an original
     * exception thrown by the underlying LDAP implementation.
     *
     * @param message the error message.
     * @param code result code from the LDAP specification.
     * @param cause cause the exception that was caugth before throwing this one.
     */
    public LDAPSDKNoSuchAttributeException(String message, int code, Throwable cause) {
        super(message, code, cause);
    }
}
