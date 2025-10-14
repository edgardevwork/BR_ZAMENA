package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes7.dex */
final class zzk implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zza(context, str);
        int i = 1;
        int iZzb = iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = iZzb;
        int i2 = selectionResult.localVersion;
        if (i2 == 0) {
            i2 = 0;
            if (iZzb == 0) {
                i = 0;
            } else if (iZzb < i2) {
                i = -1;
            }
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
