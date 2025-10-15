package ru.rustore.sdk.core.util;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import kotlin.Metadata;

/* compiled from: PrimitivesExtension.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"safeToInt", "", "", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class PrimitivesExtensionKt {
    public static final int safeToInt(long j) {
        if (ParserMinimalBase.MIN_INT_L > j || j > ParserMinimalBase.MAX_INT_L) {
            return 0;
        }
        return (int) j;
    }
}
