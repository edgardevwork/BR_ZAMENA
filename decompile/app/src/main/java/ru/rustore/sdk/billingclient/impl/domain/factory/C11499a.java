package ru.rustore.sdk.billingclient.impl.domain.factory;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.media3.common.C2732C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11447b;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11448c;
import ru.rustore.sdk.billingclient.impl.data.provider.C11459c;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.factory.a */
/* loaded from: classes5.dex */
public final class C11499a {

    /* renamed from: a */
    public final C11459c f10468a;

    /* renamed from: b */
    public final Context f10469b;

    public C11499a(C11459c cryptoProvider, Context context) {
        Intrinsics.checkNotNullParameter(cryptoProvider, "cryptoProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10468a = cryptoProvider;
        this.f10469b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m7464a() throws NoSuchAlgorithmException {
        Signature[] apkContentsSigners;
        Context context = this.f10469b;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), C2732C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (signingInfo == null) {
                apkContentsSigners = new Signature[0];
            } else {
                apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "{\n            val signin…y\n            }\n        }");
            }
        } else {
            apkContentsSigners = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (apkContentsSigners == null) {
            }
        }
        ArrayList arrayList = new ArrayList(apkContentsSigners.length);
        for (Signature signature : apkContentsSigners) {
            C11459c c11459c = this.f10468a;
            byte[] content = signature.toByteArray();
            Intrinsics.checkNotNullExpressionValue(content, "it.toByteArray()");
            c11459c.getClass();
            Intrinsics.checkNotNullParameter(content, "content");
            C11448c c11448c = c11459c.f10249b;
            c11459c.f10248a.getClass();
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter("SHA-256", "algorithm");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(content);
            byte[] hash = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(hash, "getInstance(algorithm)\n …) }\n            .digest()");
            c11448c.getClass();
            Intrinsics.checkNotNullParameter(hash, "hash");
            arrayList.add(ArraysKt___ArraysKt.joinToString$default(hash, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C11447b.f10235a, 30, (Object) null));
        }
        return arrayList;
    }
}
