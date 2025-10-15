package org.jfrog.build.api.builder;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jfrog.build.api.release.PromotionStatus;

/* loaded from: classes8.dex */
public class PromotionStatusBuilder {
    public String ciUser;
    public String comment;
    public String repository;
    public String status;
    public String timestamp;
    public String user;

    public PromotionStatusBuilder(String str) {
        this.status = str;
    }

    public PromotionStatusBuilder comment(String str) {
        this.comment = str;
        return this;
    }

    public PromotionStatusBuilder repository(String str) {
        this.repository = str;
        return this;
    }

    public PromotionStatusBuilder timestamp(String str) {
        this.timestamp = str;
        return this;
    }

    public PromotionStatusBuilder timestampDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Cannot format a null date.");
        }
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        return this;
    }

    public PromotionStatusBuilder user(String str) {
        this.user = str;
        return this;
    }

    public PromotionStatusBuilder ciUser(String str) {
        this.ciUser = str;
        return this;
    }

    public PromotionStatus build() {
        String str = this.status;
        if (str == null) {
            throw new IllegalArgumentException("Status must have a type.");
        }
        String str2 = this.timestamp;
        if (str2 == null) {
            throw new IllegalArgumentException("Status must have a timestamp.");
        }
        return new PromotionStatus(str, this.comment, this.repository, str2, this.user, this.ciUser);
    }
}
