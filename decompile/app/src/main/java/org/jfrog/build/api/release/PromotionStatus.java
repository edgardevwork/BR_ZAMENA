package org.jfrog.build.api.release;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes7.dex */
public class PromotionStatus implements Serializable {
    public static final String RELEASED = "Released";
    public String ciUser;
    public String comment;
    public String repository;
    public String status;
    public String timestamp;
    public String user;

    public PromotionStatus() {
    }

    public PromotionStatus(String str, String str2, String str3, String str4, String str5, String str6) {
        this.status = str;
        this.comment = str2;
        this.repository = str3;
        this.timestamp = str4;
        this.user = str5;
        this.ciUser = str6;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getRepository() {
        return this.repository;
    }

    public void setRepository(String str) {
        this.repository = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Date getTimestampDate() {
        if (this.timestamp == null) {
            throw new IllegalArgumentException("Cannot parse a null timestamp as a date");
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(this.timestamp);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTimestampDate(Date date) {
        setTimestamp(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date));
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String getCiUser() {
        return this.ciUser;
    }

    public void setCiUser(String str) {
        this.ciUser = str;
    }
}
