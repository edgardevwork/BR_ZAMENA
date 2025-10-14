package com.google.common.p024io;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ElementTypesAreNonnullByDefault
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
/* loaded from: classes7.dex */
public @interface IgnoreJRERequirement {
}
