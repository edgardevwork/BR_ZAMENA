package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzz extends zzal {
    private final zzl zzk;

    @VisibleForTesting
    private final Map<String, zzal> zzl;

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(OBRXMLParser.RequireHandler.REQUIRE, 1, list);
        String strZzf = zzhVar.zza(list.get(0)).zzf();
        if (this.zzl.containsKey(strZzf)) {
            return this.zzl.get(strZzf);
        }
        zzaq zzaqVarZza = this.zzk.zza(strZzf);
        if (zzaqVarZza instanceof zzal) {
            this.zzl.put(strZzf, (zzal) zzaqVarZza);
        }
        return zzaqVarZza;
    }

    public zzz(zzl zzlVar) {
        super(OBRXMLParser.RequireHandler.REQUIRE);
        this.zzl = new HashMap();
        this.zzk = zzlVar;
    }
}
