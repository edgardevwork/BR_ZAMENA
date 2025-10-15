package com.thoughtworks.xstream.core.util;

import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class Types {
    public static final Pattern lambdaPattern = Pattern.compile(".*\\$\\$Lambda\\$[0-9]+/.*");

    public static final boolean isLambdaType(Class<?> cls) {
        return cls != null && cls.isSynthetic() && lambdaPattern.matcher(cls.getSimpleName()).matches();
    }
}
