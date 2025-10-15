package org.apache.http;

/* loaded from: classes7.dex */
public interface Header extends NameValuePair {
    HeaderElement[] getElements() throws ParseException;
}
