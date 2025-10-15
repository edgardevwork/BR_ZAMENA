package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

@Beta
@GwtCompatible
/* loaded from: classes8.dex */
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY(PublicSuffixDatabase.EXCEPTION_MARKER, '?');

    public final char innerNodeCode;
    public final char leafNodeCode;

    PublicSuffixType(char innerNodeCode, char leafNodeCode) {
        this.innerNodeCode = innerNodeCode;
        this.leafNodeCode = leafNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public static PublicSuffixType fromCode(char code) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == code || publicSuffixType.getLeafNodeCode() == code) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + code);
    }
}
