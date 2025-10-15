package org.jfrog.build.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes7.dex */
public class ItemLastModified {
    public String lastModified;
    public String uri;

    public ItemLastModified() {
    }

    public ItemLastModified(String str, String str2) {
        this.uri = str;
        this.lastModified = str2;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public long getLastModified() throws ParseException {
        return getLastModified(this.lastModified);
    }

    public void setLastModified(String str) {
        this.lastModified = str;
    }

    public String toString() {
        return "uri: " + this.uri + "\nlastModified:" + this.lastModified;
    }

    public final long getLastModified(String str) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(str).getTime();
    }
}
