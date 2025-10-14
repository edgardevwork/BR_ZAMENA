package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.media3.common.C2732C;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jfrog.build.api.util.FileChecksumCalculator;

/* renamed from: io.appmetrica.analytics.impl.E3 */
/* loaded from: classes6.dex */
public final class C8864E3 {

    /* renamed from: a */
    public final Context f6518a;

    /* renamed from: b */
    public final C9755oe f6519b;

    /* renamed from: c */
    public final String f6520c;

    /* renamed from: d */
    public final SafePackageManager f6521d;

    public C8864E3(Context context, C9755oe c9755oe, String str, SafePackageManager safePackageManager) {
        this.f6518a = context;
        this.f6519b = c9755oe;
        this.f6520c = str;
        this.f6521d = safePackageManager;
    }

    /* renamed from: a */
    public final List m5095a() {
        Signature[] apkContentsSigners;
        String sha1;
        List<String> listM6601f = this.f6519b.m6601f();
        boolean zIsEmpty = listM6601f.isEmpty();
        List<String> list = listM6601f;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = this.f6521d.getPackageInfo(this.f6518a, this.f6520c, C2732C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f6521d.getPackageInfo(this.f6518a, this.f6520c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            sha1 = StringUtils.formatSha1(MessageDigest.getInstance(FileChecksumCalculator.SHA1_ALGORITHM).digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            sha1 = null;
                        }
                        if (sha1 != null) {
                            arrayList.add(sha1);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f6519b.m6595a(arrayList).m6648b();
                list = arrayList;
            }
        }
        return list;
    }
}
