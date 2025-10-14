package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m7105d2 = {"Lio/appmetrica/analytics/impl/K6;", "Lio/appmetrica/analytics/impl/J6;", "Landroid/content/Context;", "context", "", "simpleName", "Ljava/io/File;", "a", "Lio/appmetrica/analytics/impl/bg;", "Lio/appmetrica/analytics/impl/bg;", "relativePathFormer", SegmentConstantPool.INITSTRING, "(Lio/appmetrica/analytics/impl/bg;)V", "analytics_binaryProdRelease"}, m7106k = 1, m7107mv = {1, 6, 0})
/* renamed from: io.appmetrica.analytics.impl.K6 */
/* loaded from: classes6.dex */
public final class C9014K6 implements InterfaceC8990J6 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC9432bg relativePathFormer;

    public C9014K6(@NotNull InterfaceC9432bg interfaceC9432bg) {
        this.relativePathFormer = interfaceC9432bg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8990J6
    @NotNull
    /* renamed from: a */
    public File mo5298a(@NotNull Context context, @NotNull String simpleName) {
        return new File(context.getNoBackupFilesDir(), this.relativePathFormer.mo5140a(simpleName));
    }
}
