package com.thoughtworks.xstream.security;

/* loaded from: classes7.dex */
public class ForbiddenClassException extends AbstractSecurityException {
    public ForbiddenClassException(Class cls) {
        super(cls == null ? "null" : cls.getName());
    }
}
